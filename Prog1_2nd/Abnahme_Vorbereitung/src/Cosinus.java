
public class Cosinus { 
	
	/*
	 * Klausur Wintersemester 2007/2008
	 */

	public static void main(String[] args) { 
		double x = 1.5707963; 
		double eps = 1e-7;
		System.out.print(cos(x, eps) );

//		System.out.println( calc(4, 2) );
	}
	
	public static int calc(int n, int k) {
		if (k == 0 || n == k)
			return 1;
		else
		{
			int res1 = calc(n-1, k);
			int res2 = calc(n-1, k-1);
			System.out.println( res1 +"  "+ res2 );
			int res = res1 + res2; 
			return res;
		}
	}
	
	public static double cos (double x, double eps)
	{
		double result = -2;
		
		if ( x > Double.NEGATIVE_INFINITY && x < Double.POSITIVE_INFINITY )
		{
			double prev = 0.0; //previous term
			double current = 1;//current term
			double diff = current - prev;
			double factor = x*x; //to calculate the current term
			int sign = -1;
			double factDenom = 2; //denominator factorial 
			long i = 2;

			result = 1.0;
			while (diff > eps ) { 
				prev = current ;
				current = sign*(factor / factDenom); 
				diff = (current - prev) < 0 ? -(current - prev) : current - prev; 
				
				result = result + current ;
				
				factor = factor* x*x;
				sign = -sign;
				factDenom = factDenom*(i+1)*(i+2);
				i = i+2; 
			}
		}
//		else
//			return -2;
		
		return result;
	}

}
