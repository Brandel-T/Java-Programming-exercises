package WS2008_2009;

import java.util.Arrays;

public class SquareChecker {
	public static void main(String[] args) {
		int i = 4;
		char c = 'a';
		System.out.println( (int)c );
		System.out.println( c++ );
		//hier die Initialisierung des Arrays square einf?gen
		int[][] square = {
				{4, 9, 2},
				{3, 5, 7},
				{8, 1, 6}
		};
		System.out.println("Das Quadrat ist " +
				(allDigitsUsed(square) ? "" : "un") + "g?ltig.");
		
		System.out.println("\nAUFGABE 2-------------------------");
		
//		int[] upwardA = {1, 3, 5, 6};
//		int[] downwardB = {17, 8, 7, 4};
		int[] upwardA = {4, 7, 8, 19};
		int[] downwardB = {6, 5, 3, 1};
		System.out.println( Arrays.toString(merge(upwardA, downwardB )) );
		
	}
	
	public static boolean allDigitsUsed(int[][] a) {
		//hier die L?sung einf?gen
		boolean result = true;
		for ( int i=0; result && i<a.length; i++ )
			for ( int j=0; result && j<a[i].length; j++ )
			{
				for ( int k=i; result && k<a.length; k++ ) 
					for ( int l=j+1; result && l<a[k].length; l++ )
						if ( a[i][j] == a[k][l] )
							result = false;
			}
				
		return  result;
	}
	
	public static int[] merge(int[] upwardA, int[] downwardB) 
	{
		int[] res = new int[upwardA.length + downwardB.length];
		int j=0;
		int l = 0;
		int lengthB = downwardB.length-1; 
		int k = 0;
		for ( k = 0; k < upwardA.length && l!=lengthB+1; ) 
		{
			int minA = upwardA[k];				
			int minB = downwardB[lengthB-l];			
//			System.out.println(minA + " "+ minB);
			if ( minA > minB ) {
				minA = minB;  
					l++;
			} 
			else k++; 
			 
			res[j] = minA;
			j++;
		} 
		
		/* wenn das 1. array komplett durchgelaufen wird,
		 * aber das 2. array nicht, dann muessen wir alle
		 * restliche Zahlen aus dem 2. array in "res" einfuegen
		 */
		if ( ((k-1) == upwardA.length-1) && (l != downwardB.length-1) ) {
			int index = k + l; //index in res, ab dem wir andere Zahlen einfuegen koennen
			System.out.println("index = "+index);
			for (int i = lengthB-l; i >= 0; i--, index++)
				res[index] = downwardB[i];
		}
		
		/*
		 * das 2. array ist komplett durchgelaufen, aber
		 * das 1. hat noch paar zahlen, die nicht in "res"
		 * eingefuegt wurden
		 */ 
		if ( k != upwardA.length-1 && (l-1) == downwardB.length-1 ) {
			int index = k + l; //index in res, ab dem wir andere Zahlen einfuegen koennen
			for ( int i = k; i < upwardA.length; i++, index++ )
				res[index] = upwardA[i];
		}
		
		return res; 
	}
}


























