package WS2006_2007;

public class SignedRational extends Rational {

	int sign=1;
	
	SignedRational(long num, long denom) {
		super(num, denom); 
		if (num<0 && denom!=0) {
			if(denom < 0) 
				sign = 1;
			else sign = -1;
		} 
		else if ( num > 0 && denom != 0 ) {
			if (denom > 0) 
				sign = 1;
			else sign = -1;
		}
	}
	
	public void normalize() {
		if (num<0)
			num *= -1;
		if (denom<0)
			denom *= -1;
	}
	
	static Rational sum(SignedRational b1, SignedRational b2) {
		b1.normalize();
		b2.normalize();
		b1.num *= b1.sign;
		b2.num *= b2.sign;
		return b1.sum(b2);
	}
}