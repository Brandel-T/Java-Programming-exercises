
public class Mirp {
	
	public static void main(String[] args) {

//		long s = Long.parseLong(args[0]); //Schrank   
		long s = 200;
		
		int i = 12; 
		while (i <= s)
		{
			//1) primzahlen untersuchen
			boolean prim = true; 
			for (long j=2; j<=i/2 && prim; j++)
				if(i % j == 0)
					prim = false; 
			
			if ( prim )  
			{ 
				//2) Kehrwert bestimmen
				long rest = i % 10;
				long quotient = i / 10;
				long invert = rest;
				
				while (quotient != 0) {
					rest = quotient % 10;
					invert = invert*10 + rest;
					quotient = quotient / 10;
				} 
					
				//3) ist der Kehrwert prim oder nicht
				boolean primInverse = true; 
				for (long j=2; j<=invert / 2 && primInverse; j++)
					if(invert % j == 0)
						primInverse = false; 
				
				if (primInverse)
					System.out.println(i);
			}			
				
			i++;
		}		
	} 
}
