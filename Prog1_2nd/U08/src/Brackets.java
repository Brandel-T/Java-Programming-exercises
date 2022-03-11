

public class Brackets {
	
//	StringBuilder sb;

	public static void main(String[] args)
	{		
		Brackets b = new Brackets(); 
		
//		String s = args[0];  
		String s = "{(bla,blubb)(((blubb,bla), (a=b;)) {blubber; bla (blubb)})}";
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

		StringBuilder sb = null;
		String buffer = "";
		
		boolean returnValue = false;
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
				if (ch == ')')  
					if ( testBrackets(buffer, '(') == false )
						return false;
			else 
				if (ch == ']')  
					if ( testBrackets(buffer, '[') == false )
						return false;
			else 
				if (ch == '}')  
					if ( testBrackets(buffer, '{') == false )
						return false;
			
		}
		
		return buffer.isEmpty() || returnValue; 
	}
	
	static boolean testBrackets(String buffer, char parenthese )
	{
//		System.out.println("buffer = "+ buffer);
//		System.out.print(parenthese+ " ");
		StringBuilder sb = new StringBuilder(buffer); 
		System.out.println(  sb.toString()  );
		if ( buffer.isEmpty() )
			return false; 
		System.out.println(buffer.charAt(buffer.length() - 1));
		if ( buffer.charAt(buffer.length() - 1) == parenthese ) 
		{
			sb.deleteCharAt( buffer.length() - 1 );
			buffer = sb.toString();
			return true;
		} 
		else 
			return false;
	}
}


//
//public class Brackets {
//	
//	StringBuilder sb;
//
//	public static void main(String[] args)
//	{		
//		Brackets b = new Brackets(); 
//		
//		String s = args[0];  
//		System.out.println("Input: " + s);
//		System.out.println();
//		if ( b.testBrackets( s ) )
//			System.out.println( "Korrekt" );
//		else
//			System.out.println( "Nicht korrekt" );
//	} 
//
//	
//	boolean testBrackets(String s)
//	{  
//		if ( s.isEmpty() )  
//			return false; 
//
////		StringBuilder sb = null;
//		String buffer = "";
//		
//		char ch;
//		int i=0;
//		for ( i = 0; i < s.length(); i++ )
//		{
////			System.out.println(buffer);
//			ch = s.charAt(i); //current character
//			
//			if (ch == '(')
//				buffer += "(";
//			else 
//				if (ch == '[')
//					buffer += "[";
//			else 
//				if (ch == '{')
//						buffer += "{";
//			else 
//				if (ch == ')') {
//
//					return testBrackets(buffer, '(', sb);
////					if ( buffer.isEmpty() )
////						return false;
////					else if ( buffer.charAt(buffer.length() - 1) == '(' )
////					{
////						sb = new StringBuilder(buffer);
////						sb.deleteCharAt( buffer.length() - 1 );
////						buffer = sb.toString(); 
////					} else return false; 
//			}
//			else if (ch == ']') {
//
//				return testBrackets(buffer, '[', sb);
////				if ( buffer.isEmpty() )
////					return false;
////				else 
////					if ( buffer.charAt(buffer.length() - 1) == '[' ) 
////					{
////						sb = new StringBuilder(buffer);
////						sb.deleteCharAt( buffer.length() - 1 );
////						buffer = sb.toString();
////						
////					} else return false; 
//			} 
//			else if (ch == '}') {
//				return testBrackets(buffer, '{', sb);
////				if ( buffer.isEmpty() )
////					return false;
////				else 
////					if ( buffer.charAt(buffer.length() - 1) == '{' ) 
////					{
////						sb = new StringBuilder(buffer);
////						sb.deleteCharAt( buffer.length() - 1 );
////						buffer = sb.toString();
////						
////					} else return false; 
//			}
//		}
//		
//		return buffer.isEmpty();	
//	}
//	
//	static boolean testBrackets(String buffer, char parenthese, StringBuilder sb)
//	{
//		System.out.println("buffer = "+ buffer);
//		if ( buffer.isEmpty() )
//			return false; 
//		
//		if ( buffer.charAt(buffer.length() - 1) == parenthese ) 
//		{
//			sb = new StringBuilder(buffer); 
//			sb.deleteCharAt( buffer.length() - 1 );
//			buffer = sb.toString();
//			return true;
//		} 
//		else 
//			return false;
//	}
//}


























