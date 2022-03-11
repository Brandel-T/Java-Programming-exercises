package Abnahme02; 

public class Password2 {
	
	public static void main(String[] args) {
		String s = "we wish all, prog1 students a merry christmas and a happy new 76 year 2021!";
		System.out.println( createPassword(s) );
		System.out.println("-------------\n\n" + isNumber("12o45"));

	}
	
	public static String createPassword(String s)
	{
		s = s.trim();
		s = s + " ";
		String pwd = "";
		int turn = 1; 
		String word = "";
		int len = s.length();
		char ch = ' ';
		
		for(int i = 0; i < len; i++)
		{
			ch = s.charAt(i);
			if ( ch != ' ' && ch != '*' && ch != '~' && ch != '\'' && ch != '#' && ch != '_' && 
				 ch != '<' && ch != '>' && ch != '|' && ch != '`' && ch != '}' && ch != '{' && 
				 ch != '(' && ch != '/' && ch != ')' && ch != '[' && ch != ']' && ch != '^' && 
				 ch != '$' && ch != '§' )  
				word += ch;
			else 
			{
				
				if ( ! isNumber(word) ) {
					System.out.println(word);
					char last = word.charAt(word.length()-1);
					char first = word.charAt(0);
					
					if ( ! Character.isLetter(last) )  
						pwd += last;
					else {
						pwd += turn == 1 ? Character.toLowerCase(first) : Character.toUpperCase(first);
						turn = -turn;
					}
				}
				
				word = "";
			}			
		}
		
		return pwd;
	}
	
	public static boolean isNumber(String s) {
		boolean result = true;
		char ch =' ';
		for(int i=0; i<s.length() && result; i++)
			result = Character.isDigit(s.charAt(i));
		
		return result;
	}
}
