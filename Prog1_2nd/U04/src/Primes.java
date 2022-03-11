
public class Primes {

	public static void main(String[] args) {

//		int n = Integer.parseInt(args[0]);
		int n = 4;
		
		if (n <= 2) 
			System.out.println("Die Eingabezahl muss groesser 2 sein.");
		else if (n == 3)
			System.out.println(1 + "\n" + 0 + "\n" + 0 + " " + 0);
		else 
		{
			//1)
			int countPrim = 1;		// zaehlt Primes
			int previousPrim = 2;
			int currentPrim = 0;
			int countTwins = 0;		// Primzahlen-Zwillinge zaehlen
			
			int distance = 0;		// Abstand zwischen 2 primes
			int maxDistance = 0;	// fuer den grossten Abstand 
			int prev=0, current=0;	// zum Zwischenspeichern der beiden kleinsten Primes mit min. Abstand
			
			boolean isPrim = true;
			
			for (int i = 3; i < n ; i++) 
			{
				for (int j = 2; j <= i/2 && isPrim; j++) 
					if (i%j == 0) 
						isPrim = false;			

				//___________________________________________1)
				if ( isPrim ) {
					countPrim++; 
					
					//_______________________________________2)
					currentPrim = i;
					distance = currentPrim - previousPrim;
					if ( distance == 2) 
						++countTwins;
					else //__________________________________3)
						if (distance > maxDistance) {
							maxDistance = distance;
							prev = previousPrim;
							current = currentPrim;							
					}					
					previousPrim = currentPrim;
					
				}
				isPrim = true;
			}
			
			System.out.println(countPrim);
			System.out.println(countTwins);
			System.out.println(maxDistance + " " + prev + " " + current);	
		}
	}
}
