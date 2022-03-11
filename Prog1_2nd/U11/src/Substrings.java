
import java.util.Scanner;
import java.util.StringTokenizer;

public class Substrings {

	public static void main(String[] args) { 
		String s = "Schreiben Sie ein Java Programm Substrings mit einer Methode";
		searchSubstring(s);		
	}
	
	public static void searchSubstring(String s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie eine Folge von Woerter ein: ");
		String words = sc.nextLine();  
		StringTokenizer stk = new StringTokenizer(words);
		String word = "";
		while ( stk.hasMoreTokens() )
		{
			word = stk.nextToken(); 
			if ( s.contains(word) ) 
				System.out.println( word ); 
		} 
		
		sc.close();
	}
}
