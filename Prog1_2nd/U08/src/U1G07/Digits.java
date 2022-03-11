package U1G07;

public class Digits {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);  
		
		if (n < 0)
			System.out.println("Input number must be positive");
		else if (n==0)
			System.out.println("zero");
		else
		{
			System.out.println("Input number: "+ n);
			System.out.print("Separated: ");

			printText(n); 
			
			/*
			 * Check if the input number has 0 at the end, because 
			 * the digit 0 at the end disappears when reversed.
			 */
			int rest = n % 10;
			int q = n / 10;
			while (rest == 0) { 
				System.out.print("zero "); 
				rest = q % 10;
				q = q / 10;
			}
		}
	}

	
	static int reverse(int n) 
	{
		int quotient = n/10;
		int rest = n%10;
		while (quotient != 0) {
			rest = rest*10 + (quotient % 10); //Horner schema
			quotient = quotient / 10;
		}
		
		return rest;
	}
	
	
	static void printText(int n) 
	{
		int invert = reverse(n);
		int quotient = invert;
		int rest = 0;
		while (quotient != 0)
		{
			rest = quotient % 10;
			switch (rest) {
				case 0: System.out.print("zero "); break;
				case 1: System.out.print("one "); break;
				case 2: System.out.print("two "); break;
				case 3: System.out.print("three "); break;
				case 4: System.out.print("four "); break;
				case 5: System.out.print("five "); break;
				case 6: System.out.print("six "); break;
				case 7: System.out.print("seven "); break;
				case 8: System.out.print("eight "); break;
				case 9: System.out.print("nine "); break;
				default: System.out.print("__ERROR__ ");
			}
			
			quotient = quotient / 10;
		}
	}
} 














