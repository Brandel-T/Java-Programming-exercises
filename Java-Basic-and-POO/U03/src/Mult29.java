
public class Mult29 {

	public static void main(String[] args) {
		long limes = 200; 
		long mult = 1;
		for (int number = 29; number <= limes; number += 29)
		{
			if (number >= 100 && number % 29 == 0) {
				mult *= number;
				if (number+29 <= limes) 
					System.out.printf("%d * ", number);
				else
					System.out.printf("%d", number);	
			}
		}
		System.out.printf(" = %d", mult);
	} 

}
