
public class Rational {

	int num;
	int denom;
	
	Rational() {
		this(0);
	}
	
	Rational(int n) {
		this(n, 1);
	}
	
	Rational(int n, int d) {
		if (d < 0) {
			num = -n;
			denom = -d;
		} 
		else
			if ( d == 0)
				throw new ArithmeticException();
		else {
			num = n;
			denom = d;
		}
	}
	
	Rational(Rational r) {
		num = r.num;
		denom = r.denom;
	}
	
	String text() {
		if (getDenom() == 1)
			return "" + getNum();
		return getNum() + "/" + getDenom();
	}
	
	int getNum() {
		return num;
	}
	
	int getDenom() {
		 if (denom < 0) {
			 denom = -denom;
			 num = -num;
		 }
		 
		 return denom;
	}
	
	Rational invert() {
		return new Rational(1, 1).div(new Rational(this.getNum(), this.getDenom())); 
	}
	
	Rational add(Rational r) {
		return new Rational( getNum()*r.getDenom() + getDenom()*r.getNum(), getDenom()*r.getDenom() );
	}
	
	Rational sub(Rational r) {
		return new Rational( getNum()*r.getDenom() - getDenom()*r.getNum(), getDenom()*r.getDenom() );
	}
	
	Rational mult(Rational r) {
		return new Rational(getNum()*r.getNum() , getDenom()*r.getDenom());
	}
	
	Rational div(Rational r) {
		return new Rational(getNum()*r.getDenom(), getDenom()*r.getNum());
	}
	
	Rational reduce() {
		//get the gcd 
		int gcd;
		int n = this.getNum();
		int d = this.getDenom();
		int rest = n % d;
		while (rest != 0) {
			n = d;
			d = rest;
			rest = n % d;
		}
		
		gcd = d;
		this.num = this.num / gcd;
		this.denom = this.denom / gcd;
		
		return this;
	}
}
