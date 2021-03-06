package SS2006;

public class Ln1plusX {

	public static void main(String[] args) {
		double x = 1; 
		double eps = 1.0e-10;
		System.out.println( ln1plusX(x, eps) );
	}
	
	
	public static double ln1plusX(double x, double eps) {
		if ( !(x>-1 && x <= 1) )
			return 404;
		
		double result = x; 
		double term = x;
		double diff = 1;
		for (int i = 2; diff > eps; i++)
		{
			diff = term; //previous term
			term = term * (-x); //current term
			System.out.println(term);
			diff = ( diff - term/i > 0 ) ? diff -term/i : term/i -diff;
			result = result + (term/i);
		}
		return result;
	}

}
