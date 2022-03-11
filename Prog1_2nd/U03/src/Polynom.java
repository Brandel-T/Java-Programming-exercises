
public class Polynom {

	public static void main(String[] args) {
 
		System.out.println("Geben Sie die Koeffiziente in dieser Reihenfolge ein a b c");
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]); 
		
		//Discriminant
		double d = b*b - 4*a*c;
		//Loesungen
		double x1 = (-b-Math.sqrt(d))/(2*a);
		double x2 = (-b+Math.sqrt(d))/(2*a);
		double xx = -b/(2*a); //doppelte reelle Loesung

		if ( a == 0 && b == 0 && c == 0 )
			System.out.println("Jede Komplexe Zahl x ist loesung dieser gleichung");
		else  if ( a == 0 && b == 0 && c != 0 )
			System.out.println("keine komplexe zahl x ist Loesung dieser Gleichung");
		else if ( a == 0 && b != 0 ) 
			System.out.printf("Es existiert eine einzige reelle Loesung x = %.2f %n" , -c/b);
		else if ( d == 0 ) 
			System.out.printf("Es existiert eine doppelte Loesung x = %.2f %n", xx);
		else if ( d > 0 )
			System.out.printf("Es existiert zwei reelle Loesungen [x1 = %.2f, x2 = %.2f] %n" , x1, x2);
		else if ( d < 0 ) {
			d = -d; //damit wir das Quadratwurzel vom (positiven) Diskriminant rechen koennen
			double x = Math.sqrt(d)/(2*a);
			System.out.printf("Es existiert zwei reelle Loesungen [x1 = %.2f + i*%.2f, x2 = %.2f - i*%.2f]",xx , x, xx, x );
		}
	}
}
