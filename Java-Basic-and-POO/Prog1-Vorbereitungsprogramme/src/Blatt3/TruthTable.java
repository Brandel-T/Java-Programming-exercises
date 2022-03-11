package Blatt3;

public class TruthTable {

	public static void main(String[] args) {
		boolean a = true, b = true, c = true;
		boolean and = false , or = false , xor = false;

		System.out.println("a     b     c     OR    AND   XOR");
		System.out.println("====================================");
		do {
			do {
				do {
					and = (a&&b&&c) ? true : false;
					or = (a||b||c) ? true : false;
					xor = ( (a||b)^c) ? true : false;
					
//					if (a && b && c)
//						and = true;
//					else
//						and = false;
//
//					if (a || b || c)
//						or = true;
//					else 
//						or = false;
//					
//					if ( (a||b)^c)
//						xor = true;
//					else 
//						xor = false;
					
					System.out.printf("%-5b %-5b %-5b %-5b %-5b %-5b%n", a, b, c, or, and, xor );
					c = !c; 
					/**
					 * cette inversion de la valeur de "c" � false fera en sorte que 
					 * dans la condition se trouvant � l'int�rieure de la boucle while 
					 * ci-dessous nous obiendrons, � travers (!c) <=> (!(false)-> true), 
					 * le resultat "true" qui nous permettra ainsi de rentrer dans cette
					 * troisi�me boucle pour une 2nd fois: cons�quence la valeur de c sera 
					 * modifi�e 2 fois, celles de b et a resterons � true, ce qui est tout
					 * l'objectif, avant qu'on puisse entrer maintenant dans la deuxi�me
					 * boucle do-while, qui conduira � la modification de la valeur de b et
					 * etc. avec a. 
					 * 
					 */
					
				} while (!c);
				
				b = !b;
			} while (!b);
			
			a = !a;
		} while (!a);
	}
}