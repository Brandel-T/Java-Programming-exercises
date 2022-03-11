
public class Kontollstruktur {
	
	/*#################################################################
	 *############################## ##################################
	 *###															###
	 *###TRES IMPORTANT POUR NOUS AIDER � COMPRENDRE ET � R�SOUDRE  ###
	 *#  LES EXERCICES O� IL FAUT RECODER LES DIFF�RENTES M�THODES:   #
	 *###cos(x), sin(x), arsin(x)... artan(x), cosh(x) etc.			###
	 *### 															###	
	 *############################## ##################################
	 *#################################################################
	 */	

	public static void main(String[] args) { 
		
		double a = 1.0/3;
		double b = 10 + a - 10;
		System.out.printf("a = %.16f %n", a);
		System.out.printf("b = %.16f %n", b);
		
		/*
		 * der Vergleich von floating-point werte mit 
		 * den boolschen Operatoren "==" oder "!=" ist heikel (d�licat)
		 */
		if (a==b) 
			System.out.println("gleich");
		else
			System.out.println("verschieden");
		
		System.out.println("###########");
		//####################################
		/**
		 * il serait pr�f�rable de les examiner dans  
		 * un domaine pr�cis en utilisant les op�rateurs 
		 * de comparaison(relationale Operatore) telles-que:
		 * "<",">","<=",">=",...
		 * exemple:
		 */
		final double epsilon = 1e-10;
		
		if (Math.abs(a-b) < epsilon)
			System.out.println("gleich");
		else
			System.out.println("verschieden");
		
		System.out.printf("a = %30.16f %n" , a);
		System.out.printf("b = %30.16f %n" , b);
		System.out.printf("epsilon = %24.16f %n", epsilon);
		System.out.printf("Math.abs(a-b) = %.10f" , Math.abs(b-a));
		
	}

}
