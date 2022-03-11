
public class PascalTriangle {

	 //KEINE "UMLAUTE" AUCH IN KOMMENTAREN	
	
	public static void main(String[] args) { 
		
//		int n = Integer.parseInt(args[0]); 
		int n = 21;
		
		long factN = 1; //zur Berechnung der factoriel von lines: n! 
		long factK = 1; //zur Berechnung der factoriel von col: k!
		long factNK = 1; // (n-k)!
		long koef = 0; //binolmial-Koef. = (n, k) = n!/(k!*(n-k)!) 
		
		System.out.println("Anzahl auszugebender Zeilen: n = " + n);
		for (long line=0; line<n; line++) //Zeilen Durchlauf 
		{ 
			System.out.printf("%-3d: ", line);
			factN = (line==0) ? 1 : factN*line; //Fakultaet von lines (Zaehler) berechnen
			
			for (long col=0; col<=line; col++) //Spalten Durchlauf
			{				
				factK = (col==0) ? 1 : factK*col; 
				
				for (long l=0; l<=line-col; l++)  //Kreuzung von Zeile und Spalte			
					factNK = (l==0) ? 1 : factNK*l;
				
				koef = factN/(factK*factNK);
				System.out.printf("%d ", koef);
			}
			System.out.println();
		}
	}
}