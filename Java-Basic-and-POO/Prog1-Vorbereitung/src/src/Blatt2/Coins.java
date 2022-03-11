package Blatt2;

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
 
//		System.out.println("doub = " + doub);
		int intPart = (int)dollar;
//		System.out.println("intPart = "+intPart);
		int decimal =(int) (dollar*100 - intPart*100); 
//		System.out.println("decimal = " +decimal);

		buck = intPart;
		half =0;
		quarter =0;
		dime =0;
		nickel=0;
		penny=0;		
		
		while ( decimal > 0 ) 
		{
			if (decimal >= 50 ) {
				half = decimal/50; 
				decimal = decimal%50; 
			} 
			if (decimal >= 25 && decimal < 50) {
				quarter = decimal / 25; 
				decimal = decimal % 25; 
			}
			if (decimal >= 10 && decimal < 25) {
				dime = decimal / 10; 
				decimal = decimal % 10; 
			}
			if (decimal >= 5 && decimal < 10) {
				nickel = decimal / 5; 
				decimal = decimal % 5; 
			} 
			if (decimal >= 1 && decimal < 5) {
				penny = decimal ;
				decimal = decimal % 1; 
			}
			System.out.println("decimal = " + decimal);
		}
		// Print values
		System.out.println(buck + " x 1 Dollar");
		System.out.println(half + " x 50 Cent");
		System.out.println(quarter + " x 25 Cent");
		System.out.println(dime + " x 10 Cent");
		System.out.println(nickel + " x 5 Cent");
		System.out.println(penny + " x 1 Cent");
	}
}
