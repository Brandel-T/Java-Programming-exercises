
public class Simulation {

	public static void main(String[] args) 
	{		
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		Flower f3 = new Flower();
		Flower f4 = new Flower();
		Flower f5 = new Flower();
		Vole vole = new Vole();
		
		Winter w = new Winter(f1, f2, f3, f4, f5, vole);
		int day = 1;
		int random = 1;
		for ( day = 1; day <= 20; day++ )
		{
			w.oneDayPasses();
			
			if ( w.flower1.getState() != w.flower1.EATEN )
				w.flower1.isGrowing();
			if ( w.flower2.getState() != w.flower2.EATEN )
				w.flower2.isGrowing();
			if ( w.flower3.getState() != w.flower3.EATEN )
				w.flower3.isGrowing();
			if ( w.flower4.getState() != w.flower4.EATEN )
				w.flower4.isGrowing();
			if ( w.flower5.getState() != w.flower5.EATEN )
				w.flower5.isGrowing();

			random = (int)(Math.random() * 10); // 10% == 10/100 == 1/10
			//System.out.println("random = " + random);
			if ( random == 1 )
				w.vole.isHungry();

			System.out.println("---------------------------");
			System.out.println("This is day " + w.day);
			
			System.out.print("Flower1 ");
			w.flower1.printStatus();
			if ( w.flower1.getState() != w.flower1.EATEN )
				System.out.println(", size: " + w.flower1.getSize()); 
			else System.out.println();
			
			System.out.print("Flower2 ");
			w.flower2.printStatus();
			if ( w.flower2.getState() != w.flower2.EATEN )
				System.out.println(", size: " + w.flower2.getSize()); 
			else System.out.println();
			
			System.out.print("Flower3 ");
			w.flower3.printStatus();
			if ( w.flower3.getState() != w.flower3.EATEN )
				System.out.println(", size: " + w.flower3.getSize());
			else System.out.println();
			
			System.out.print("Flower4 ");
			w.flower4.printStatus();
			if ( w.flower4.getState() != w.flower4.EATEN )
				System.out.println(", size: " + w.flower4.getSize());
			else System.out.println();
			
			System.out.print("Flower5 ");
			w.flower5.printStatus();
			if ( w.flower5.getState() != w.flower5.EATEN )
				System.out.println(", size: " + w.flower5.getSize());
			else System.out.println();
			
			System.out.print("Vole ");
			w.vole.printStatus();
			
			if ( w.vole.getState() == w.vole.HUNGRY )
			{
				if ( w.flower1.getState() != w.flower1.EATEN ) {
					w.flower1.wasEaten();
					w.vole.isFedUp();
				}
				else if ( w.flower2.getState() != w.flower2.EATEN ) {
					w.flower2.wasEaten();
					w.vole.isFedUp();
				}
				else if ( w.flower3.getState() != w.flower3.EATEN ) {
					w.flower3.wasEaten();
					w.vole.isFedUp();
				}
				else if ( w.flower4.getState() != w.flower4.EATEN ) {
					w.flower4.wasEaten();
					w.vole.isFedUp();
				}
				else if ( w.flower5.getState() != w.flower5.EATEN ) {
					w.flower5.wasEaten();
					w.vole.isFedUp();
				}
				else w.vole.hasStarved(); 
			} 
			else
				w.vole.isSleeping();
			
		} 
	}
}
