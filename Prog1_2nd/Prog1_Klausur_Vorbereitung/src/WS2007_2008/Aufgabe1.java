package WS2007_2008;

public class Aufgabe1 {
	
	static boolean bit(int n) {
		if ( (n & 16) > 0 )
		// oder
//		if ( (n & ( 1 << (5-1))) > 0 )
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println( 1 << 4 );
		System.out.println( bit(48) );
		
		String s = Integer.toHexString(170); 
		
		System.out.println(Integer.toHexString(29));
//		int a = 7;
//		int b = 4; 
//		int c = 9;
//		System.out.println( (int)'0' );
//		System.out.println( a >> 2 );
//		System.out.println( a << 2 );
//		System.out.println( a >>> 2 ); 
//		System.out.println( b >>> 2 ); 
//		System.out.println( c >>> 2 ); 
//		System.out.println( c >> 2 ); 
		
	}

}
