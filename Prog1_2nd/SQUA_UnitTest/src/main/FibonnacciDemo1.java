package main;

public class FibonnacciDemo1 {

//	public static int fibonacci(int n) {
//		if ((n==1) || (n==2)) 
//			return 1;
//		else
//			return fibonacci(n-1)+fibonacci(n-2);
//	}
	
	public static int fibonacci(int n) {
		if ( n == 1 || n == 0 ) 
			return 1;
		else 
		{
			int i, result=0, last=1 , current=1 ;
			for ( i=2; i<=n; i++ ) {
				result = current + last;
				last = current;
				current = result;
			}
			
			return result;
		}
	}
}
