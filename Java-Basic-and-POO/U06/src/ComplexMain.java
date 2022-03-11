//
//public class ComplexMain {
//
//	public static void main(String[] args) {
////		Complex z1 = new Complex(0.0, 1);
////		Complex z2 = new Complex(1);
////		Complex z3 = new Complex(1, 1);
////		
////		Complex r1, r2, r4;
////		double r3;
////		
////		r1 = z1.pow(2);
////		System.out.print("1. ");
////		r1.printNormal();
////		r1.printPolar();
////		
////		r2 = z1.add(z2).div(z3.konjugieren()).konjugieren();
////		System.out.print("2. ");
////		r2.printNormal();
////		r2.printPolar();		
////
////		r3 = z2.div(z1).amount() * z3.div(z1).amount();
////		System.out.printf("3. %.16f %n", r3 ); 		
////
////		r4 = z1.mult(z3).sqrt(4);
////		System.out.print("4. ");
////		r4.printNormal();
////		r4.printPolar(); 
//		
//		Complex z1 = new Complex(0.0, 1.0);
//		Complex z2 = new Complex(1);
//		Complex z3 = new Complex(1., 1.);
//		
//		Complex r1, r2, r4;
//		double r3;
//		
//		System.out.println("1.");
//		r1 = z1.pow(2);
////		System.out.print("1. ");
//		r1.printNormal();
//		r1.printPolar();
//
//		System.out.println("\n2.");
//		r2 = z1.add(z2).div(z3.konjugieren()).konjugieren();
////		System.out.print("2. ");
//		r2.printNormal();
//		r2.printPolar();		
//
//		System.out.println("\n3.");
//		r3 = z2.div(z1).amount() * z3.div(z1).amount();
//		System.out.printf("%.16f %n", r3); 		
////		System.out.printf("3. %.16f %n", r3); 		
//
//		System.out.println("\n4.");
//		r4 = (z1.mult(z3)).sqrt(4);
////		System.out.print("4. ");
//		r4.printNormal();
//		r4.printPolar(); 
//		
//	}
//}

public class ComplexMain {

	public static void main(String[] args) {
		
		Complex z1 = new Complex(0.0, 1.0);
		Complex z2 = new Complex(1);
		Complex z3 = new Complex(1, 1);
		
		Complex r1, r2, r4;
		double r3;
		
		System.out.println("1.");
		r1 = z1.pow(2); 
		r1.printNormal();
		r1.printPolar();

		System.out.println("\n2.");
		r2 = z1.add(z2).div(z3.konjugieren()).konjugieren(); 
		r2.printNormal();
		r2.printPolar();		

		System.out.println("\n3.");
		r3 = z2.div(z1).amount() * z3.div(z1).amount();
		System.out.printf("%.16f %n", r3); 		 		

		System.out.println("\n4.");
		r4 = (z1.mult(z3)).sqrt(4); 
		r4.printNormal();
		r4.printPolar();  
	}
}
