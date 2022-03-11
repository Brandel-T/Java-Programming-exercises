package WS2007_2008;

public class Cosinus {

	public static void main(String[] args) { 
		double x = 1.5707963;
		double eps = 1.0e-7;
		System.out.println( cos(x, eps) ); 
	}
	
	public static double cos(double x, double eps) {
		if ( !(Double.POSITIVE_INFINITY > x && Double.NEGATIVE_INFINITY < x))
			return -2; // -1 <= cos(x) <= 1
		else {
			double term = 1, num = 1, fact = 1, diff = 1+eps, result = 1; 
			int i = 1;
			while ( diff > eps ) {
				 diff = term ;    //previous term
				 num *= -x*x;
				 fact *= i*(i+1);
				 term = num/fact; //current term
				 diff = diff - term > 0 ? diff - term : term - diff;
				 result += term;
				 i+=2;
			} 
			return result;
		}
	}

}
