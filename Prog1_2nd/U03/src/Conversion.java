public class Conversion {

	public static void main(String[] args) { 
		
		long x = Long.parseLong(args[0], 2);
		int xx = (int)x;
		
		System.out.println("Die Variable x hat den Wert : " + args[0]);
		System.out.printf("Der dezimale Darstellung von x ist : %d %n", xx);
		System.out.printf("Der Hexadezimale Wert von x ist : %x %n", xx); 	
	}
}