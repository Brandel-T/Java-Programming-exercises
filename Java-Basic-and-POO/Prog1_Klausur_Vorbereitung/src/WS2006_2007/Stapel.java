package WS2006_2007;

public class Stapel {
	
	// WS2006_2007, Aufgabe_8

	public static void main(String[] args) { 
		Stapel stacks = new Stapel();
		int[][] stapel = {
				{500, 250, 1000},
				{350, 200, 600},
				{100},
				{800}
		};
		System.out.println( stacks.searchStaple(stapel) );

	}
	
	public int searchStaple(int[][] staple) throws RuntimeException {
		int min =0 ; //initiales minimales Gewicht
		for (int i=0; i<staple[0].length; i++)
			min += staple[0][i];
		
		int x = 0; //position des minimalen Stapels
		boolean freeStack=true; //gibt es noch freie Stapel ?
		
		for (int i=0; i < staple.length; i++) {
			
			if (  staple[i].length > 6 )
				freeStack = false;
			else
			{
				int gewicht = 0; //speichert das gesamte Gewicht des Stapels i
				for (int j = 0; j < staple[i].length; j++) {
					if ( staple[i][j] >= 200 && staple[i][j] <= 1750 )
					{
						gewicht += staple[i][j];
						System.out.print(gewicht + " ");
					}
				}
				
				if (min > gewicht && gewicht <= 1750) {
					min = gewicht;
					x = i;
				}
				
				freeStack = min <= (1750-200) ? true : false;
				System.out.println( i +": " + freeStack);
			}
			System.out.println();
		}
//		System.out.println( freeStack );
		if ( !freeStack )
			throw new RuntimeException();
		else
			return x;			
	}

}




































