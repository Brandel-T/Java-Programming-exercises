
public class Sinus {

	public static double getSin(double x, double eps) {
		double result;

		result = 999;
		if (x <= 0)
			return result ;
		else 
		{
			double prev = 0.0;
			double current = x;
			double diff = current - prev;
			double factor = x*x*x;
			int sign = -1;
			double factDenom = 6; //initialization with 3!
			int i = 3;
			
			result = x;
			while (diff > eps )
			{
				prev = current;
				current = factor / factDenom;
				diff = current - prev;
				diff = (diff < 0) ? -diff : diff; 
				
				result = result + sign*current;
				
				factor = factor * x*x;
				factDenom = factDenom * (i+1)*(i+2);
				sign = -sign;
				i = i+2;
				System.out.println(result);
			}			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		double x = 3.14159265; 
		System.out.println("result = " + getSin(x, 1e-10) );
	}
}
