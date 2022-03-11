import java.util.StringTokenizer;

public class Blanks {

//	static int comparisons;
//	
//	public static void main(String[] args) {  
////		String str = "   Hallo la    planete          ";
////		String str = "Hallo la   planete  ";
//		String str = "Schreiben Sie eine effiziente Methode searchBlanks(…), die die Länge der längsten Sequenz von Leerzeichen in einem gegebenen String sucht und dabei möglichst wenig Zeichen im String untersucht.";
//		System.out.println("Laengste Sequenz von Leerzeichen: " + searchBlanks(str));
//		System.out.println("Vergleiche: " + comparisons); 
//	}
//
//	static int searchBlanks(String str) 
//	{
//		int max = 0;  
//		StringTokenizer tk = new StringTokenizer(str); 
//		int maxBlank = 0; 
//		String current; 
//		
//		if ( tk.hasMoreTokens() )
//		{
//			current = tk.nextToken(); //current token  
//			//1) blank at the beginning of the string
//			if ( Character.isWhitespace( str.charAt(0) ) ) {
//				int index = str.indexOf(current) ;
//				if ( index > maxBlank ) 
//					maxBlank = index;
//				comparisons++;  
//				str = str.substring( index + current.length()  ); 
////				max = searchBlanks(str);
//			}
//			else { 
//				str = str.substring(current.length());
////				max = searchBlanks( str ); 
//			}
//			return searchBlanks(str);
//		} 
//		else if ( str.charAt(0) == ' ' ) { // check if we have a blank at the end of the string 
//			if ( str.length() > maxBlank )
//				maxBlank = str.length();
//
//			comparisons++; 
//		}  
//		
//		if ( maxBlank > max )
//			max = maxBlank;
//		
//		return max;
//	} 
	
	static String searchBlanks(String text) {
		
		if ( text.isBlank() || text.isEmpty() )
			return null;
		
		int maxBlankLength = -1;
		int countCoparisions = 0;
		
		StringTokenizer tokenizer = new StringTokenizer(text);   
		String current = tokenizer.nextToken();					 
		StringBuilder builder = new StringBuilder(text);		 
		
		//Fall1: es gibt ein "blank" am anfang des Textes
		if ( Character.isWhitespace( text.charAt(0)) ) {
			maxBlankLength = (maxBlankLength < text.indexOf(current)) ? 
							 					text.indexOf(current) :
							 									   -1 ;		 
			countCoparisions++;												 
			text = builder.delete(0, text.indexOf(current)).toString();
		}
		
		//Fall2: text hat kein "blank" am Anfang
		int length;		 
		while ( tokenizer.hasMoreTokens() ) 
		{			 			
			text = builder.delete(0, current.length()).toString(); 
			current = tokenizer.nextToken();	
			length = text.indexOf(current); 
			if (length > maxBlankLength) 	 
				maxBlankLength = length;  

			countCoparisions++;
			text = builder.delete(0, text.indexOf(current)).toString();  
		}
		
		//Fall3: am Ende des Textes gibt es auch ein blank
		if ( Character.isWhitespace( text.charAt( text.length()-1 ) ) )
		{
			length = text.length() - current.length();
			if (length > maxBlankLength) {
				maxBlankLength = length;   
			}
			countCoparisions++ ;
		}
		
		
		return "[Laengste Blank-Laenge = " + maxBlankLength + ", Vergleiche = " + countCoparisions + "]";
	}

	public static void main(String[] args) { 
		String text = "       Beginnen   Sie in der linken     oberen Ecke  des Feldes ";  
		System.out.println( searchBlanks(text) );  
	} 
	
}















