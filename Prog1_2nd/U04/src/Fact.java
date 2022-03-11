
public class Fact {

	public static void main(String[] args) {
//		int n = Integer.parseInt(args[0]);
		long n = 90;
		
		if (n<0)
			System.out.println("Geben Sie bitte eine positive Zahl ein.");
		else if (n==0||n==1)
			System.out.println(1);
		else {
			long factorial = 1;
			for (long i = 1; i <= n; ++i) 
				factorial *= i;
			
			System.out.println(factorial);
		}
	}
}
