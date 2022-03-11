//
//public class Complex {
////
////	double real;
////	double img;
////	double arg;  
////	
////	Complex(double real, double img) {
////		this.real = real;
////		this.img = img; 
////		this.arg = Math.acos(this.real / this.amount());
////	}
////	
////	Complex(double real) {
////		this(real, 0.0);
////	}
////	
////	Complex() {
////		this(0.0);
////	}
////	
////	Complex add( Complex z ) {
////		return new Complex(real + z.real, img + z.img);
////	}
////	
////	Complex sub( Complex z ) {
////		return new Complex(real - z.real , img - z.img);
////	}
////	
////	Complex mult(Complex z) {
////		double r = real*z.real - img*z.img;
////		double im = real*z.img + img*z.real;
////		return new Complex(r, im);
////	}
////	
////	Complex div( Complex z ) {
////		double r = (real*z.real + img*z.img) / (z.real*z.real + z.img*z.img);
////		double im = (-real*z.img + img*z.real) / (z.real*z.real + z.img*z.img);
////		return new Complex(r, im);
////	}
////	
////	Complex konjugieren() {
////		return new Complex(real, -img);
////	}
////	
////	Complex pow(int n) {
////		double r = Math.pow(this.amount(), n) * Math.cos(n * this.arg);
////		double im = Math.pow(this.amount(), n) * Math.sin(n * this.arg);
////		return new Complex( r, im );
////	}
////	
////	Complex sqrt(int n) {
////		double r = Math.pow(this.amount(), 1/n) * Math.cos(this.arg / n);
////		double im = Math.pow(this.amount(), 1/n) * Math.sin(this.arg / n);
////		return new Complex( r, im );
////	}
////	
////	double amount() {
////		return Math.sqrt(this.real*this.real + this.img*this.img);
////	}
////	
////	void printNormal() {
//////		if (this.arg < 0 || this.img < 0)
//////			System.out.printf("Normalform: z = %f - %fi %n", amount()*Math.cos(arg), -amount()*Math.sin(arg));
//////		else
////			System.out.printf("Normalform: z = %f + (%f)i %n", this.real, this.img);
////	}
////	
////	void printPolar() {
////		System.out.printf("   Polarform: z = %.4f (cos(%f) + i sin(%f)) %n", this.amount(), this.arg, this.arg);
////	}
////	
//	
//
//	double real;
//	double img;
//	double arg;  
//	
//	Complex(double real, double img) {
//		this.real = real;
//		this.img = img; 
////		this.arg = Math.acos(this.real / this.amount());
//		this.arg = Math.asin(this.img / this.amount());
////		this.arg = Math.atan(this.img/this.real);
//	}
//	
//	Complex(double real) {
//		this(real, 0.0);
//	}
//	
//	Complex() {
//		this(0.0);
//	}
//	
//	Complex add( Complex z ) {
//		return new Complex(real + z.real, img + z.img);
//	}
//	
//	Complex sub( Complex z ) {
//		return new Complex(real - z.real , img - z.img);
//	}
//	
//	Complex mult(Complex z) {
//		double r = real*z.real - img*z.img;
//		double im = real*z.img + img*z.real;
//		return new Complex(r, im);
//	}
//	
//	Complex div( Complex z ) {
//		double r = (real*z.real + img*z.img) / (z.real*z.real + z.img*z.img);
//		double im = (-real*z.img + img*z.real) / (z.real*z.real + z.img*z.img);
//		return new Complex(r, im);
//	}
//	
//	Complex konjugieren() {
//		return new Complex(real, -img);
//	}
//	
//	Complex pow(int n) {
//		
//		Complex result ;
//		double r, im;
//		Complex c; 
//		for (int k = n-1; k > 0; k--) 
//		{
//			System.out.println("for k="+ k);
//			r  = Math.pow(this.amount(), 1.0/n) * Math.cos( (2*(double)k*Math.PI + this.arg)/n);
//			im = Math.pow(this.amount(), 1.0/n) * Math.sin( (2*(double)k*Math.PI + this.arg)/n);
//			c = new Complex(r, im);
//			c.printNormal();
//			c.printPolar();
//		}
//		
//		//case k=0
//		System.out.println("for k="+ 0);
//		r = Math.pow(this.amount(), 1.0/n) * Math.cos( this.arg/n);
//		im = Math.pow(this.amount(), 1.0/n) * Math.sin( this.arg/n);
//		result = new Complex(r, im);
//
//		return result;
//	}
//	
//	Complex sqrt(int n) {
//		double r = Math.pow(this.amount(), 1.0/n) * Math.cos(this.arg / n);
//		double im = Math.pow(this.amount(), 1.0/n) * Math.sin(this.arg / n);
//		return new Complex( r, im ); 
//	}
//	
//	double amount() {
//		return Math.sqrt(this.real*this.real + this.img*this.img);
//	}
//	
//	void printNormal() {
//		System.out.printf("  Normalform: z = %g + (%g)i %n", this.real, this.img);
//	}
//	
//	void printPolar() {  
//		System.out.printf("  Polarform: z = %g (cos(%g) + i sin(%g)) %n", this.amount(), this.arg, this.arg);
//	}
//}


