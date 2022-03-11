import java.util.Scanner;
public class IBANcalc{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Wollen Sie Eine IBAN berechnen lassen, dann geben Sie die 1 ein");
		System.out.println("Wollen Sie Eine IBAN Auf Korrektheit testen, dann geben Sie die 2 ein");
		int check = s.nextInt();
		
		// IBAN berechnen
		if(check == 1){
			System.out.println("Geben Sie eine deutsche Bankleitzahl ein.");
			String blz = s.next();
			System.out.println("Geben Sie eine deutsche Kontonummer ein.");
			String knr = s.next();
			
			//Testen ob BLZ korrekt
			while(blz.length() != 8){
				System.out.println("Die Eingegebene BLZ ist Falsch. Geben Sie eine korrekte BLZ ein.");
				blz = s.next();
			}
			
			//Testen ob Kontonummer kleiner 10, wenn ja mit 0 vorne auffuellen
			if(knr.length() < 10 ){
				int anz = 10 - knr.length();
				for(int i =  0; i < anz; i++){
					knr = "0" + knr;
				}
			}
			String x = blz + knr + "131400";
			int pz = mod(x, 97);
			pz = 98 - pz;
			String iban = "DE" + pz + blz + knr;

			System.out.println("Die IBAN aus Ihrer BLZ und Kontonummer lautet: "+iban);
		}
		//IBAN Testen
		else if(check == 2){
			
			System.out.println("Geben Sie eine Deutsche IBAN ein, ohne Leerzeichen.");
			String iban2 = s.next();
			
			while(iban2.length() != 22){
				System.out.println("Die Eingegebene IBAN ist Falsch. Geben Sie eine korrekte IBAN ein.");
				iban2 = s.next();
			}
			
			String BBAN = iban2.substring(4, 22);
			String rest = "1314" + iban2.substring(2, 4);
			String test = BBAN + rest;
			
			int x = mod(test, 97);
			
			if(x == 1){
				System.out.println("Ihre IBAN ist Korrekt");
			}
			else{
				System.out.println("Ihre IBAN ist nicht Korrekt");
			}

		}
		else
			System.out.println("Falsche Zahl eingegeben");
	}
	
	//Methode: Berechnet Modulo von Grossen Zahlen
	static int mod(String num, int a) {   
        int res = 0; 
  
        for (int i = 0; i < num.length(); i++) 
			res = (res * 10 + (int)num.charAt(i) - '0') % a; 
        return res; 
    } 
}