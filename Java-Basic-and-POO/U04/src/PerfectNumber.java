
public class PerfectNumber {

	public static void main(String[] args) {
//		
//		/*
//		 * Perfekte Zahlen finden: 
//		 * basierend auf der Formel von Euklid:
//		 * <<wenn (2^n)-1 prim ist, dann ist (2^n)*((2^n)-1) eine Perfekte Zahl>>
//		 *
//		 ********** PSEUDO CODE **********
//		 *********************************
//		 * 1) for-Schleife mit i durchlaufen und counter hochzaehlen bis 5,
//		 * 2) fuer jeden i ueberpruefen, ob (2^i)-1 prim ist,
//		 * 3) in dem Fall ist (2^i)*(-1+2^i) eine perfekte Zahl.
//		 */
//
//		
//		int counter = 0;  
//		int zweierpotenz = 2;
//		
//		//1)
//		for (int i = 2; counter < 5; i++) {
//			zweierpotenz = zweierpotenz * 2 ; 
//			
//		//2)Pruefen, ob zweierpotenz - 1 ((2^n)-1) prim ist oder nicht
//			boolean isPrim = true;		//Annahme, dass zweierpotenz-1 schon prim ist
//			for (int j = 2; j <= (zweierpotenz - 1)/2 && isPrim; j++ ) {
//				if ( (zweierpotenz-1) % j == 0)		//** (zweierpotenz - 1) **//
//					isPrim = false; 
//			}
//
//		//3)
//			if (isPrim) {
//				long perfectNumber = zweierpotenz*(zweierpotenz-1)/2; //(2^i)*(-1+2^i) 
//				System.out.print(perfectNumber + " = ");
//				long k = 0;
//				for (k = perfectNumber/2; k >= 2; k--) {
//					System.out.print(k + " + ");					
//				}
//				System.out.println(k);
//				counter++;
//			}
//		}		
//	}
		


		/*
		 * Perfekte Zahlen finden: 
		 * basierend auf der Formel von Euklid:
		 * <<wenn (2^n)-1 prim ist, dann ist (2^n)*((2^n)-1) eine Perfekte Zahl>>
		 *
		 ********** PSEUDO CODE **********
		 *********************************
		 * 1) for-Schleife mit i durchlaufen und counter hochzaehlen bis 5,
		 * 2) fuer jeden i ueberpruefen, ob (2^i)-1 prim ist,
		 * 3) in dem Fall ist (2^i)*(-1+2^i) eine perfekte Zahl.
		 */
		
		
		int counter = 0; 
		int zweierpotenz = 2;
		
		//1)
		for (int i = 2; counter < 4; i++) {
			zweierpotenz = zweierpotenz * 2 ; 
			
		//2)Pruefen, ob zweierpotenz - 1 ((2^n)-1) prim ist oder nicht
			boolean isPrim = true;		//Annahme, dass zweierpotenz-1 schon prim ist
			for (int j = 2; j <= (zweierpotenz - 1)/2 && isPrim; j++ ) {
				if ( (zweierpotenz-1) % j == 0)		//** (zweierpotenz - 1) **//
					isPrim = false; 
			}

		//3)
			if (isPrim) {
				long perfectNumber = zweierpotenz*(zweierpotenz-1)/2; //(2^i)*(-1+2^i)  
				System.out.print(perfectNumber + " = ");
				long k = 0;
				
				for (k = perfectNumber/2; k >= 2; k--) {
					System.out.print(k + " + ");					
				}
				System.out.println(k);
				counter++;
			}
		}
	}
}