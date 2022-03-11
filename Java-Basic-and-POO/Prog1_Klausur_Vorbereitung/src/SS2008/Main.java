package SS2008;

import java.util.Arrays;

public class Main {
	static int y = 2;

	public static void main(String[] args) { 
		
		int[] a = {1, 2, 3, 8, 8, 1, 3};
		System.out.println( allDifferent(a) );
System.out.println("----------ARRAY-SORT-----------");
		double[] d = {1, 3, 6, 8, 44};
		System.out.println( Arrays.toString(d) );
		arraySort(d);
		System.out.println( Arrays.toString(d) );
		
		
		System.out.println("--------AUFGABE 6----------");
		long l = 2;
		float k = 3f;
		boolean b = false;
		char c = 'a';
		String s = "9";
//		System.out.println( s-(l==0.0?c:b) );/false
		System.out.println( (long)k*Math.sqrt(l-c) );
//		System.out.println( (double)l*((float)k)+(int)s ); 
		System.out.println( (float)((int)k&c|l) );
		System.out.println(s+l+k );
		System.out.println( -k+++c-- );
//		System.out.println(s%l%c);
//		System.out.println( (int)k|l--c%5f );
		System.out.println( Math.sqrt((short)l/0.0)/3 );
	}
	
	static boolean allDifferent(int[] a) {
		boolean res=true;
		for (int i=0; res && i<a.length-1; i++)
			res = (a[i] != a[i+1] );
		return res;
	}
	
	static void arraySort(double[] a) {
		int l = 1;
		double tmp = 0;
		while ( l != a.length )
		{
			for (int i=0; i < a.length-l; i++) {
				if ( a[i] < a[i+1] ) {
					tmp = a[i];
					a[i] = a[i+1];
					a[i+1] = tmp;
				}
			}
			l++;
		}
	}

}
