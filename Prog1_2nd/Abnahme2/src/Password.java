
public class Password {

	public static void main(String[] args) { 
		String s = "Wir w\u00FCnschen allen, ein erfolgreiches neues2 Jahr!";
		System.out.println( createPassword(s) ); 
	}

	
	static String createPassword(String s)
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
			if ( !Character.isWhitespace(ch) && !Character.isDigit(ch) && Character.isLetter(ch) || (ch == '?' || ch=='.' || ch=='!') )
				word += ch;
			else 
			{
				boolean isNumber = true; 
				for(int k = 0; k < word.length() && isNumber; k++)
					isNumber = Character.isDigit(word.charAt(k));
				
				if ( ! isNumber ) {
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
	
//	static boolean isNumber(String s) {
//		boolean result = true; 
//		for(int i=0; i<s.length() && result; i++)
//			result = Character.isDigit(s.charAt(i));
//		
//		return result;
//	}

}
