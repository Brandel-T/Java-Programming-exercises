package WS2008_2009;

public class NotAvailableException extends Exception {
	NotAvailableException(){}
	NotAvailableException(String message) {
		super(message); 
	}
	
	static boolean b() {
		for (int i=0; i<7; i++)
		{
			System.out.print(i+" ");
			if (i==5)
				return false;
		}
		return true;
	}
	
	int[] ret() {
		return new int[] {1, 4};
	}
	
	static String decimalToBinary(int d) {
		if (d<0) return null; 
		if (d<=1) return d+"";
		String erg="";
		while(d!=0) {
			erg += (d%2);
			d /= 2;
		}
		StringBuilder sb = new StringBuilder(erg);
		return sb.reverse().toString();
	}
	
	public static int a( int n, int m )
	{ 
	if( n==0 )
	return 1;
	else {
		System.out.println(a( n-1, m+2 ) +"-----");
		return (m+n)*a( n-1, m+2 );
	}
	}
	
	public static void main(String[] args) {
		
		System.out.println( Integer.parseInt("9", 16) );
		
		for (int a=0; a<100; a++)
			for (int b=0; b<100; b++)
				for (int c=0; c<100; c++)
					if (a<b) {
						int d = 145 -(a+b+c);
						if (Math.pow(a,d)/(50-c)==b*Math.pow(4,d)) 
							System.out.println(a +", "+ b+", "+c+", "+d);
					}
		System.out.println("------------");
		
		System.out.println(  decimalToBinary(11) );
		
		System.out.println( a(4,-2) );
		
		System.out.println( Math.log(10) );
		System.out.println( Math.log10(10) ); 
		System.out.println(b());
	}
}
