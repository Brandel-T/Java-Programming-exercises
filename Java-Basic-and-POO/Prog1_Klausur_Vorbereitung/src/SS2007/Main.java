package SS2007;

public class Main implements Cloneable {

	
	static boolean diff(int a, int b, int c) {
		if ( a>0 && b>0 && c>0 ) {
			if ( a == b-c || a == c-b )
				return true;
			if ( b == a-c || b == c-a )
				return true;
			if ( c == a-b || c == b-a )
				return true;
			return false;
		} else return false;
	}
	
	public static int a( int x, int y ) {
		if ( x > y )
		return a( y, x-1 );
		return 1 + b( x, y-1 );
	}
	
	public static int b( int v, int w ) {
		if ( v % w == 0 )
			return 0;
		return 2 + a( w, v );
	} 

	public static void main(String[] args) { 
//	
//		System.out.println( a( 7, 11 ) );
//	
//		System.out.println("----------");
//		
//		System.out.println( diff(5, 2, 7) );
//		
//		Object o = new Main();
//	//	Object a = o.clone();
		
		int i = 7;
		double x = 11.0;
		boolean b = false;
		char c = 'a';
//		x = (x>c)||!b; //x muesste boolean sein
//		(int)i%x-/*1*Math.cos(Math.PI)*/-c/4;
//		x = c==i?b:x; //false
		System.out.println( -c---i-- );  
		System.out.println( --i );
		System.out.println( x+"c-3" ); 
		System.out.println( i%1.5f != 1 );
	}

}
