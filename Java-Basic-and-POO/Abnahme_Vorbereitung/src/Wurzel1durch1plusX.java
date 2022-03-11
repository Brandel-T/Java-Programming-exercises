
public class Wurzel1durch1plusX {
	
	/*
	 * Klausur Wintersemester 2008/2009
	 */

	public static void main(String[] args) {
//		double x = 0.00000001; 
		double x = 0.9;
		System.out.println("result = " + f(x, 1e-10) );
	}
	
	public static double f (double x, double eps)
	{
		double result = -1;
		
		if ( x > -1 && x < 1 )
		{
			double prev = 0.0;
			double current = 1.0;
			double diff = current - prev;
			double num = 1*x;
			double denom = 2.0;
			double i = 1.0;
			int sign = -1;
			
			result = current;
			while (diff > eps)
			{
				prev = current ;
				current = sign*(num / denom);
				diff = (current - prev);
				diff = diff > 0 ? diff : -diff;
				
				result = result + current;
				
				i++;
				sign = -sign;
				num = num * (i+1)*x;
				denom = denom * (i+2);
			}
		} 
		
		return result;
	}
}
