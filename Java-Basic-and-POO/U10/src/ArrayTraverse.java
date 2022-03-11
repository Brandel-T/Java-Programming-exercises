
import java.util.Scanner;

public class ArrayTraverse {

//	public static void main(String[] args) { 
//
//		int m = Integer.parseInt(args[0]); //row
//		int n = Integer.parseInt(args[1]); //column
//
//		Scanner sc = new Scanner(System.in);
//		while ( m < 0 ) {
//			System.out.println("Enter a positive number of rows: ");
//			m = sc.nextInt();
//		}
//		
//		while ( n < 0 ) {
//			System.out.println("Enter a positive number of columns: ");
//			n = sc.nextInt();
//		}
//		
//		int[][] a = new int[m][n]; 
//		for (int x[] : a)
//			for (int y : x)
//				y = 0;
//		 
//		int up = 0;  
//		int down = a.length-1;   
//		int left = 0;  
//		int right = a[0].length-1;   
//		
//		int rounds = (int)Math.min(m, n) / 2;
//		
//		for ( int round = 0; round <=rounds; round++ )
//		{
//			for ( int j=left; j<=right; j++ )  
//				a[left][j] = 1; //visited 
//
//			up++;
//			for ( int j=up; j<=down; j++ )  
//				a[j][right] = 1; //visited  
//			
//			right--;
//			for ( int j=right; j>=left; j-- ) 
//				a[down][j] = 1; //visited  
//			
//			down--;
//			for ( int j=down; j>=up; j-- ) 
//				a[j][left] = 1; //visited 
//			
//			left++;
//			
//			printArray(a);
//			
//		}
////	
//		
//	}
//	
//	static void printArray(int[][] a) {
//		for (int[] arr : a) { //each row
//			for (int item : arr) //each column
//				System.out.print(item + " ");	
//			System.out.println();
//		}
//		System.out.println();	
//	}
	
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
	
		Scanner sc = new Scanner(System.in);
		while ( m < 0 ) {
			System.out.println("Enter a positive number of rows: ");
			m = sc.nextInt();
		}
		
		while ( n < 0 ) {
			System.out.println("Enter a positive number of columns: ");
			n = sc.nextInt();
		}
		
		int[][] field = new int[m][n];
		print(field);
		start(field);
	}

	static void print(int[][] field) {
		for (int m = 0; m < field.length; m++) {
			for (int n = 0; n < field[0].length; n++) {
				System.out.print(field[m][n] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void start(int[][] field) {
		int up = 0;
		int down = field.length - 1;
		int left = 0;
		int right = field[0].length - 1;
		int count = Math.min(field[0].length, field.length);

		for (int j = 0; j <= count / 2; j++) {
			for (int i = left; i <= right; i++) {
				if(field[up][i] == 0){
					field[up][i]++;
					print(field);
				}
			}
			up++;
			for (int i = up; i <= down; i++) {
				if(field[i][right] == 0){
					field[i][right]++;
					print(field);
				}
				
			}
			right--;
			for (int i = right; i >= left; i--) {
				
				if(field[down][i] == 0){
					field[down][i]++;
					print(field);
				}
				
			}
			down--;
			for (int i = down; i >= up; i--) {
				
				if(field[i][left] == 0){
					field[i][left]++;
					print(field);
				}
				;
			}
			left++;
		}
	}

}
