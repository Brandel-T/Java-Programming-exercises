package Blatt7;

public class Quer {
	
	static int querSumOf(int n) {
		int sum = 0;
		
		if ( n < 0 )
			return -1;
		else {
			int quotient = n;
			
			while(quotient != 0) {
				sum += (quotient % 10);
				quotient /= 10; 
			}
		}
		
		return sum;
	}
	
	static void hasQuerSum(int n) {
		if ( n<0 )
			System.out.println("Eingabezahl muss positiv sein");
		else {
			int i = 0;
//			System.out.println("Zahlen zwischen 0 und 1000 deren Quersumme gleich " + n + " ist, sind: ");
			for (i = 0; i <= 1000; i++) {
				if (querSumOf(i) == n) 
					System.out.printf("%d ", i);
			}
			System.out.println();
		}
	}
	
	static void querMultipleOf(int m) {
		if ( m < 0 )
			System.out.println("Eingabezahl muss positiv sein");
		else {
			int i = 0;
//			System.out.println("Zahlen zwischen 0 und 1000 deren Quersumme ein Vielfaches von " + m + " ist, sind: ");
			for (i = 0; i <= 1000; i++) {
				if (querSumOf(i) % m == 0)
					System.out.printf("%d ", i);
			}
			System.out.println();
		}
	}
	
	static int qt(int n) {
		int quer = querSumOf(n);
		
		if (n < 0 )
			return -1;
		else {
			while(quer/10 != 0) {
				quer = querSumOf(quer);
			}
		}					
		
		return quer;
	}
	
	static int querProductOf(int n) {
		
		int product = 1;
		
		if ( n < 0 )
			return -1;
		else {
			int quotient = n;
			
			while (quotient != 0) {
				product *= (quotient % 10);
				quotient /= 10;
			}
		}
		
		return product;
	}
	
	static void querMixt() {
		int i = 0;
		System.out.println("Die Zahlen zwischen 0 und 1000, deren die Summe ihrer Quersumme und Querproduktes die Zahl wieder ausgibt sind: ");
		for (i = 0; i < 1001; i++) {
			if ( (querSumOf(i) + querProductOf(i)) == i)
				System.out.printf("%d ", i);			
		}		
	}
	

}
