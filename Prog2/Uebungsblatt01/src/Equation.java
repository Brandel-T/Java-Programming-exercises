
public class Equation
{
	double a, b, c; 
	
	//Konstruktur
	public Equation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Solution solve() throws NoQuadraticException, UnsolvableException
	{
		if(a == 0)
		{
			throw new NoQuadraticException();
		} 
		
		double d = b*b - 4*a*c;
		if(d < 0)
		{
			throw new UnsolvableException();
		}
		
		double w = Math.sqrt(d);
		
		double x1 = (-b + w)/2*a;
		double x2 = (-b - w)/2*a;
		
		return new Solution(x1, x2);
		
	}
}
