package Abnahme03.klausur_SS2007;

public class Girokonto extends Konto {
 
	Girokonto() {
		super();
	}
	
	protected void einzahlen(int betrag) {
		this.stand += betrag;		
	}
 
	protected void abheben(int betrag) {
		this.stand -= betrag; 
	}
}
