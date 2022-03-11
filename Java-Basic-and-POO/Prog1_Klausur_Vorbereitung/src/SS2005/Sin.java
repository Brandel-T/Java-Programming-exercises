package SS2005;

public class Sin {

	public static void main(String[] args) { 
		double x = 3.14159265;
		int n = 20;
		System.out.println( getSin(x/2, n) );  
	} 
	
	public static double getSin(double x, int n) {
		if ( x <= 0 || n < 0 )
			return -2;
		else
		{
			double result = x;
		    double term = x; 
		    if ( n < 10 )
		    	n = 20;
		    for (int i = 3; i <= n; i += 2) {
		        term *= -x * x / ((i - 1) * i);
		        result += term; 
		    }
		    return result;
		}
	}

}
