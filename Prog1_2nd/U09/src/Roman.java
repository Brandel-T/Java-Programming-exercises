import java.util.Arrays;

//import java.util.Arrays;

public class Roman {
	
	String roman;

	public static void main(String[] args) 
	{	
//		Roman r = new Roman();
////		int number = Integer.parseInt( args[0] );
//		int number = 1984;
//		r.toRoman(number);
//		System.out.println("roman = " + r.getRoman() );
		int[] original = new int[] {71, -4, 7220, 0, 238};
		System.out.println( Arrays.toString(original) );
		System.arraycopy(original, 0, original, 2, 3);
		System.out.println( Arrays.toString(original) );
	}
	
	void toRoman( int number )
	{
//		String result = "";
//		StringBuilder sb = new StringBuilder(result);
		
		if ( number > 0 )
		{
			int fact = 1;
			String str = ""+number;
			int len = str.length();
			for ( int i=1; i<=len; i++ )
			{
				System.out.print("in + ");
				for ( int k=1; k<=(len-i); k++ )
					fact *= 10;
				System.out.println(fact);
				
				int n = Integer.parseInt(str.charAt( i-1 ) + "");
				int nn = n*fact;
				if ( n != 1 && n != 5 )
				{
					if ( nn > 500 && nn < 1000 ) {
						this.setRoman( 500 );
						toRoman( nn-500 );
					}
					else if ( nn > 100 && nn < 500 ) {
						for ( int l=1; l<=n; l++ )
							this.setRoman( 100 );
					}
					else if ( nn > 50 && nn < 100 ) {
						this.setRoman( 50 );
						toRoman( nn - 50 );
					}
					else if ( nn > 10 && nn < 50 ) {
						for ( int l=1; i<=n; l++ )
							this.setRoman( 10 );
					}
					else if ( nn > 5 && nn < 10 ) {
						this.setRoman( 5 );
						toRoman( nn - 5 );
					}
					else if ( nn > 0 && nn < 5 )
						for ( int l=0; l<n; l++ )
							setRoman( 1 );
					
				}
//				this.setRoman(nn);	
				fact = 1;
			}			
		}
//		else if ( number < 0 ) {
//			
//		} 
//		return "";
	}
	
	void setRoman ( int nn ) 
	{
//		String result = "";
		if ( nn == 1 ) roman += "I";
		if ( nn == 5 ) roman += "V";
		if ( nn == 10 ) roman += "X";
		if ( nn == 50 ) roman += "L";
		if ( nn == 100 ) roman += "C";
		if ( nn == 500 ) roman += "D";
		if ( nn == 1000 ) roman += "M";	 
	}
	
	String getRoman() {
		return roman;
	}
}


















