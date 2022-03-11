package Blatt8;

public class Digits {
	
	public static void getDigits(int n) {
		
		int input = reverse(n);
		
		if (input < 0)
			System.out.println("Zahl muss positiv sein");
		else {
			int quotient = input;
			int rest = input%10;
			
			while (0 != quotient) {
				switch(rest) {
				case 0:
					System.out.print("zero ");
					break;
				case 1:
					System.out.print("one ");
					break;
				case 2:
					System.out.print("two ");
					break;
				case 3:
					System.out.print("three ");
					break;
				case 4:
					System.out.print("four ");
					break;
				case 5:
					System.out.print("five ");
					break;
				case 6:
					System.out.print("six ");
					break;
				case 7:
					System.out.print("seven ");
					break;
				case 8:
					System.out.print("heigth ");
					break;
				case 9:
					System.out.print("nine ");
					break;				
				}
				
				quotient = quotient / 10;
				rest = quotient % 10;
			}
			System.out.println();
		}
	}

	
	public static int reverse(int n) { 
		int inverse;
		if (n < 0)
			return -1;
		else {
			int quotient = n, rest = n%10; 
			inverse = 0; 
			while ( 0 != quotient) {   
				inverse = (inverse + rest) * 10; //*********HORNER SCHEMA***********
				quotient = quotient / 10;
				rest = quotient % 10; 
			}
			inverse = inverse / 10;
		} 
		return inverse;
	}

	public static void main(String[] args) { 
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(reverse(237045));
//		getDigits(237045);
		
//		int input = Integer.parseInt(args[0]) ;
		int input = 10230;
		System.out.println("input = "+ input);
		System.out.println(reverse(input));
		System.out.print("Separeted: ");
		getDigits(input);
		
		int a=5;
		int b = 1;
//		System.out.println(++a);
//		System.out.println(a++);
		int x = ++b;
		System.out.println(x);
		System.out.println(b);
		System.out.println();
		int y = a--;
		System.out.println(y);
		System.out.println(a);
		System.out.println("----------\n"+ (int)Math.log10(2840) );
	}
}
