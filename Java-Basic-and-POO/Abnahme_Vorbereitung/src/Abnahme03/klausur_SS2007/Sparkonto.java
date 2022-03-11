package Abnahme03.klausur_SS2007;

public class Sparkonto extends Konto {
	
	static final int limit = 2000;

	Sparkonto() {
		this(0);
	}
	
	Sparkonto(int stand) {
		super(stand); 
	}

	@Override
	protected void einzahlen(int betrag) {
		this.stand += betrag;		
	}

	@Override
	protected void abheben(int betrag) {
		if ( betrag >= limit )
			System.out.println("Sie muessen vierteljaehriger Frist kuendigen.");
		else {
			if ( betrag > this.getStand() )
				System.out.println("Nicht genug Geld im sparkonto");
			else
				this.stand -= betrag; 
		} 
	}

}
