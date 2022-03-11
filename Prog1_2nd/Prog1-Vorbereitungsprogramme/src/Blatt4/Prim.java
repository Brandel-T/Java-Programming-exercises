package Blatt4;

public class Prim {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		if (n <= 2) {
			System.out.println("Die Eingabezahl muss groesser 2 sein.");
		} else {
			if (n == 3)
				System.out.println(1);
			else {
				int i = 4; 
				int counter = 2;
				boolean isPrim = false ;
				
				int previousPrim = 3;
				int currentPrim = 0;
				int twinsPrims = 0; //Primzahlen-Zwillinge
				
				int maxDistance = 0;
				int minPrim1 = 0; //kleinste Prim 1 
				int minPrim2 = 0; //kleinste Prim 2
				
				for (i = 4; i < n; i++) {
					int j = 2; 
					isPrim = true;
					
					for (j = 2; j <= i/2 ; j++) {
						if (i % j == 0) 
							isPrim = false; 
					}
					
					//counter = (!isPrim) ? counter : counter + 1 ; 
					if ( isPrim) {  
						counter++; 
						
						currentPrim = i;
						
						//3- grossten Abstand finden
						//System.out.printf("(%d, %d)", previousPrim , currentPrim );
						if (currentPrim - previousPrim > maxDistance) {
							maxDistance = currentPrim - previousPrim;
							minPrim1 = previousPrim;
							minPrim2 = currentPrim;
						} 
						
						//2- Primzahl-Zwillingen
						if (currentPrim - previousPrim == 2) {
							twinsPrims ++; 
							previousPrim = currentPrim;
						}  
						previousPrim = currentPrim;
//						
					}
				
				}
				//Die Anzahl von Primes zwischen 1 und n ausgeben
				System.out.println( counter );
				//Die Anzahl von Primzahlen-Zwillinge ausgeben
				System.out.println(twinsPrims);
				//max Abstand und kleinste Primes
				System.out.printf("%d %d %d", maxDistance, minPrim1, minPrim2);
			}
		}
		

	}

}
