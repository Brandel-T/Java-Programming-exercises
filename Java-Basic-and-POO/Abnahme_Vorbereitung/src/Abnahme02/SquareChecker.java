package Abnahme02; 

public class SquareChecker {
	
	public static void main(String[] args) {	
//		int min = '0';
//		char ch = 57;
//		System.out.println( "min = "+min );
//		System.out.println( "char = "+ch );
//		System.out.println((int)'0' + ", "+ (int)'a' + " , " + (int)'A');

		char [ ] [ ] square = {
			{'3', 'F', 'E', 9},
			{2, 4, 'A', 8},
			{1, 'B', 5, 7},
			{0, 'C', 'D', 6}
		}; 
		
		System.out.println("The square is " +
			(allHexDigitsUsed(square)  ?  ""  :  "in" ) +  "valid." ); 
	}
		
	public static boolean allHexDigitsUsed (char[][] a) 
	{  
		boolean result = true;   
		for (int i=0; i<a.length && result; i++) 
			for (int j=0; j<a[i].length && result; j++) 
			{
				for (int k= i; k<a.length && result; k++) //important
					for (int l=(j + 1); l<a[k].length && result; l++) //important
						result = a[i][j] == a[k][l] ? false : true;
			}
						
		return result;
		
	}
} 
