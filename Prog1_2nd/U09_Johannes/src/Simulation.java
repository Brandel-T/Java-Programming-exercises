public class Simulation {
	public static void main(String args[]) {
 
		Winter w = new Winter();
		
 
		for (int i = 0; i < 60; i++) {
			w.random();
			w.oneDayPasses();
			w.flower1.isGrowing();
			w.flower2.isGrowing();
			w.flower3.isGrowing();
			w.flower4.isGrowing();
			w.flower5.isGrowing();
			
			System.out.println("--------------------------------");
			System.out.println("This is day " + w.day);
			
			System.out.print("Flower1 ");
			w.flower1.printStatus();
			
			System.out.print("Flower2 ");
			w.flower2.printStatus();
			
			System.out.print("Flower3 ");
			w.flower3.printStatus();
			
			System.out.print("Flower4 ");
			w.flower4.printStatus();
			
			System.out.print("Flower5 ");
			w.flower5.printStatus();
			
			w.vole.printStatus();
			
			if(w.vole.state == w.vole.FED_UP){
				w.vole.isSleeping();
			}
			
			if(w.vole.state == w.vole.HUNGRY){
				if(w.flower1.state == w.flower1.GROW || w.flower1.state == w.flower1.FLOURISH){
					w.vole.isFedUp();
					w.flower1.wasEaten();
				}
				else{
					if(w.flower2.state == w.flower2.GROW || w.flower2.state == w.flower2.FLOURISH){
						w.vole.isFedUp();
						w.flower2.wasEaten();
					}
					else{
						if(w.flower3.state == w.flower3.GROW || w.flower3.state == w.flower3.FLOURISH){
							w.vole.isFedUp();
							w.flower3.wasEaten();
						}
						else{
							if(w.flower4.state == w.flower4.GROW || w.flower4.state == w.flower4.FLOURISH){
								w.vole.isFedUp();
								w.flower4.wasEaten();
							}
							else{
								if(w.flower5.state == w.flower5.GROW || w.flower5.state == w.flower5.FLOURISH){
									w.vole.isFedUp();
									w.flower5.wasEaten();
								}
								else
									w.vole.hasStarved();
							}
						}
					}
				}
			}
		}
	}
}