package Blatt6;

public class ComplexMain {
	
	public static void main(String[] args) {
//		Complex z1 = new Complex(3, -4);
//		z1.normal();
//		z1.polar();
//		Complex z2 = new Complex(1, -1);
//		z2.normal();
//		z2.polar();
//		System.out.println();
//		
//		Complex res = z1.add(z2);
////		res.normal();
////		res.polar();
////		System.out.println(1/Math.sqrt(2));
////		System.out.println(Math.sqrt(2));
//	
//		System.out.println("pi = " +Math.PI);
//		System.out.println("-pi = " + -Math.PI);
//		
//		System.out.println("arg = " + Math.acos(z2.real/z2.getBetrag()));
		
		
		Complex z1 = new Complex(0.0, 1);
		Complex z2 = new Complex(1);
		Complex z3 = new Complex(1, 1); 
		
		//1
		Complex result1 = z1.pow(2);
//		Complex result1 = z1.mult(z1); 
		System.out.print("z1^2 = ");
		result1.polar();
		System.out.print("z1^2 = ");
		result1.normal();
		
		//2
		System.out.println("------------------------------");
		Complex result2 = (z1.add(z2) ).div(z3.konjugieren());
		System.out.print("(z1+z2)/(~z3) = ");
		result2.polar();
		System.out.print("(z1+z2)/(~z3) = ");
		result2.normal();
		
		//3
		System.out.println("------------------------------");
		double result3 = (z1.div(z1).getBetrag())*((z3.div(z1).getBetrag()));
		System.out.println("|z2/z1|*|z3/z1| = " + result3);
		
		//4
		System.out.println("------------------------------");
		Complex result4 = (z1.mult(z3)).sqrt(4); 
		result4.polar();
		result4.normal(); 
//		System.out.println(z1.mult(z3).getBetrag());
//		System.out.println(z1.mult(z3).arg);
//		System.out.println(Math.pow(2, 1/8)*Math.sin(3*Math.PI/16)); 
	} 

}
