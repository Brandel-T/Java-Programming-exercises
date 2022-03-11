package Blatt9;

import java.util.Scanner;

public class IBAN { 
	
	public static String toIban(String blz, String knr) { 
		String number = blz + knr + "131400";
		int rest = modulo(number, 97);
		int checknumber = 98 - rest; //Pruefziffer

		return "DE" + checknumber + blz + knr;  
	}
	
	//Gueltigkeit der IBAN ueberpruefen, mit der IBAN als Parameter
	static boolean checkIban(String iban) {
		String bban = iban.substring(4);
		String number = bban + "131400"; 
		int rest = modulo(number, 97); 
		String pruefnumber = String.valueOf(98 - rest); 
		String initialPruefnumber = iban.substring(2, 4); 
		
		return (initialPruefnumber.equals(pruefnumber)) ? true : false;
		//on n'utilise pas "==" pour la comparaison à ce niveau , car compare
		//juste l'identité des Referenzvariablen "pruefnumber" et "initialPruefnumber"
		//et non leur contenu (voir le chapitre String&Character - Kopieren und vergleichen)
	} 
	
	static int modulo(String s, int q) {
		int i = 0, rest = 0;
		while( i < s.length() ) {
			/**
			 * à coté des differentes manieres de convertir un "char" en "int",
			 * telles que Integer.parseInt(String.valueOf(...)), implizite-/ explizite Typkonversion
			 * Character.getNumericvalue(), nous avons aussi ce moyen qui consiste à
			 * SOUSTRAIRE '0'(48) au caractère dont on souhaite obtenir la valeur entiere
			 * exemple: s.charAt(i) - '0' [donne la valeur équivalente en entier du caractere
			 * 							   obtenu via l'appel de méthode charAt(i)]
			 */
			rest = (rest*10 + (int)(s.charAt(i) - '0')) % 97;	
			i++;
		}
		return rest;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Wollen Sie eine deutsche IBAN berechnen, druecken Sie die [1]\n" 
						 + "Wollen Sie Ihre IBAN auf Korrekheit IBAN ueberpruefen, druecken Sie die [2].");
		int input = scan.nextInt();
		
		if (input == 1) {
			System.out.println("Geben Sie eine Bankleitzahl ein...");
			String iid = scan.next(); 
			while ( iid.length() != 8 ) {
				System.out.println("Die Bankleitzahl muss 8 stellig sein, geben Sie die Bankleitzahl erneut ein...");
				iid = scan.next();
			} 
			
			System.out.println("Geben Sie eine Kontonummer ein...");
			String ban = scan.next(); 
			int banLength = ban.length();
			if ( banLength > 10 ) {
				while ( ban.length() > 10 ) {
					System.out.println("Kontonummer maximal 10-stellig, geben Sie Ihre Kontonummer erneut ein...");
					ban = scan.next();
				} 
			} else if ( banLength < 10 ) { 
				while (ban.length() != 10)
					ban += "0"; 
			}
			
			System.out.println("Die IBAN lautet: " + toIban(iid, ban) );			
		} 
		else if (input == 2) {
			
			System.out.println("Geben Sie Ihre IBAN ein...");
			String iban = scan.next();
			if ( checkIban(iban) ) 
				System.out.println("IBAN ist korrekt !");
			else 
				System.out.println("IBAN ist nicht korrekt !");
		}
		 
//		System.out.println( 98- modulo("200500000123456000131400", 97)  );
		
	}
	
	
}
