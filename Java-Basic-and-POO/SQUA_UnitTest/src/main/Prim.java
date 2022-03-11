package main;

public class Prim {
	
	public static boolean isPrim(int n) {
		
		int i =0;
		for ( i = 2; i <= n/2; i++)
			if ( n%i == 0 ) 
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println( isPrim(4) );
	}
}
