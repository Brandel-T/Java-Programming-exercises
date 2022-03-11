public class Winter{
 
	int day = 0;
	 
	Vole vole = new Vole();
	 
	Flower flower1 = new Flower();
	Flower flower2 = new Flower();
	Flower flower3 = new Flower();
	Flower flower4 = new Flower();
	Flower flower5 = new Flower();
	 
	public void oneDayPasses(){
		day++;
	}
	void random() {
		
		if(vole.state == vole.SLEEP){
			int chance = (int) (Math.random() * 10 + 1);
			
			//System.out.println("RandomNumber: " + chance);
			
			if(chance == 1) {
				vole.isHungry();
			}
		}
	}
}