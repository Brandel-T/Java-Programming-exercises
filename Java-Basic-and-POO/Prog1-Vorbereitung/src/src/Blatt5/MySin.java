package Blatt5;

public class MySin {

	/*
	 * cette methode permet de d?terminer une approximation
	 * de la fonction Sinus
	 * ---- cet exo est tir? d'un Altmeister(du 09.06.2005)
	 * sur Google Drive
	 * */
	public double getSin(double x, int n) {
		
		double result = 0;
		
		if (x < 0 && n < 0)
			return 999;
		else {
			double num = x, diff = 0;
			int i = 1, denom = 1, sign = -1;
			double altTerm = 0, neuTerm = x;
			
			int l = 1;
			
			do {
				altTerm = neuTerm ;
				num = num*x*x;
				denom = denom*(i+1)*(i+2);
				neuTerm = sign*num/denom;
				diff = altTerm + neuTerm;
				result = result + diff; 
//				System.out.println("result = " + result);
				System.out.print(" " + altTerm + " " + neuTerm);
				System.out.println(" = " + diff);
//				System.out.println("denom = " + denom);
				
				i = i+2;
				sign = -sign;
				
				l = l+1;
			} while(l < n );
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		MySin sin = new MySin();
		System.out.println(sin.getSin(90, 18));
	}
	
	
}
