package Abnahme03.klausur_SS2007;

import java.util.Scanner;

public class Festgeldkonto extends Konto {
	
	String festTermin;
	
	Festgeldkonto(String t) {
		this(0, t);
	}
	
	Festgeldkonto(int st, String t) {
		super(st);
		this.festTermin = t;
	}
	

	@Override
	protected void einzahlen(int betrag) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wann moechten Sie einzahlen ? :");
		String t = sc.next();
		if ( t.equals(this.festTermin) ) 
			this.stand += betrag;	 
		else
			System.out.println("Das Geld darf nicht vor oder nach dem " + this.festTermin + " eingezahlt werden.");
		sc.close();
	}

	@Override
	protected void abheben(int betrag) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wann moechten Sie einzahlen ? :");
		String t = sc.next();
		if ( t.equals(this.festTermin) ) 
		{ 
			if ( betrag > this.getStand() )
				System.out.println("Nicht genug Geld im sparkonto");
			else
				this.stand -= betrag;  
		} else 
			System.out.println("Das Geld darf nicht vor oder nach dem " + this.festTermin + " abgehoben werden.");
		sc.close();
	}

}
