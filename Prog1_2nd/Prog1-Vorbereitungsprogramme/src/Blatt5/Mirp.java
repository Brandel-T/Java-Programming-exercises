package Blatt5;

public class Mirp { 
	static boolean isPrim(int n) {
		if (n == 1 || n == 2 || n == 3) 
			return true; 	
		else { 
			int i = 2;
			for (i = 2; i <= n/2; i++) { 
				return !(n % i == 0);
			}
		}
		return true;
	}
	
	static boolean isMirp(int n) 
	{ 
		int rest = n % 10;
		int div = n / 10;
		int invertedNumber = rest; //Rückwärtsschreibung des number hier (Schritt für Schritt) speichern
		
		while ( div != 0 ) 
		{
			//System.out.print(rest + " ");
			rest = div % 10;			
			invertedNumber = invertedNumber *10 + rest; //HORNER-SCHEMA: Za = (...(zn*a + zn-1)*a + zn-2) + ...*a + z1)*a + z0
			div /= 10; 
		} 
		System.out.println("the invertedNumber is : " + invertedNumber);
		
		
		return isPrim(n) && isPrim(invertedNumber);
	}
	
	
	
	public static void main(String[] args) { 		
		
		/*-------------CAS D'ESSAI (Tres important pour la compréhension et simplification du procédé)-------------*/
//		int n = 317; 
//		int rest = n%10;
//		int div = n / 10;
//		
//		int inverted = rest; //Rückwärtsschreibung des number hier speichern
//		
//		while ( div != 0 ) {
//			//System.out.print(rest + " ");
//			rest = div % 10;
//			
//			inverted = inverted *10 + rest; //HORNER-SCHEMA: Za = (...(zn*a + zn-1)*a + zn-2) + ...*a + z1)*a + z0
//			
//			div /= 10; 
//		}
//		System.out.println(inverted);  
		
		System.out.println(isMirp(31));
//		System.out.println(isPrim(317)); 
		
	}

}
