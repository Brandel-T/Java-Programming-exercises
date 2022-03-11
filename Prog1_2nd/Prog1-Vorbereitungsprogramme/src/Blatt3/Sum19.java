package Blatt3;

public class Sum19 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 19;
		while (i < 999) {
			if (i > 100) {
				sum += i;
				System.out.printf("%d ", i);
				
				if (i+19 < 999) {
					System.out.print("+ ");					 
				}
			}
			i += 19;
		}
		System.out.printf("= %d", sum); 

	}

}
