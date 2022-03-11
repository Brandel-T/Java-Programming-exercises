
public class CalcSomething {
	public static void main( String[] args ) {
		System.out.println( c( 2, 5 ) );
	}

	static int c(int a, int b) {
		int result = 1;
		int i = 1;
		for ( i = 1; i <= b; i++ )
			result *= a;
		return result;
	}  
	
} 