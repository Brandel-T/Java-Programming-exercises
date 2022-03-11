package SS2005;

public class Scrambler {

	public static void main(String[] args) { 
		String s = "1234567890";
		System.out.println( scramble(s) );
	}

	
	public static String scramble(String a) {
		return convert( a.substring(0, a.length()/2) ) + 
		convert( a.substring(a.length()/2, a.length()) );
	}
	
	public static String convert( String b ) {
		return b.substring(0, b.length()/3) + 
			   b.substring(b.length()*2/3, b.length()) + 
			   b.substring(b.length()/3, b.length()*2/3);
	}
}
