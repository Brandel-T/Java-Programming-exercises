package Blatt4;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int counter = 0;
		int i = 2; //start number
		
		while (counter <= 5) {
			int sum = 0;
			int j = 1;
			for (j = 1; j <= i/2; j++) {
				if (i%j == 0) {
					sum += j;
				}
			}
			
			if (sum == i) 
			{
				counter++;
				
				System.out.printf("%d = ", sum /*ou aussi i*/);
				int k = 1;
				for (k = i/2; k >=1; k--) {
					if (i%k == 0) {
						if (k != 1) {
							System.out.printf("%d + ", k);						
						} else {
							System.out.println(k);
						}
					}
				}
			}
			i++;
		}

	}

}
