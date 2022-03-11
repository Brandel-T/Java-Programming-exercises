package Blatt10;

import java.util.StringTokenizer;

public class Blanks {
	
	public static String searchBlanks(String text) {
		int maxBlankLength = -1;
		int countCoparisions = 0;
		
		StringTokenizer tokenizer = new StringTokenizer(text);  //Zerlegen des string-parameters in Tokens
		String current = tokenizer.nextToken();					//initialisieren mit erstem token
		StringBuilder builder = new StringBuilder(text);		//zur Verarbeitung vom string-parameter
		
		//Fall1: es gibt ein "blank" am anfang des Textes
		if ( Character.isWhitespace( text.charAt(0)) ) {
			maxBlankLength = (maxBlankLength < text.indexOf(current)) ? 
							 					text.indexOf(current) :
							 									   -1 ;		//laenge des leerzeichen initialisieren
			countCoparisions++;												//zaehlt als 1. Vergleich
			text = builder.delete(0, text.indexOf(current)).toString();
		}
		
		//Fall2: text hat kein "blank" am Anfang
		int length;		//Zwischenspeichern der Laenge des aktuellen blanks
		while ( tokenizer.hasMoreTokens() ) 
		{			 			
			text = builder.delete(0, current.length()).toString(); //re-initial° des parameter(das *WORT*(TOKEN) am Anfang loeschen) 
			current = tokenizer.nextToken();					   //resultierende Leerzeichen-Sequenz am Anfang ueberspringen
			length = text.indexOf(current);						   //Abstand vom Anfang des *text(string-parameter nach Re-Initialisation)* bis zum naechsten Wort ermitteln
			text = builder.delete(0, text.indexOf(current)).toString(); //*LEERZEICHEN-SEQUENZ* am Anfang loeschen 
			
			if (length > maxBlankLength) 	//Vergleich und Max Laenge aktualisieren
				maxBlankLength = length;  

			countCoparisions++;
		}
		
		//Fall3: am Ende des Textes gibt es auch ein "blank"
		length = text.length() - current.length();
		if (length > maxBlankLength) {
			maxBlankLength = length;   
		}
		countCoparisions++ ;
		
		return "[Laengste Laenge = " + maxBlankLength + ", Vergleiche = " + countCoparisions + "]";
	}

	public static void main(String[] args) {
//		String text = "   Ich           habe eine      prog1  Hausaufgabe             ";
//		String text = "Ich                habe eine      prog1  Hausaufgabe";
		String text = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from   repetition, injected humour, or non-characteristic words etc.";
		System.out.println( searchBlanks(text) ); 
	}

	
	
	
	
	
	
//################################################################################
//########						METHODE_DE_JOHANNES						  ########
//################################################################################
	
//	public static void main(String[] args) {
//
////		String text = "Tesla CEO      Elon Musk      said    on Twitter    on Tuesday that he     attempted to sell" 
////				+ "the         company during the           darkest days   of the Model  3 program,but that \r\n\""
////				+ "Apple                     CEO Tim Cook     refused to  take the meeting";
//		
//		String text = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from   repetition, injected humour, or non-characteristic words etc.";
//		
//		searchBlanks(text);
//	
//	
//	}
//	
////Methode____________________________________________________
//	public static void searchBlanks(String n) {;
//		String k=n;
//			int counter=1;
//			int counter2=0;					//gemachte Versuche
//			int res=0;						//Max. Anzahl von Leerzeichen
//			int buffer1=0;				
//			int buffer2=0;
//		
//		while(n.indexOf(' ')>-1) {
//			buffer2=n.indexOf(' ');			//esrstes Leerzeichen wird gespeichert
//			k=n.substring(buffer2+1);		//String = String ab dem Leerzeichen
//			buffer1=k.indexOf(' ');			//Speichert die naechste Stelle mit dem Leerzeichen
//
//			if(buffer1==0) {				//wenn wert = 0, d.h. die naechste Stelle auch leerzeichn ist
//				counter++;					//Speuíchert Kette von Leerzeichen
//			counter2++;						//gemachte Versuche
//			}
//			
//				if (counter>res) 			//Groesste Kette von Leerzeichen
//					res=counter;
//			
//					if(buffer1!=0) {		//Wenn nicht =, dann kein Leerzeichen
//						counter=1;
//						counter2++;			//versuche
//					}
//		n=n.substring(buffer2+1);
//		}
//		System.out.printf("maximale Anzahl die Leerzeichen: %2d%ngemachte Vergleiche: %13d", res, counter2);
//	}

}
