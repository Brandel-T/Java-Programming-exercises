package WS2006_2007;

public class Main {

	
	public static void main(String[] args) {
		
//		boolean a = true;
//		boolean b = false;
//		boolean c = true;
//		boolean d = false;
//		boolean e = ( !(d||c) || (a&&!d)) && (!b&&c);
//		System.out.println(e);
		
		
		SignedRational b1 = new SignedRational(1, 2);
		SignedRational b2 = new SignedRational(-3, 2);
		System.out.println("     b1 = "+b1.toString()+ " , sign:"+ b1.sign);
		System.out.println("     b2 = "+b2.toString()+ " , sign:"+ b2.sign);
		System.out.println("b1 + b2 = "+ SignedRational.sum(b1, b2).toString() );
		
		System.out.println("-------------------");
		double x = 7.0;
		char c ='a';
		int i = 11;
		boolean b = false;
		System.out.println( x + "i-3" );
		System.out.println( c+++i );
		i *=i-3;
		System.out.println(i);
		System.out.println( (i/(int)c)/3 );
//		x = b && !(c>x);
	}

}
