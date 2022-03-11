package Blatt3;

public class Equation {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		/**
		 * NE PAS OUBLIER QUE LA COMPARAISON AVEC LES "double"
		 * EST TOUJOURS DOUTEUSE ET NE GARANTIE PAS L'EXACTITUDE,
		 * ---> IL EST PRÉFÉRABLE DE COMPARER AVEC "int".
		 * mais pour cet exo , on va travailler avec "double".
		 */
		double d = b*b - 4*a*c; //Diskriminant
		
		if (a == 0 && b == 0 && c == 0) 
			System.out.println("jedes x ist Loesung der Gleichung");
		else if (a == 0 && b == 0 && c != 0) 
				System.out.println("kein x erfuellt die Gleichung");
		else if (a == 0 && b != 0 && c!= 0) {
			double x = -c/b; 
			System.out.println("es existiert eine einzige reelle Loesung: x = " + x);
		} 
		else if (d == 0) {
			double x = -b/(2*a);
			System.out.println("es existiert eine doppelte reelle Loesung: x = " + x);
		} 
		else if (d > 0) {
			double x1 = (-b-Math.sqrt(d))/(2*a);
			double x2 = (-b+Math.sqrt(d))/(2*a);
			System.out.println("es existieren zwei reelle Loesungen: x1 = "+ x1 + " , x2 = " + x2);
		}
		else if (d < 0) {
			System.out.printf("die Gleichung hat zwei komplexe Loesungen: x1 = %.2f - i*%.2f , x2 = %.2f + i*%.2f", 
					-b ,Math.sqrt(-d)/(2*a),  
					-b ,Math.sqrt(-d)/(2*a) );			
		}
			
		
	}

}
