
public class RootFromProduct 
{

	public double calculate(double[] numbers) throws NegativNumberException, NullPointerException
	{
		double multiplicator = 1;
		for(double e : numbers)
		{
			if(e < 0) {
				throw new NegativNumberException("number(s) must be positiv ");
			} 
			 
			multiplicator *= e;
			 	
		}
		 		
		return Math.sqrt(multiplicator);
	}
	
	
	public static void main(String[] args)
	{ 
		double numbersArray[] = new double[args.length];
		double number; 		 
		
		RootFromProduct nn = new RootFromProduct();
		try 
		{
			if(args.length == 0)
			{ 
				throw new NullPointerException("please, enter parameter");
			}
			
			for(int i=0; i<args.length; i++)
			{
				number = Double.valueOf(args[i]); 
				numbersArray[i] = number;
			}
			
			System.out.println(nn.calculate(numbersArray));
		}
		catch (NegativNumberException e) 
		{
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("please, enter parameter !");;
		}
		catch(IllegalArgumentException e) {
			System.out.println("no character or string allowed !");
		}
	
	}
	 
}
