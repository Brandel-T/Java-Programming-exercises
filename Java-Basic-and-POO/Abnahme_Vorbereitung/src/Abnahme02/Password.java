package Abnahme02;

public class Password {

	public static void main(String[] args) { 
		String s = "Wir wünschen # allen_ frohe, Weihnachten und ein erfolgreiches neues Jahr!";
		System.out.println( createPassword(s) );
//		System.out.println( Character.toUpperCase('#') );

	}
	
	static String createPassword(String s)
	{
		s = s.trim();
		s += " ";
		String password = "";
		String word = ""; //store the current word
		int turn = 1;
		char ch = ' ';
		for (int i=0; i<s.length(); i++) 
		{
			ch = s.charAt(i);
			if ( ! Character.isWhitespace(ch) ) {
				word += ch;
				if ( ! Character.isLetter( s.charAt(s.length()-1) ) && i == s.length()-1 )
					word += s.charAt(s.length()-1) ;
				System.out.println(ch);
			} 
			else 
			{
				System.out.println(word);
				char last = word.charAt(word.length()-1); 
				if ( Character.isLetter(last) )
				{   //nicht vergessen: "Satzzeichen sind ausgeschlossen"
					password += turn == 1 ? Character.toUpperCase( last ) : Character.toLowerCase( last );
					turn = -turn;	
				}
				else 
					password += last;
				
				word = "";				
			}
			
		}
		
		return password;
	}

}
