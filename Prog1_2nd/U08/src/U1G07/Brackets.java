package U1G07;

public class Brackets {
	
	StringBuilder sb;

	public static void main(String[] args)
	{		
		Brackets b = new Brackets(); 
		
		String s = args[0];  
		System.out.println("Input: " + s);
		System.out.println();
		if ( b.testBrackets( s ) )
			System.out.println( "Korrekt" );
		else
			System.out.println( "Nicht korrekt" );
	} 

	
	boolean testBrackets(String s)
	{  
		if ( s.isEmpty() )  
			return false; 

//		StringBuilder sb = null;
		String buffer = "";
		
		char ch;
		int i=0;
		for ( i = 0; i < s.length(); i++ )
		{
//			System.out.println(buffer);
			ch = s.charAt(i); //current character
			
			if (ch == '(')
				buffer += "(";
			else 
				if (ch == '[')
					buffer += "[";
			else 
				if (ch == '{')
						buffer += "{";
			else 
				if (ch == ')') {
					if ( buffer.isEmpty() )
						return false;
					else if ( buffer.charAt(buffer.length() - 1) == '(' )
					{
						sb = new StringBuilder(buffer);
						sb.deleteCharAt( buffer.length() - 1 );
						buffer = sb.toString(); 
					} else return false; 
			}
			else if (ch == ']') {
				if ( buffer.isEmpty() )
					return false;
				else 
					if ( buffer.charAt(buffer.length() - 1) == '[' ) 
					{
						sb = new StringBuilder(buffer);
						sb.deleteCharAt( buffer.length() - 1 );
						buffer = sb.toString();
						
					} else return false; 
			} 
			else if (ch == '}') {
				if ( buffer.isEmpty() )
					return false;
				else 
					if ( buffer.charAt(buffer.length() - 1) == '{' ) 
					{
						sb = new StringBuilder(buffer);
						sb.deleteCharAt( buffer.length() - 1 );
						buffer = sb.toString();
						
					} else return false; 
			}
		}
		
		return buffer.isEmpty();	
	} 
}


























