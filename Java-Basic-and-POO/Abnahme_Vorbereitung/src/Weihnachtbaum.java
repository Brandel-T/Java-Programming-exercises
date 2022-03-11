
public class Weihnachtbaum {

	public static void main(String[] args) {
//		int n = Integer.parseInt(args[0]);
		
		int n = 9;
		if ( n<=0 )
			System.out.println("Eingabezahl muss grosser 0 sein");
		else
		{
			System.out.println("Anzahl der Zeilen: " + n);
			for (int i=0; i<n; i++) { //line
				for (int j=0; j<n+i; j++) { //column
					if (j >= ( n-1 )-i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			for (int i=0; i<n; i++) {
				if (i != n-1)
					System.out.print(" ");
				else
					System.out.print("I");
			}
			System.out.println();
			
			//Spiegelung des Baum nach unten
			for (int i=0; i<2*n-1; i++) { //line
				for (int j=0; j<(2*n-1)-i; j++) { //column
					if (j>=i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}

		
//______________EINFACHER BAUM OHNE DEKORATION____________
//		int i, j;
//		int n = 9;
//		int i2 = 1;
//		
////		for(int j1=0; j1<n-i2; j1++)
////			System.out.print(" ");
////		System.out.println("X");
//		for (i=1; i<=n; i++) {
//			
//			for (j=1; j<=n-i; j++)
//				System.out.print(" ");
//		
//			for (j=1; j<=(2*i-1); j++)
//		        System.out.print(i);
//
//			System.out.println();
//		}
//		
//		for(i=1; i<n; i++)
//			System.out.print(" ");
//		System.out.println("I");
//}
	}

}
