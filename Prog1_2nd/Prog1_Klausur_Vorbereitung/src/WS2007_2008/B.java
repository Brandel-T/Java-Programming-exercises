package WS2007_2008;

public class B extends A{
	public int y = 3;
	public B(int x) {
	super();
		y += x;
	}
	
	public int f(double x) {
		y += 1;
		return (int)x * y;
	} 
}
