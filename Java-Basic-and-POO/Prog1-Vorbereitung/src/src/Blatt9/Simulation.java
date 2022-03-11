package Blatt9;

public class Simulation {

	public static void main(String[] args) {   
		Winter w = new Winter( );
		
		int d = 1; //day
		int hungry = 0;
		
		while( d <= 20 ) 
		{
			System.out.println("------------------------");
			System.out.printf("This is day %d%n", w.day);
			
			w.flower1.isGrowing();
			w.flower2.isGrowing();
			w.flower3.isGrowing();
			w.flower4.isGrowing();
			w.flower5.isGrowing();
 
			hungry = (int)( Math.random()*11 ) ; 
			if (hungry == 1)
			{
				w.vole.isHungry(); 
//				System.out.println("hungry = " + hungry + "===============================================");
//				System.out.println("state = " + w.vole.getState() + "<<<<<<<<<<<<<<<<<<<<<");
				if ( w.flower1.getState() != 3 ) {					
					w.flower1.wasEaten();
					w.vole.isFedUp();
					System.out.print("Flower1 ");
					w.flower1.printStatus(); 
					System.out.print("Flower2 ");
					w.flower2.printStatus();
					System.out.println(", size: " + w.flower2.getSize());
					System.out.print("Flower3 ");
					w.flower3.printStatus();
					System.out.println(", size: " + w.flower3.getSize());
					System.out.print("Flower4 ");
					w.flower4.printStatus();
					System.out.println(", size: " + w.flower4.getSize());
					System.out.print("Flower5 ");
					w.flower5.printStatus();
					System.out.println(", size: " + w.flower5.getSize()); 
					
				} 
				else if ( w.flower2.getState() != 3) {
					w.flower2.wasEaten(); 
					w.vole.isFedUp();
					System.out.print("Flower1 ");
					w.flower1.printStatus();
					System.out.println(", size: " + w.flower1.getSize());
					System.out.print("Flower2 ");
					w.flower2.printStatus(); 
					System.out.print("Flower3 ");
					w.flower3.printStatus();
					System.out.println(", size: " + w.flower3.getSize());
					System.out.print("Flower4 ");
					w.flower4.printStatus();
					System.out.println(", size: " + w.flower4.getSize());
					System.out.print("Flower5 ");
					w.flower5.printStatus();
					System.out.println(", size: " + w.flower5.getSize());
					
				} 
				else if ( w.flower3.getState() != 3 ) {
					w.flower3.wasEaten();
					w.vole.isFedUp();
					System.out.print("Flower1 ");
					w.flower1.printStatus();
					System.out.println(", size: " + w.flower1.getSize());
					System.out.print("Flower2 ");
					w.flower2.printStatus();
					System.out.println(", size: " + w.flower2.getSize());
					System.out.print("Flower3 ");
					w.flower3.printStatus(); 
					System.out.print("Flower4 ");
					w.flower4.printStatus();
					System.out.println(", size: " + w.flower4.getSize());
					System.out.print("Flower5 ");
					w.flower5.printStatus();
					System.out.println(", size: " + w.flower5.getSize());
					
				} 
				else if ( w.flower4.getState() != 3 ) {
					w.flower4.wasEaten(); 
					w.vole.isFedUp();
					System.out.print("Flower1 ");
					w.flower1.printStatus();
					System.out.println(", size: " + w.flower1.getSize());
					System.out.print("Flower2 ");
					w.flower2.printStatus();
					System.out.println(", size: " + w.flower2.getSize());
					System.out.print("Flower3 ");
					w.flower3.printStatus();
					System.out.println(", size: " + w.flower3.getSize());
					System.out.print("Flower4 ");
					w.flower4.printStatus(); 
					System.out.print("Flower5 ");
					w.flower5.printStatus();
					System.out.println(", size: " + w.flower5.getSize());
					
				} 
				else if ( w.flower5.getState() != 3 ) {
					w.flower5.wasEaten(); 
					w.vole.isFedUp();
					System.out.print("Flower1 ");
					w.flower1.printStatus();
					System.out.println(", size: " + w.flower1.getSize());
					System.out.print("Flower2 ");
					w.flower2.printStatus();
					System.out.println(", size: " + w.flower2.getSize());
					System.out.print("Flower3 ");
					w.flower3.printStatus();
					System.out.println(", size: " + w.flower3.getSize());
					System.out.print("Flower4 ");
					w.flower4.printStatus();
					System.out.println(", size: " + w.flower4.getSize());
					System.out.print("Flower5 ");
					w.flower5.printStatus(); 
					
				} 
				else {
					w.vole.hasStarved();	
				}
			}
			else {
				System.out.print("Flower1 ");
				w.flower1.printStatus();
				System.out.println(", size: " + w.flower1.getSize());
				System.out.print("Flower2 ");
				w.flower2.printStatus();
				System.out.println(", size: " + w.flower2.getSize());
				System.out.print("Flower3 ");
				w.flower3.printStatus();
				System.out.println(", size: " + w.flower3.getSize());
				System.out.print("Flower4 ");
				w.flower4.printStatus();
				System.out.println(", size: " + w.flower4.getSize());
				System.out.print("Flower5 ");
				w.flower5.printStatus();
				System.out.println(", size: " + w.flower5.getSize()); 
				
				w.vole.isSleeping();
			}

			System.out.print("Vole ");
			w.vole.printstatus();			
			
			w.oneDayPasses();
			d++;
		}
	}
}
