package WS2007_2008;

public class Main {
	public static void main(String[] args) {
//		A a = new B(2);
//		System.out.println(A.x+" "+((B)a).y); // Ausgabe: _______________
//		int z = a.f(4.5);
//		System.out.println(((B)a).y+" "+z+" "+A.x); // Ausgabe: _______________
//		B b = (B)a;
//		z = b.f(5);
//		System.out.println(b.y+" "+z+" "+A.x); // Ausgabe: _______________
		
		System.out.println((int)'A');
		
		int i = 2;
		double x = 3.0;
		boolean b = false;
		char c = 'A';
		String s = "1";
		System.out.println( (int)c/0.0 );
//		System.out.println((int)x|i--c%5.0);
//		System.out.println(c%i%s);
		System.out.println(-x-- -c++); 
		System.out.println(((int)x&c|i));
	}
}
