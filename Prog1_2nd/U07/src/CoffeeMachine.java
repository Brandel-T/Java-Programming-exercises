
public class CoffeeMachine {

	double water ; //water hopper
	double w;	   //maximal capacity of water container in Milliliter
	double beans;  //coffee beans hopper
	double k ;     //maximal capacity of the coffee beans container 
	int produced;  //produced Coffee Cup(s)
	 
	CoffeeMachine(double k, double w) {
		this.water = 0.0;
		this.beans = 0.0;
		this.k = k;
		this.w = w;
		this.produced = 0;
	}
	
	void fillCoffee() {
		beans = k;
		System.out.println("Coffee bean hopper full");
	}
	
	void fillWater() {
		water = w;
		System.out.println("Water hopper full");
	}
	
	void brew() {
		if (produced >= 12)
			System.out.println("Machine must be cleaned. . . ");
		else if ( beans < 7.5) 
			System.out.println("Not enough coffee. . . ");
		else if ( water < 150 ) 
			System.out.println("Not enough water. . . ");
		else 
		{
			System.out.println("Brewing. . .");
			water -= 150.0;
			beans -= 7.5;
			++produced;	
			System.out.println("Brewing terminated");		
		}
	}
	
	void clean() {
		System.out.println("Cleaning. . . ");
		produced = 0;
//		this.fillCoffee();
//		this.fillWater();
		System.out.println("Cleaning terminated");
	}
	
	void getState() {
		System.out.println("Coffee: " + beans + " Gramm");
		System.out.println("Water: " + water + " Milliliter");
		System.out.println("Produced cup(s): " + produced);
		System.out.println("Remaining cups(s): " + (12-produced));
	} 
}