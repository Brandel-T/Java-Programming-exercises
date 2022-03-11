
public class LogarithmusLNplus1 {
	
	/*
	 * Klausur Sommersemester 2006
	 */

	public static void main(String[] args) {
		double x = 0.8;
		double eps = 1E-10;
		System.out.println( ln1plusX(x, eps) );
	}
	
	public static double ln1plusX(double x, double eps)
	{
		double result = x;
		
		if (x > -1 && x <= 1)
		{
			double prev = 0.0;  //previous term
			double current = x; //current term
			double factor = x;
			double diff = current - prev;
			int denom = 2; 
			int sign = -1;
			
			while ( diff > eps || diff < -eps)
			{
				prev = current;
//				current = (current * x) / denom; /* !!! tres important: je ne dois pas reecrire dans dans current / ca causer des dégâts!!!*/
				factor = factor * x;
				/*
				 * current est juste une variable temporaire qui sert à stocker le terme actuel
				 * il est nécessaire de stocker les calculs dans une autre variable exple. factor
				 * car pour chaque term du calcul, les operandes varient et si on exécute le calcul
				 * directement dans current, cela aura des répercutions sur le résultat final 
				 */
				current = sign*(factor / denom);
				diff = current - prev;
				diff = diff < 0 ? -diff : diff;
				
				result = result + current;
				
				sign = -sign;
				denom++;
			}
		}
		else {
			return -1;
		}
		
		return result;
	}
	//0.4054651081290877
	//0.6931521804849825

}
