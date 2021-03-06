
public class IntegerArithmetic 
{
	
	static long log(long n) throws ArithmeticException
	{
		long count = 0; //(logarithme_)
		
		if(n <= 0)
		{
			throw new ArithmeticException("entered value must be positiv");
		} 
		
		for(long i=n; i>1; i=i/2)
		//oder for(long i=2; i<=n; i=i*2)
		{
			count++;
			//assert i == 0 : "i hat 0 erreicht";
		}
		
		return count; //(logarithme_)
	}
	
	public static void main(String[] args)
	{

		long n = Long.parseLong(args[0]);
		System.out.println(log(n));
//		System.out.println(log(16));
//		System.out.println(log(81));
//		System.out.println(log(4294967295L));
//		System.out.println(log(0));
	}
	
}
