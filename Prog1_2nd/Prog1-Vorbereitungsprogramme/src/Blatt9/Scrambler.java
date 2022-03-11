package Blatt9;

public class Scrambler {
	public static void main( String[ ] args ) { //1: "void"
		String s = "1234567890"; //2: ";" 
		System.out.println( scramble(s) );
	}
	
	public static String scramble( String a ) { //3: "return"
		return convert(a.substring(0,a.length()/2)) +
				convert(a.substring(a.length()/2,a.length()));
	}
	
	public static String convert( String b ) { //4: "static" (die Methode scramble ist static und kann somit nur auf andere statische Methoden zugreifen)
		return b.substring(0,b.length()/3) +
				b.substring(b.length()*2/3,b.length()) +
				b.substring(b.length()/3,b.length()*2/3);
	}
}
