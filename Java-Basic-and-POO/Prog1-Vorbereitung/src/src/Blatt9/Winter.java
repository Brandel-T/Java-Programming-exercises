package Blatt9;

public class Winter {

	int day;
	Flower flower1;
	Flower flower2;
	Flower flower3;
	Flower flower4;
	Flower flower5;
	Vole vole;
	
	public Winter() {
		day = 1;
		flower1 = new Flower();
		flower2 = new Flower();
		flower3 = new Flower();
		flower4 = new Flower();
		flower5 = new Flower();
		vole = new Vole();
	}
	
	public void oneDayPasses() {
		day++;
	}
	
}
