
public class Igru2 {

	public static void rekursion(int n)
	{
		n = n-1;
		System.out.println("Abstieg " + n);
		if(n != 0)
			rekursion(n);
		System.out.println("-----> " + n);
	}
	
	public static long potenz(int n) {
		long var = 1;
		if(n==1)
			return 3; 
		if(n>1)
			System.out.println("-- Abstieg :");
			var = var * 3*potenz(n-1);
			System.out.println();

		
		return var;
	}
	
	public static long pow(int n) {
		long tmp = 1;
		System.out.println(" ");
		if(n == 1) 
			return 3;
		if( n>1 )
			if( n%2 == 0)
				tmp = tmp * pow(n/2)*pow(n/2);
				System.out.println("Aufstieg !"+ 3*pow(n-1));
			if( n%2 != 0)
				tmp = tmp * 3*pow(n-1); 
		return tmp;
	}
	
	public static void main(String[] args)
	{
		rekursion(3);
		System.out.println("\n-------- potenz -------");
		System.out.println( potenz(4) );
		
		System.out.println("\n--------- pow ---------");
		System.out.println( pow(4) );
	}

}
