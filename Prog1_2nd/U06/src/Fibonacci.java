
public class Fibonacci {

	public static void main(String[] args) 
	{
//		long n = Long.parseLong(args[0]); 
//		System.out.println("Iterative Berechnung: " + fiboIterativ(n));
//		System.out.println("Rekursive Berechnung: " + fiboRekursion(n));
		// iterativ
//				int n = Integer.parseInt(args[0]);
				int n = 7;
				int lastfibo = 1;
				int butlastfibo = 1;
				int i = 1;
				while(i < n) {
					int tmp = lastfibo + butlastfibo;
					butlastfibo = lastfibo;
					lastfibo = tmp;
					i += 1;
				}
				System.out.println("Iterative Berechnung: " + lastfibo);
				
				//rekursiv
				Fiborekursiv fibonacci = new Fiborekursiv();
				System.out.println("Rekursive Berechnung: " + fibonacci.fib(n));
	}
	
	public static class Fiborekursiv {
		long fib(int n) {
			if ( n < 0)
				System.out.println("zahl darf nicht negativ sein");
			else if(n >=0 && n < 2) 
				return 1;
			return fib(n-1) + fib(n-2);
		}
	}

	static long fiboRekursion(long n) {
		if (n==0 || n==1)
			return 1;
		return fiboRekursion(n-1) + fiboRekursion(n-2);
	}

	static long fiboIterativ(long n) {
		long result = 0;
		if (n==0 || n==1)
			return 1;
		else 
		{
			long i;
			long previous = 1;
			long current = 1;
			for ( i=2; i<=n; i++ ) {
				result = previous + current; 
				previous = current;
				current = result; 
			} 
		}
		
		return result;
	}
}