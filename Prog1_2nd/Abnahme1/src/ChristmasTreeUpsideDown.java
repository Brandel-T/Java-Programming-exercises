
public class ChristmasTreeUpsideDown {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]); 
		
		System.out.printf("Anzahl der (Baum-)Zeilen: %d%n%n", n);


		for (int i=0; i<n-1; i++) 
			System.out.print(" "); 

		System.out.println("I"); 
		
		
		for (int i=0; i<n; i++) { //line
			for (int j=0; j<(2*n-1)-i; j++) { //column
				if (j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
		for (int i=0; i<n-1; i++) 
			System.out.print(" "); 

		System.out.print("X"); 
	}
}
