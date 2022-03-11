
public class BaumDekoration {

	public static void main(String[] args) { 
//		int n = Integer.parseInt(args[0]);
		int n = 9;
		System.out.println("Anzahl der Zeilen: " + n);
		
		for (int i=0; i<n; i++) 
		{
			for (int j=-1; j<n+i+1; j++) 
			{ 
				if (j>=(n-2)-i) 
				{
					if (i%2 == 1) 
					{
						if ( (j == (n-2)-i || j == (n+i)) )
							System.out.print("i");						
						else if (j >= (n-1)-i )
							System.out.print("*");
					} 
					else 
					{
						if (j >= (n-1)-i && j < n+i)
							System.out.print("*");
						else
							System.out.print(" ");
					}
				}
				else
					System.out.print(" "); 
			}
			System.out.println();
 		}

		for (int i=0; i<=n+1; i++) {
			if (i != n)
				System.out.print(" ");
			else
				System.out.print("I");
		}
		
		
		/*
		 * ___________________BAUM MIT DEKORATION(einfacheres Programm)____________
		 */
		int i, j;
//	int n = 7;
		int i2 = 1;
		
		for(int j1=0; j1<=n-i2; j1++)
			System.out.print(" ");
		System.out.println("X");
		for (i=1; i<=n; i++) {
			
			for (j=1; j<=n-i; j++)
				System.out.print(" ");
			
			if (i %2 == 0)
				System.out.print("i");
			else
				System.out.print(" "); 
			
			for (j=1; j<=(2*i-1); j++)  
				System.out.print("*");
			
			
			if (i%2==0)
				System.out.print("i");
			
			System.out.println();
		}
		
		for(i=1; i<=n; i++)
			System.out.print(" ");
		System.out.println("I");

	}

}
