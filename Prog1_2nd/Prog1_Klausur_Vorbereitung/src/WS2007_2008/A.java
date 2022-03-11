package WS2007_2008;

public class A {
	public static int x = 1;
	public A() {
	x += 3;
	}
	public int f(int y) {
	return y + x;
	}
	public int f(double y) {
	x = 0;
	return (int)y;
	}
}
