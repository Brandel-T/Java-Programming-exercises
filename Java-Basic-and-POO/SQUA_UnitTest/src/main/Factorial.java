package main;

public class Factorial {

	public static int fact(int n) {
		int result = 1;
		if (n==0||n==1)
			return result;
		else
			for (int i=2; i<=n; i++)
				result = result * i;
			
		return result;	
	}
}
