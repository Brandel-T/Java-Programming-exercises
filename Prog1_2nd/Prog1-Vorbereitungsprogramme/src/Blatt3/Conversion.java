package Blatt3;

public class Conversion {

	public static void main(String[] args) { 
		long decimal = Long.parseLong(args[0], 2);
		
		System.out.println( "Die Variable x hat den Wert " + args[0]);
		System.out.println("To decimal : " + decimal); 
		System.out.printf("To hexadecimal : %x %n", decimal); 
		System.out.printf("To octal : %o %n", decimal);
	}
}
