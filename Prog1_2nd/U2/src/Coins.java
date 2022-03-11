public class Coins {

	public static void main(String[] args) { 
		// Getting the total dollar amount
		double dollar = Double.parseDouble(args[0]);
		int buck; // Number of 1 Dollar coins
		int half; // Number of 50 Cent coins
		int quarter; // Number of 25 Cent coins
		int dime; // Number of 10 Cent coins
		int nickel; // Number of 5 Cent coins
		int penny; // Number of 1 Cent coins
		
		// ...put your code here...
		buck = (int)dollar;
		//i want to get the decimal par of dollar
		/**
		 * HINWEIS:
		 * der dezimaler Teil eines 
		 * Betrages ist immer < 100
		 */
		dollar = dollar*100;
		int decimalPart = (int)dollar - buck*100;
		half = decimalPart/50;
		decimalPart %= 50;
		quarter = decimalPart/25;
		decimalPart %= 25;
		dime = decimalPart/10;
		decimalPart %= 10;
		nickel = decimalPart/5;
		decimalPart %= 5;
		penny = decimalPart;
		
		// Print values
		System.out.println(buck + " x 1 Dollar");
		System.out.println(half + " x 50 Cent");
		System.out.println(quarter + " x 25 Cent");
		System.out.println(dime + " x 10 Cent");
		System.out.println(nickel + " x 5 Cent");
		System.out.println(penny + " x 1 Cent");
	}

}
