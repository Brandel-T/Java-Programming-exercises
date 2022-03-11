package Blatt6;

public class Fibonacci {
	
	static int iterFibonacciOf(int n) {
		int fibo = 0;
		
		 if (n < 0)
			 return -1;
		 else if (n == 0||n == 1)
			 return 1;
		 else {
			int prev1 = 1;
			int prev2 = 1;
			
			for (int i = 2; i <= n; i++) { 
				fibo = prev1 + prev2;
				prev2 = prev1;
				prev1 = fibo;
			}
		 }
		
		return fibo;
	}
	
	static int rekFibonacciOf(int n) 
	{ 		
		if (n < 0)
			return -1;
		else if (n == 0||n == 1)
			return 1;
		else 
			return rekFibonacciOf(n-1) + rekFibonacciOf(n-2);
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.printf("Iterative Berechnung: %d %n",iterFibonacciOf(n));
		System.out.printf("Rekursive Berechnung: %d ", rekFibonacciOf(n));

	}

}
