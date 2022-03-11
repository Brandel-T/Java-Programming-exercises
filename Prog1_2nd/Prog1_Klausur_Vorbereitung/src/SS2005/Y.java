package SS2005;

public class Y extends X{

	void a() {
		b();
		c();
	}
	
	void b() {
		System.out.println("bY");
	}
	
	public static void main(String[] args) {
		X x = new Y();
		x.a();
		Y y = (Y)x;
		y.a();
	}
}
