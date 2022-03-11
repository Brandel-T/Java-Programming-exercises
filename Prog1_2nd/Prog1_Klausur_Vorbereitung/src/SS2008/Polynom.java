package SS2008;

public class Polynom implements Function {

	public static final int grad = 3;
	int a, b, c, d;
	
	Polynom(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	@Override
	public double value(double x) {
		return a*x*x*x + b*x*x + c*x + d;
	}

}
