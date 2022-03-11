
public class FloatingPointVergleich {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		double d= 0.00000000004, e = 5.0, f = 6.0;
		boolean g = false, h = false, i = false;
		double epsilon = 1e-4;
		
		if ( d > epsilon ) {
			System.out.println("ok");
			System.out.printf("  d = %.11f %n", d);
			System.out.printf("eps = %.11f%n", epsilon);
		}
		else {
			System.out.println("try again");
			System.out.printf("  d = %.11f%n", d);
			System.out.printf("eps = %.11f%n", epsilon);
			
		}
		
		System.out.printf("0.0 = %.16f %n" , 0.0);
		System.out.printf("0e-16 = %.16f %n" , 0e-16);
	}
}
