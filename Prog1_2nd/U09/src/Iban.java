import java.util.Scanner;

public class Iban 
{	
    public static void main(String[] args) { 
    	
    	String blz = args[0];
    	String knr = args[1];
    	String iban = args[2];
    	
    	Scanner sc = new Scanner(System.in); 
		while ( blz.length() != 8 ) {
			System.out.println("Bankleitzahl muss 8-stellig sein, erneut eingeben: ");
			blz = sc.next();
		}  
		 
		while ( knr.length() > 10 ) {
			System.out.println("Kontonummer muss 10-stellig sein, erneut eingeben: ");
			knr = sc.next();
		}  
		if ( knr.length() < 10 ) {
			for ( int i = knr.length(); i < 10; i++ )
				knr += "0";
		}
		
		while ( iban.length() > 34 ) {
			System.out.println("IBAN muss maximal 34-stellig sein, erneut eingeben: ");
			iban = sc.next();
		}
		
		System.out.println("Bankleitzahl: " + blz);
		System.out.println("Kontonummer: " + knr);
		System.out.println("------------------------------");
		System.out.println("Ausgabe IBAN: " + toIban(blz, knr) );
		
		System.out.println("\n\nEingebene IBAN: " + iban);
		System.out.println("------------------------------");
		System.out.println( checkIban(iban) ? "Korrekte IBAN" : "Falsche IBAN" );
    }

    static String toIban(String blz, String knr) {   
        return "DE" + getPruefZiffer(blz, knr) + blz + knr;
    }

    static String getPruefZiffer(String blz, String knr) {
        String n = blz + knr + "131400"; 
        int pz = 98 - modulo(n, 97); 
         
        return ( pz < 10 ) ? "0"+pz : ""+pz;
    }

    static boolean checkIban(String iban) { 
        if ( !Character.isLetter(iban.charAt(0)) || !Character.isLetter(iban.charAt(1)) )
            return false;
        else 
        {
            String ll = iban.substring(0, 2);
            String pz = iban.substring(2, 4);
            String bban = iban.substring(4);
            String validation = bban + ll + pz;

            String valid = "";
            char ch ;
            int i = 0;
            for ( i = 0; i < validation.length(); i++ ) 
            {
                ch = validation.charAt(i);
                if ( Character.isLetter( ch ) )
                { 
                    String chString = ""+ch;
                    int latinPosition = chString.compareTo("A") + 10; //nicht +9, sondern +10, weil Rechner mit 0 anfaengt zu zaehlen 
                    valid += latinPosition;
                }
                else valid += ch; 
            } 

            int rest = Iban.modulo( valid , 97 );  
            return ( rest == 1 ) ? true : false;
        } 
    }

	static int modulo(String str, int quotient) {
		int i = 0, rest = 0;
		for ( i=0; i<str.length(); i++ ) 
			rest =  (rest*10 + Integer.parseInt( ("" + str.charAt(i)) )) % 97 ; //Horner schema with modulo  
		return rest;
	}
}
