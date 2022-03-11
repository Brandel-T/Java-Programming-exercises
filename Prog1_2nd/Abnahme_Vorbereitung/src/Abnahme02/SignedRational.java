package Abnahme02;

public class SignedRational extends Rational{
	int sign;

	SignedRational(long num, long denom) {
		super(num, denom);  
		if ( (num < 0 && denom > 0) || ( num > 0 && denom < 0 ) ) 
			sign = -1; 
		else if (( num < 0 && denom < 0 ) || ( num > 0 && denom > 0 ))
			sign = 1; 
	}
	
	void correct() { 
		if ( num < 0 && denom > 0 ) 
			System.out.printf("%3d/%d", num, denom);
		else if ( num > 0 && denom < 0 ) 
			System.out.printf("%3d/%d", -num, -denom);
		else if ( num < 0 && denom < 0 ) 
			System.out.printf("%3d/%d", -num, -denom);
		else if ( num > 0 && denom > 0 )
			System.out.printf("%3d/%d", num, denom);	
	}
	
	void normalize() {
		num = num < 0 ? -num : num;
		denom = denom < 0 ? -denom : denom;
	}
	
	SignedRational sum (SignedRational b) {
		return new SignedRational( num*b.denom + denom*b.num, denom*b.denom );
	}
	
	public static void main(String[] args) {
		SignedRational b1 = new SignedRational(-1, 2);
		SignedRational b2 = new SignedRational(-2, 3);
		SignedRational r ;
		
		b1.correct();
		System.out.print(" +");
		b2.correct();
		System.out.print(" =");
		r = b1.sum(b2);
		r.correct();	
		r.normalize();
		r.correct();
		System.out.println("\n-----------------------");
		
		b1 = new SignedRational(3, 4);
		b2 = new SignedRational(-4, 5);
		b1.correct();
		System.out.print(" +");
		b2.correct();
		System.out.print(" =");
		r = b1.sum(b2);
		r.correct();	
		r.normalize();		
		r.correct();
		System.out.println("\n-----------------------");
		
		b1 = new SignedRational(-5, 6);
		b2 = new SignedRational(6, 7);
		b1.correct();
		System.out.print(" +");
		b2.correct();
		System.out.print(" =");
		r = b1.sum(b2);
		r.correct();	
		r.normalize();	
		r.correct();
		System.out.println("\n-----------------------");

		b1 = new SignedRational(7, 8);
		b2 = new SignedRational(8, 9);
		b1.correct();
		System.out.print(" +");
		b2.correct();
		System.out.print(" =");
		r = b1.sum(b2);
		r.correct();	
		r.normalize();
		r.correct();
	}

}
