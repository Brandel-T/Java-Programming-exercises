package SS2005;

public class Z extends Y {

	void c() {
		System.out.println("cZ");
	}
	
//	void b() {
//		System.out.println("class Z");
//	}
	
	public static void main(String[] args) {
//		Y y = new Z();
//		y.b();
//		y.c();
//		System.out.println("----");
//		Y yy = new Y();
//		yy.b();
//		yy.c();
		
//		Z z = new Y();
//		Z z = y;
		X x = new Z();
		Y y = (Y)x;
//		Z z = (Z)x;
		double a = 1/0.0;
		System.out.println(a);
		a = 1/0;
		System.out.println(a);
	}
}
