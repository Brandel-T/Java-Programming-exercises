
public class Simulation {

	public static void main(String[] args) 
	{		
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		Flower f3 = new Flower();
		Flower f4 = new Flower();
		Flower f5 = new Flower();
		Vole vole = new Vole();
		
		Winter w = new Winter(f1, f2, f3, f4, f5, vole, 22);
		int day = 1;
		//int random = 1;
		for ( day = 1; day <= w.getLength(); day++ )
		{
			w.oneDayPasses();
			
			if ( w.getFlower1().getState() != w.getFlower1().getEaten() )
				w.getFlower1().isGrowing();
			if ( w.getFlower2().getState() != w.getFlower2().getEaten() )
				w.getFlower2().isGrowing();
			if ( w.getFlower3().getState() != w.getFlower3().getEaten() )
				w.getFlower3().isGrowing();
			if ( w.getFlower4().getState() != w.getFlower4().getEaten() )
				w.getFlower4().isGrowing();
			if ( w.getFlower5().getState() != w.getFlower5().getEaten() )
				w.getFlower5().isGrowing();
 
			//System.out.println("random = " + random);
			//System.out.println("Probability = " + w.getVole().getProbability());
			if ( w.getVole().random() == 1 )
				w.getVole().isHungry();

			System.out.println("---------------------------");
			System.out.println("This is day " + w.getDay());
			
			System.out.print("Flower1 ");
			w.getFlower1().printStatus();
			if ( w.getFlower1().getState() != w.getFlower1().getEaten() )
				System.out.println(", size: " + w.getFlower1().getSize()); 
			else System.out.println();
			
			System.out.print("Flower2 ");
			w.getFlower2().printStatus();
			if ( w.getFlower2().getState() != w.getFlower2().getEaten() )
				System.out.println(", size: " + w.getFlower2().getSize()); 
			else System.out.println();
			
			System.out.print("Flower3 ");
			w.getFlower3().printStatus();
			if ( w.getFlower3().getState() != w.getFlower3().getEaten() )
				System.out.println(", size: " + w.getFlower3().getSize());
			else System.out.println();
			
			System.out.print("Flower4 ");
			w.getFlower4().printStatus();
			if ( w.getFlower4().getState() != w.getFlower4().getEaten() )
				System.out.println(", size: " + w.getFlower4().getSize());
			else System.out.println();
			
			System.out.print("Flower5 ");
			w.getFlower5().printStatus();
			if ( w.getFlower5().getState() != w.getFlower5().getEaten() )
				System.out.println(", size: " + w.getFlower5().getSize());
			else System.out.println();
			
			System.out.print("Vole ");
			w.getVole().printStatus();
			
			if ( w.getVole().getState() == w.getVole().getHungry() && 
				 w.getVole().getState() != w.getVole().getStarved() ) 
			{
				if ( w.getFlower1().getState() != w.getFlower1().getEaten() ) {
					w.getFlower1().wasEaten();
					w.getVole().isFedUp();
				}
				else if ( w.getFlower2().getState() != w.getFlower2().getEaten() ) {
					w.getFlower2().wasEaten();
					w.getVole().isFedUp();
				}
				else if ( w.getFlower3().getState() != w.getFlower3().getEaten() ) {
					w.getFlower3().wasEaten();
					w.getVole().isFedUp();
				}
				else if ( w.getFlower4().getState() != w.getFlower4().getEaten() ) {
					w.getFlower4().wasEaten();
					w.getVole().isFedUp();
				}
				else if ( w.getFlower5().getState() != w.getFlower5().getEaten() ) {
					w.getFlower5().wasEaten();
					w.getVole().isFedUp();
				}
				else w.getVole().hasStarved(); 
			} 
			else if ( w.getVole().getState() != w.getVole().getHungry() && 
					  w.getVole().getState() != w.getVole().getStarved() )
				w.getVole().isSleeping(); 
			
		} 
	}
}
