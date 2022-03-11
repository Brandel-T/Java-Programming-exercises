package calculate;

public class Calculate {

	public int mult(int x, int y) {
		return x*y;
	}
	
	public int add(int x, int y) {
		int p;
		p = x + y;
		return p;
	}
	
	public int div(int x, int y) throws ArithmeticException {
		if ( y == 0)
			throw new ArithmeticException();
		int p;
		p = x / y;
		return p;
	}
}
