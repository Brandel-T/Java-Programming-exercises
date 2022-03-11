
public class Quer {

	static int crossSum(int n) {
		
		if ( n < 10 ) 
			return n;
		else
		{
			int quotient = n / 10; 
			int result = n % 10;
			
			while (quotient != 0) {
				result = result + (quotient % 10);
				quotient = quotient / 10;
			}
			
			return result;
		}
	}
	
	static void crossSumList(int n) {
		int i = 0;
		for ( i=0; i <= 1000; i++ )
			if ( n == crossSum( i ) )
				System.out.print(i + " ");
		System.out.println();
	}
	
	static void crossMultipleList(int m) {
		int i = 0;
		for ( i=0; i <= 1000; i++ )
			if ( crossSum(i) % m == 0 )
				System.out.print(i + " ");
		System.out.println();
	}
	
	static int qt(int n) 
	{		
		int result = crossSum(n);
		if ( result < 10 )
			return result;
		else
			while ( result >= 10) 
				result = crossSum(result);
			
		return result;
	}
	
	static int crossProduct(int n) 
	{
		if ( n < 10 ) 
			return n;
		else
		{
			int quotient = n / 10; 
			int result = n % 10;
			
			while (quotient != 0) {
				result = result * (quotient % 10);
				quotient = quotient / 10;
			}
			
			return result;
		}
	}
	
	static void crossMix() {
		System.out.println("\nNumbers from 0 to 1000 for which the sum of the cross sum and the cross product results in the number itself are: ");
		int i ;
		for ( i=0; i <= 1000; i++ )
			if ( i == (crossSum(i) +  crossProduct(i)) )
				System.out.print(i + " ");
		System.out.println();
	} 
	
}
