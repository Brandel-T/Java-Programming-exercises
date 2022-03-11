package Blatt6;

public class Complex {

	double real ;
	double img;
	double betrag;
	double arg;
	
	Complex() {
		this(0.0);
	}
	
	Complex(double real) {
		this(real, 0.0);
	}
	
	Complex(double real, double img) {
		this.real = real ;
		this.img = img ;
		this.betrag = this.getBetrag();
		this.arg = Math.acos(this.real/this.getBetrag());
	}
	
	Complex add(Complex z) {
		return new Complex(real + z.real, img + z.img);
	}
	
	Complex sub(Complex z) {
		return new Complex(real-z.real, img-z.img);
	}
	
	Complex mult(Complex z) {
		double r = real*z.real - img*z.img;
		double i = real*z.img + img*z.real;
		return new Complex(r, i);
	}
	
	Complex div(Complex z) {
		//erster Lösungsansatz
//		double r = (real*z.real + img*z.img)/(z.real*z.real+z.img*z.img);
//		double i = -(real*z.img + img*z.real)/(z.real*z.real+z.img*z.img);
//		return new Complex(r, i);
		//2. Lösungsansatz
		return this.mult(z.konjugieren()).mult(new Complex(1/(z.getBetrag()*z.getBetrag()))); 
		//die Formel: Z/Z' = (Z*(~Z'))/|Z'|² = (Z*(~Z'))*(1/|Z'|²)
	}
	
	Complex konjugieren() {
		return new Complex(this.real, -this.img);
	}
	
	Complex pow(int n) {
		double r = Math.pow(this.getBetrag(), n)*Math.cos(n*arg);
		double i = Math.pow(this.getBetrag(), n)*Math.sin(n*arg);
		return new Complex(r, i);
	}

	Complex sqrt(int n) {
		double r = Math.pow(this.getBetrag(), 1/n)*Math.cos(arg/n);
		double i = Math.pow(this.getBetrag(), 1/n)*Math.sin(arg/n);
		return new Complex(r, i);
		
		//andere Lösungsmöglichkeit
//		return this.pow(1/n);
	}
	
	double getBetrag() {
		return Math.hypot(real, img);
	}
	
	void normal() {
		System.out.printf("%.2f + i*(%.2f) %n", this.real, this.img);
	}
	
	void polar() {
		System.out.printf("%.2f*(cos(%.2f)+i*sin(%.2f)) %n", this.getBetrag(), this.arg, this.arg);
	}
	
}
