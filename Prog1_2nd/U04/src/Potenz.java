
public class Potenz {
	
	/**************PSEUDO-CODE*************
	 * 
	 * SQUARE & MULTIPLY ERWEITERT MIT MODULO ( __IGRU2__ )
	 *
	 * 1) Eine Potenz 'pot' von x finden, so dass "x^pot MODULO n = 1", 
	 * 2) Den Rest der Division von k durch pot speichern: "exp = k % pot",
	 * 3) Das Ergebnis ist: "x^pot MODULO exp".
	 */
	static int pow( int x, int k, int n) {
		int result = 1;
		
		//1)
		int pot = 1; 
		int rest = x % n;
		while (rest != 1) { 
			rest = (rest*(x % n))%n; //Rest nach sukzessiver Division von x durch n
			pot++;
		}
		
		//2)
		int exp = k % pot; //exp = k MODULO pot (kuezerer Exponent zur Vereinfachung der MODULO-OPERATION)
		 
		//3)
		for (int i=0; i<exp; i++) 
			result = (result*(x % n))%n;	//Rest nach sukzessiver Division von x durch n
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("pow(3, 4, 5) = " + pow(3, 4, 5));
		System.out.println("pow(17, 23, 13) = " + pow(17, 23, 13));
		System.out.println("pow(3, 1733885101, 5) = " + pow(3, 1733885101, 5));
	}
}
