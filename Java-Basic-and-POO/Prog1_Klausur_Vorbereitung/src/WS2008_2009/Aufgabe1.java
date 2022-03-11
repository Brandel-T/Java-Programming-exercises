package WS2008_2009;

import java.util.Arrays;

public class Aufgabe1 {

	public static void main(String[] args) {
		
		int i = 4;
		double x = 32.0;
		boolean b = true;
		char c = 'a';
		String s = "1";
		System.out.println( s+(i==0.0?b:c) );
		System.out.println( (short)x*Math.sqrt(i-c) ); //NaN
//		System.out.println( c%i%s );
		System.out.println(-i---c--);
//		System.out.println( (long)x*s*i );
		System.out.println((short)x);
		System.out.println( (float)((short)x&(int)c|i) );
//		System.out.println( (int)x|i+++c%2.0 );
		
		System.out.println("-------------------");
		
		System.out.println( Arrays.toString( 
				merge(new int[] {1, 3, 5, 6},
					  new int[] {17, 8, 7, 4}) ) );
		
		System.out.println( f (0.00000001, 1.0e-10) );
//		System.out.println( ~16&25 );
//		
////		int x = 1, y = 1;
//		int x = 2, y = 2;
//		if ((x>y)||(y>x)) {
//		}
//		else {
//		if ((x<=0)||(x+y>=6)) {
//		}
//		else {
//		System.out.println("Hello World!");
//		}
//		}
//		System.out.println("00000000000000000000000000000");
//		
//		int i = 5;
//		System.out.println(invert(i));
//		int x = -9;
//		if (true && ((x>0 && x%2==0) || (x<=0 && (-x)%3==0))) 
//			System.out.println("Hello World");

		System.out.println( styling(true, false, false) );
		System.out.println( styling(false, false, true) );
		System.out.println( styling(false, true, false) );
		
//		System.out.println("------------------");
//		int n = 4;
//		System.out.println(calc(n));
//		System.out.println( calcIter(10) );
	}
	
	static int invert(int i) { 
		String bin = Integer.toBinaryString(i);  
		while ( bin.length() < 5 ) {
			bin = "0"+bin;
		} 
		System.out.println(bin);
		StringBuilder sb = new StringBuilder(bin);  
		int len = bin.length();
		if ( bin.charAt( bin.length()-5 ) == '1' ) 
			sb.replace( len-5, len-4, "0");
		else
			sb.replace( len-5, len-4, "1");
		System.out.println( sb.toString() );
		return Integer.parseInt(sb.toString(), 2) ;
	}
	//"0 0 0 1 1 0 1" = 13
	// 6-5-4-3-2-1-0 <- position
	
	public static int styling(boolean geduscht, boolean gekaemmt,
			boolean rasiert) {
			if (geduscht && (!(gekaemmt || rasiert)))
			return 0;
			else {
			if (!gekaemmt && (gekaemmt || rasiert) &&
			(!(geduscht && rasiert)))
			return 1;
			else
			return 2;
			}
			}
	
	
	public static double f(double x, double eps) {
		
		if (!(-1<x && x < 1)) return -1;
		
		double result = 1, term = 1, diff = 1+eps, i=1;
		
		while (diff > eps) {
			diff = term;
			term *= -i*x/(i+2);
			diff = (diff-term>0) ? diff-term : term-diff;
			result += term;
		}
		
		return result;
	}
	
	public static int calc(int n){ //fibonacci rekursiv
		if (n<2)
			return n;
		return (calc(n-1) + calc(n-2));
	} 
	public static int calcIter(int n){ //fibonacci iterativ
		if (n<2)
			return n;
		else { 
			int fib = 0;
			int f1 = 1;
			int f2 = 0;
			for (int i=2; i<n; i++ )
			{
				fib = f1 + f2;
				f2 = f1; 
				f1 = 
				fib = (i-2) + (i-1);
			}
			return fib;
		}
	}
	
	static int[] merge(int[] up, int[] down) {
		int l=0, r = down.length-1;
		int[] res = new int[up.length+down.length];
		int i = 0;
		
		while ( l!=up.length && r != -1 ) {
			if ( up[l] < down[r] ) {
				res[i] = up[l];
				l++;
			} else {
				res[i] = down[r];
				r--;
			}
			i++;
		}
		
		if ( l==up.length && r!=-1 )
			for ( int k=r; k >= 0; k-- ) {
				res[i] = down[k];
				i++;
			}
		
		if ( r == -1 && l!=up.length )
			for (int k=l; k<up.length; k++) {
				res[i] = up[k];
				i++;
			}
			
		return res;			
	}	
}