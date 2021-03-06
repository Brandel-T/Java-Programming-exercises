package others;

/*
 * siehe Altmeister in Google Drive mit Bl?tter aus Bochum
 */

public class RegulaFalsi {

	public static void main(String[] args) {
		//System.out.println("regularFalsi(-2, 1) = " + regularFalsi(-2, 1));
		
		for (int i=1; i <=4; i++) {
			int ok = 0;
			for (int j=1; j<=4; j++) {
				ok++;
			}
			System.out.println(ok);
		}
	}

	//1.
	public static double f (double x)
	{
		double num = Math.pow(2, x-1) - x*Math.sin(x);
		double denom = Math.log( x*x + 2 );
		return num / denom;
	}
	
	//2. Algo der Regula Falsi wie im Struktogramm dargestellt
	static double regularFalsi(double a, double b)
	{
		while ( Math.abs(b-a) > 1e-7 ) {
			double n = b - f(b)*(b-a) / (f(b)-f(a));
			if ( f(n) * f(a) < 0 )
				b = n;
			else 
				a = n;
		}
		
		return (a+b)/2;
	}
}
