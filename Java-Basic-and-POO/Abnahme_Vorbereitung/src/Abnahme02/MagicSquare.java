package Abnahme02;

import java.util.Arrays;

public class MagicSquare {

	public static void main(String[] args) {
//		int n = Integer.parseInt(args[0]);
		int n = 5;
		int dim = n*n; //dimension
		int[][] magic = new int[n][n];
		System.out.println( Arrays.deepToString(magic) );
		
		//Anfang mit Koordinaten der ersten Zahl : 1
		int row = n/2 + 1; //oder magic.length/2 + 1 --> unterhalb des mittleren Feldes des square
		int col = n/2;	   //oder magic[0].length/2  --> in der mittleren spalte
		int schritt = 3;
		for (int i = 1; i <= dim; i++)
		{
			magic[row][col] = i;
			if ( i == schritt ) { //pruefen, wenn man schon n schritte ueberschritten hat oder nicht
				System.out.println(row+", "+col);
				row = ( row + 2 ) % n;
				System.out.println(schritt);
				schritt = schritt + n;
			}
			else {
				row = (row+1)%n;
				col = (col+1)%n;
			}	 
		}

		System.out.println( Arrays.deepToString(magic) );
	}
}
