import java.util.Scanner;

public class ArrayTraverse {

	public static void main(String[] args) { 

		int m = Integer.parseInt(args[0]); //row
		int n = Integer.parseInt(args[1]); //column 
//		int m = 3, n = 7;

		Scanner sc = new Scanner(System.in);
		while ( m < 0 ) {
			System.out.println("Enter a positive number of rows: ");
			m = sc.nextInt();
		}
		
		while ( n < 0 ) {
			System.out.println("Enter a positive number of columns: ");
			n = sc.nextInt();
		}
		
		String[][] a = new String[m][n]; 
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				a[i][j] = "o";  
		
		int up = 0;  
		int down = a.length-1;   
		int right = a[0].length-1;  
		int left = 0;    
		
		int rounds = (int) ( Math.ceil(Math.max(m, n) / 2) ) ;
		boolean go = true;
		
		System.out.println( "Right: "  + right );
		for ( int round = 0; round <=rounds && go; round++ )
		{  				
//			printArray(a);			
			if (go) {
				for (int j=up; j<=down && go; j++) {
					if ( a[j][left].equals("o") ) 
						a[j][left] = "x"; 
					else go = false;
				}
				if ( left+1 <= right )
					left++;	 
				up = 0;
			}
			
//			go = !(left == right);
//			printArray(a);
			if (go) { 
				if ( a[down][left].equals("o") )
					a[down][left] = "x"; 
				else go = false; 
				down--;	
			}
			
			for (String[] arr : a) { //each row
				for (String item : arr) //each column
					System.out.print(item + " ");	
				System.out.println();
			}
			System.out.println();	
			
//			printArray(a);
			if (go) {
				for (int j=down ; j>=up && go; j--) {
					if ( a[j][left].equals("o") ) 
						a[j][left] = "x"; 
					else go = false;
				}
				if ( left+1 <= right )
					left++;	 
				
				down = a.length-1; 	
			}
			
//			printArray(a);
			if (go) {  
				if ( a[up][left].equals("o") )
					a[up][left] = "x"; 
				else go = false; 
				up++;	
			}  

//			System.out.println("left: "+ left);
			for (String[] arr : a) { //each row
				for (String item : arr) //each column
					System.out.print(item + " ");	
				System.out.println();
			}
			System.out.println();	
		}
		sc.close();
	}
	
	static void printArray(String[][] a) {
		for (String[] arr : a) { //each row
			for (String item : arr) //each column
				System.out.print(item + " ");	
			System.out.println();
		}
		System.out.println();	
	}
}
