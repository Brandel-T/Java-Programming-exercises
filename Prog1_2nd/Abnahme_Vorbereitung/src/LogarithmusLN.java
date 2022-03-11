
public class LogarithmusLN {

//	public static double ln(double x, double eps) {
//		double result;
//		
//		result = -1.0;
//		if (x <= 0)
//			return result;
//		else
//		{
//			double factor = (x-1)/(x+1);
//			double denom = 3;
//			double prev = 0.0; //vorheriger Term
//			double current = (x-1)/(x+1); //aktueller Term
//			result = current;
//			double diff = current - prev;
//			
//			while ( diff > eps)
//			{
//				prev = current;
//				factor = factor*(x-1)*(x-1)/((x+1)*(x+1));
//				current = factor / denom;
//				diff = (current - prev) < 0 ? -(current - prev) : (current - prev); 
//				denom = denom + 2; 
//
//				result = result + current;
//			}
//			result = 2*result;
//		}		
//		
//		return result;
//	}
	
	
	public static double ln(double x, double eps) {
		double result;
		
		result = -1.0;
		if (x <= 0)
			return result; 
		
		double term = (x-1)/(x+1);
		double fact = (x-1)*(x-1) / ((x+1)*(x+1));
		double i=1;
		double diff = 1;
		result = term;
		
		while (diff > eps) {
			diff = term/i; //for current term
			i+=2;
			term = term*fact;
			diff = ( diff-term/i > 0 ) ? diff-term/i : term/i-diff;
			result += term/i;
//			System.out.println( 2*result );
		}		
		result = 2*result; 
		
		return result;
	} 
	
//	static void modif()
	
	public static void main(String[] args) {
		double x = 2.71828; 
		double eps = 1e-16;
		System.out.printf("ln(%f) = %f %n", x, ln(x, eps));
//		int i = 999999999;
//		System.out.println( Integer.MIN_VALUE );
//		System.out.println(Integer.MAX_VALUE);
//		boolean ok=false;
//		System.out.println("-----------");
//		for (i=2147483646;!ok&& i<Integer.MAX_VALUE ; i+=1) {
//			System.out.println(i);
//			ok = i==Integer.MAX_VALUE;
//		} 
	} 
}
