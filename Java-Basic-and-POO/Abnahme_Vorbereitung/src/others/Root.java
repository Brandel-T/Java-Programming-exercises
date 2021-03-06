package others;
/*
 * Aufagbe 2 aus der Klausur im SS2008
 */
public class Root {

	public static void main(String[] args) {
		double a = 0;
		double b = 2d;
		double eps = 1e-4;
		System.out.println( findRoot(a, b, eps) );
	}

	public static double f(double x) {
		return Math.cos(x); 
	}
	
	public static double findRoot(double a, double b, double eps) 
	{ 
		double x = a; //Annahme, die Nullstelle ist am Anfang a
		double point = x; // temporaere variable zum Speichern der moeglichen Nullstelle beim Durchlaufen des Intervalls fuer ein beliebiges e 
		double e = (b-a)/2;
		double oldF = Math.abs( f (x) ); //funktionwert nach dem letzten Durchlauf
		double newF = 0; //Funktionwert nach dem aktuellen Durchlauf 
		
		while (e >= eps && oldF != 0)
		{
			/*
			 * point immer mit a initialisieren, so dass 
			 * fuer jeden Durchlauf mit a begonnen wird
			 */
			point = a;
			
			//jeder Durchlauf des Intervalls
			while ( point <= b)
			{  
				point = point + e; 
				newF = Math.abs( f (point) ); 
				if (newF < oldF ) { 
					oldF = newF;
					x = point;
				}
			}			
			//danach e halbieren
			e = e / 2;
		}
		
		return x;
	} 
}
