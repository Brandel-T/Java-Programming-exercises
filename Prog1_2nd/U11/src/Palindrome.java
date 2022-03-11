
public class Palindrome {

	public static void main(String[] args) { 
		System.out.println( isPalindrome( "Eine treue Familie bei Lima feuerte nie" ) );
	}
	
	static boolean isPalindrome(String s) { 
		s = s.replace(" ", ""); 
		StringBuilder sb = new StringBuilder(s);
		sb.reverse(); 
		return s.equalsIgnoreCase( sb.toString() ) ? true : false;
	}
}
