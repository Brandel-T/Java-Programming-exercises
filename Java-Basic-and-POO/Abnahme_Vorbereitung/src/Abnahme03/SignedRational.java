package Abnahme03;

public class SignedRational extends Rational {
	
	int sign;

	SignedRational(long num, long denom) { 
		super(num, denom);
		if ( this.num < 0 || this.denom < 0 )
		{
			if ( this.num < 0 ) { 
				if ( this.denom > 0 ) 
					this.sign = -1; 
				else if ( this.denom < 0 )  
					this.sign = 1; 
			}
			else if ( this.denom < 0 )  		
				this.sign = -1;		 
		} else
			this.sign = 1; 
	}
	
	void normalized() {
		if ( this.num < 0 || this.denom < 0 )
		{
			if ( this.num < 0 ) {
				this.num *= -1;
				if ( this.denom > 0 ) 
					this.sign = -1; 
				else if ( this.denom < 0 ) { 
					this.denom *= -1;
					this.sign = 1;
				}
			}
			else if ( this.denom < 0 ) {
				this.denom *= -1;				
				this.sign = -1;				
			}
		} else
			this.sign = 1;
	}
	
	static SignedRational sum(SignedRational b1, SignedRational b2) {
		Rational r = b1.sum(b2);   
		return new SignedRational( r.num, r.denom ); 
	}
	
	public static void main(String[] args) { 
		
		SignedRational sr1 = new SignedRational(-1, 2);
		SignedRational sr2 = new SignedRational(-2, 3);
		System.out.print ( sr1 +" + " + sr2 + " = " + sum(sr1, sr2) + " [sign: "+ sum(sr1, sr2).sign +"]"); 

		System.out.println( );
		
		SignedRational sr3 = new SignedRational(3, 4);
		SignedRational sr4 = new SignedRational(-4, 5);
		System.out.print ( sr3 +" + " + sr4 + " = " +sum(sr3, sr4) + " [sign: "+ sum(sr3, sr4).sign +"]" ); 
		
		System.out.println( );
		
		SignedRational sr5 = new SignedRational(-5, 6);
		SignedRational sr6 = new SignedRational(6, 7);
		System.out.print ( sr5 +" + " + sr6 + " = " + sum(sr5, sr6) + " [sign: "+ sum(sr5, sr6).sign +"]"); 

		System.out.println( );
		
		SignedRational sr7 = new SignedRational(7, 8);
		SignedRational sr8 = new SignedRational(8, 9);
		System.out.print ( sr7 +" + " + sr8 + " = " + sum(sr7, sr8) + " [sign: "+ sum(sr7, sr8).sign +"]");
	}

}
