package SS2007;

public class Arcsinh { 

	public static void main(String[] args) { 
		System.out.println( arcsinh(0.75, 1.0e-10) ); 
	}
	
	public static double arcsinh(double x , double eps) {
		if ( !(x>-1 && x<1) )
			return 9999;
		
		double result = x, term = x, diff = 1, prev = x;
		double i = 1;
		while ( diff > eps ) 
		{
			diff = term; //__________________previous term
			prev = prev * ( -i*x*x/(i+1) );
			term = prev / (i+2); //____________current term
			diff = ( diff - term > 0 ) ? diff - term : term -diff;
			result = result + term;
			i = i+2; 
		}
		return result; //0.6931471805524204					   
	}

}
