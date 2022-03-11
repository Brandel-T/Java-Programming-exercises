
public class MyArcSinh {

	public static double arcSinh(double x, double eps) {
		double result;
		
		double prev = 0.0; //previous term
		double current = x; //current term
		double i = 3;
		double diff = x; 
		double factor = x*x*x;
		double num = 1, denom = 2;
		int sign = -1;
		
		result = x;  
			
		while(diff > eps) 
		{
			prev = current;
			current = sign*num * factor / (denom * i); 
			diff = prev - current ; 
			diff = (diff < 0) ? -diff : diff;
			
			result = result + current ;

			num = num * i;
			denom = denom * (i + 1);
			i = i+2;
			sign = -sign;
			factor = factor * x*x; 
		}  
				
		return result;		
	}
	
	public static void main(String[] args) {
		System.out.println("arcSinh(0.75, 1E-10) = " + arcSinh(0.75, 1E-10) );
	}

//	public static double arcSinh(double x, double eps)
//	{
//		double result;
//		
//		double previous = x; //previous term
//		double current = 0;  //current term
//		double diff = 1;
//		double factor = x;
//		double num = 1;
//		double denom = 1;
//		int sign = -1;
//		
//		result = x;
//		for (int i = 1; diff > eps; i++)
//		{
//			num = num * (2*i-1);
//			denom = denom * (2*i);
//			factor = factor * x*x;
//			current = sign * num * factor / (denom * (2*i + 1));
//			diff = current - previous;
//			diff = diff > 0 ? diff : -diff;
//
//			result = result + current ;
//			
//			previous = current ;
////			factor = factor * x*x;  
//			sign = -sign;
//			System.out.println(result);
//		}
//		
//		return result;
//	}
}