public class Complex {

	double real;
	double img;
	double arg;  
	
	Complex(double real, double img) {
		this.real = real;
		this.img = img; 
		this.arg = Math.asin(this.img / this.amount());
	}
	
	Complex(double real) {
		this(real, 0.0);
	}
	
	Complex() {
		this(0.0);
	}
	
	Complex add( Complex z ) {
		return new Complex(real + z.real, img + z.img);
	}
	
	Complex sub( Complex z ) {
		return new Complex(real - z.real , img - z.img);
	}
	
	Complex mult(Complex z) {
		double r = real*z.real - img*z.img;
		double im = real*z.img + img*z.real;
		return new Complex(r, im);
	}
	
	Complex div( Complex z ) {
		double r = (real*z.real + img*z.img) / (z.real*z.real + z.img*z.img);
		double im = (-real*z.img + img*z.real) / (z.real*z.real + z.img*z.img);
		return new Complex(r, im);
	}
	
	Complex konjugieren() {
		return new Complex(real, -img);
	}
	
	Complex pow(int n) {
		//double r = Math.pow(this.amount(), n) * Math.cos(n * this.arg);
		//double im = Math.pow(this.amount(), n) * Math.sin(n * this.arg);
		//return new Complex( r, im );
		Complex result ;
		double r, im;
		Complex c; 
		for (int k = n-1; k > 0; k--) 
		{
			System.out.println("for k="+ k);
			r  = Math.pow(this.amount(), 1.0/n) * Math.cos( (2*(double)k*Math.PI + this.arg)/n);
			im = Math.pow(this.amount(), 1.0/n) * Math.sin( (2*(double)k*Math.PI + this.arg)/n);
			c = new Complex(r, im);
			c.printNormal();
			c.printPolar();
		}
		
		//case k=0
		System.out.println("for k="+ 0);
		r = Math.pow(this.amount(), 1.0/n) * Math.cos( this.arg/n);
		im = Math.pow(this.amount(), 1.0/n) * Math.sin( this.arg/n);
		result = new Complex(r, im);

		return result;
	}
	
	Complex sqrt(int n) {
		double r = Math.pow(this.amount(), 1/n) * Math.cos(this.arg / n);
		double im = Math.pow(this.amount(), 1/n) * Math.sin(this.arg / n);
		return new Complex( r, im );
	}
	
	double amount() {
		return Math.sqrt(this.real*this.real + this.img*this.img);
	}
	
	void printNormal() {
		System.out.printf("   Normalform: z = %g + (%g)i %n", this.real, this.img);
	}
	
	void printPolar() {
		System.out.printf("   Polarform: z = %g (cos(%g) + i sin(%g)) %n", this.amount(), this.arg, this.arg);
	}
	
}