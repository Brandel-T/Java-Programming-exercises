package Blatt4;

public class PowerKrypto {

	static int pow (int x, int k, int n) {
		int exp = 1;
		int rest = 0;
		while (rest != 1) {
			int i = 1;
			int xx = 1;
			
			for (i = 1; i <= exp; i++) {
				xx *= x;
			}

			System.out.println("reste: " + rest);
			rest = xx % n;
			++exp;
		} 
		System.out.println("exp : "+ exp);
		
		int j = 1;
		int result = 1;
		int expToUse = k%(exp-1);
		
		for (j = 1; j <= expToUse; j++) {
//			result *= x%n;
//			result %= n;
			result = (result * (x % n)) % n; 
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("pow(3, 4, 5) = "+ pow(3, 4, 5) );
		System.out.println("------------------------------------");
		System.out.println("pow(17, 23, 13) = "+ pow(17, 23, 13) );
		System.out.println("------------------------------------");
		System.out.println("pow(3, 1733885101, 5) = "+ pow(3, 1733885101, 5) );
	
	}
}
