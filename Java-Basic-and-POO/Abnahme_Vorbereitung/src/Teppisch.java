
public class Teppisch {

	/* TEPPISCH
	 * * * * * 0 * * * * *
	 * * * * 0 0 0 * * * *
	 * * * 0 0 0 0 0 * * *
	 * * 0 0 0 0 0 0 0 * *
	 * 0 0 0 0 0 0 0 0 0 *
	 0 0 0 0 0 0 0 0 0 0 0
	 * 0 0 0 0 0 0 0 0 0 *
	 * * 0 0 0 0 0 0 0 * *
	 * * * 0 0 0 0 0 * * *
	 * * * * 0 0 0 * * * *
	 * * * * * 0 * * * * *
	 */
	
	//ca varie lorsque le nombres est impair
	public static void main(String[] args) {

//		int size = Integer.parseInt(args[0]);  //hauteur du tapis
		int size = 11;
		int k = 1;
		int middle = 0;
		
		if (size%2==0) 
			middle = size/2; 
		else 
			middle = size/2 + 1; 
		
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) { 			
				
				if ( row <= size/2 ) { 
					if (col >= middle -1 - row && col <= size/2 + row)
						System.out.print("o ");
					else 
						System.out.print("- ");	
				} 
				else { 
					if (col >= k && col < size-k)
						System.out.print("o ");
					else
						System.out.print("- ");	
				}
			}
			if (row > size/2) //on commenceà incrémenter k lorsqu'on a atteint le milieu du tapis
				k++;
			System.out.println();
		} 		
	}
}
















