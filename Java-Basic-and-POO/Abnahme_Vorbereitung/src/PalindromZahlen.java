
public class PalindromZahlen {

	public static void main(String[] args) { 

//		int n = Integer.parseInt(args[0]);
		int n = 2002;
		//Palindrom-zahlen von 10 bis n finden
		
		int p = 0;
		int rest = 0;
		int quotient = 0;
		System.out.println("Palindrom Zahlen von 10 bis " + n + " sind: ");
		for (int i = 10; i <= n; i++)
		{
			quotient = i/10;
			rest = i%10;
			p = rest;
			
			while ( quotient != 0 ) {
				rest = quotient % 10;
				p = p*10 + rest;
				quotient = quotient / 10;
			}				
			
			if ( p==i )
				System.out.print(p + " ");
		}
	}
}
