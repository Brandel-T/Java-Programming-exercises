package Blatt6;

public class Rational {
	int num ;
	int denom;
	
	Rational() {
		this(0);
	}
	Rational(int n) {
		this(n, 1);
	}
	Rational(int n, int d) {
		num = n;
		denom = d;
		
		if (d < 0) {
			n = -n;
			d = -d;
		} else if (d == 0)
			throw new ArithmeticException();
	}
	Rational (Rational r) {
		this.num = r.num;
		this.denom = r.denom;
	}
	
	String text() {
		if (getDenom() == 1) 
			return "" + getNum();
		return getNum() + "/" + getDenom();
	}
	
	int getNum() {
		return this.num;
	}
	
	int getDenom() {
		return this.denom;
	}
	
	Rational invert() {
		return new Rational(this.denom, this.num);
	}
	
	Rational add(Rational r) {
		return new Rational((this.num*r.denom + this.denom*r.num), (this.denom*r.denom));
	}
	
	Rational sub(Rational r) {
		return new Rational((this.num*r.denom - this.denom*r.num), (this.denom*r.denom));
	}
	
	Rational mult(Rational r) {
		return new Rational(this.num*r.num, (this.denom*r.denom));
	}
	
	Rational div(Rational r) {
		return new Rational(this.num*r.denom, (this.denom*r.num));
	}
	
	Rational reduce() {
		//get the ggT of num and denom
		int gcd = gcd(num, denom);
		this.num /= gcd;
		this.denom /= gcd;
		
		return this; 
	}
	static int gcd(int n, int d) { //der ggT von n und d
		int rest = n%d;
		while(rest != 0) {
			n = d;
			d = rest;
			rest = n%d;
		}
		return d;
	}
	
	public static void main(String[] args) {
//		Rational r = new Rational(6, 10);
//		System.out.println(r.text());
//		r.reduce();
//		System.out.println(r.text());
		
		Rational op1 = new Rational(1, 3).add(new Rational(1, 6));
		System.out.println(new Rational(1, 3).text());
		System.out.println(new Rational(1, 6).text());
		System.out.println(op1.getNum());
		System.out.println(op1.getDenom()); 
		System.out.println(op1.text());
		op1.reduce();
		System.out.println(op1.text());
	}
}

















