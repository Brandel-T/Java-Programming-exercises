
public class QuerMain {

	public static void main(String[] args) 
	{ 
		if (args.length == 5) 
		{
			int n1 = Integer.parseInt(args[0]);
			int n = Integer.parseInt(args[1]);
			int m = Integer.parseInt(args[2]);
			int n2 = Integer.parseInt(args[3]);
			
			int n3 = Integer.parseInt(args[4]);
			//1.
			if ( n1 < 0 )
				System.out.println("First argument must be positive natural number");
			else 
				System.out.printf("crossSum(%d) = %d %n", n1, Quer.crossSum(n1));
			//2.
			if ( n < 0 )
				System.out.println("\nsecond argument must be positive natural number");
			else {
				System.out.println("\nNumbers from 0 to 1000, whose cross sum is " + n + " are: ");
				Quer.crossSumList(n);
			}	
			//3.
			if ( m <= 0 )
				System.out.println("\nthird argument must be greater than 0");
			else {
				System.out.println("\nNumbers from 0 to 1000, whose cross sum is a multiple of " + m + " are: ");
				Quer.crossMultipleList(m);
			}
			//4.		
			if ( n2 < 0 )
				System.out.println("\nfourth argument must be positive natural number");
			else 
				System.out.printf("\nqt(%d) = %d %n", n2, Quer.qt(n2));
			//5.			
			if ( n3 < 0 )
				System.out.println("\nfifth argument must be positive natural number");
			else 
				System.out.printf("\ncrossProduct(%d) = %d %n", n3, Quer.crossProduct(n3));
			//6.
			Quer.crossMix();
		}
		else
			System.out.println("Please, enter 5 positive numbers");			
	}
}
