package Abnahme03.klausur_SS2007;

public abstract class Konto {
	
	protected int stand;

	Konto( ) {
		this(0);
	}
	
	Konto(int stand) {
		this.stand = stand;
	}
	
	protected abstract void einzahlen(int betrag) ;
	protected abstract void abheben(int betrag) ;
	protected int getStand() {
		return this.stand;
	}
}
