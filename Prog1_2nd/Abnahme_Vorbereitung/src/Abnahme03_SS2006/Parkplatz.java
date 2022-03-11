package Abnahme03_SS2006;

import java.util.Arrays;
import java.util.Scanner;

public class Parkplatz {

	double length ;
	double width ;
	int numberOfPlaces ;
	Fahrzeug[][] places ;
	
	Parkplatz(double laenge, double breite) {
		if ( laenge%16 != 0 || breite%2.5 != 0 || breite <= 10)
		{
			Scanner sc = new Scanner(System.in);
			while ( laenge % 16 != 0 ) {
				System.out.println("Die Laenge muss durch 16 teilbar sein, erneut eingeben: ");
				laenge = sc.nextDouble();
			}

			while ( breite % 16 != 0 && breite <= 10d ) {
				System.out.println("Die Breite muss durch 2.5 teilbar und groesser 10 sein, erneut eingeben: ");
				breite = sc.nextDouble();
			}
			sc.close();
		}
		
		this.length = laenge;
		this.width = breite;	
		
		int zeile = (int)(this.length - (this.length / 16) * 6d) / 5; //nombre de places de parking sur l'horizontale (laenge % 16: me donne le nbre de couloires entre les places de parking)
		int spalte = (int)((this.width - 2*5d) / 2.5); //nombre de places de parking sur la verticale 
		this.numberOfPlaces = zeile * spalte;
		this.places = new Fahrzeug[zeile][spalte]; 
	}
	
	public void einparken(Fahrzeug f) {
		boolean go = true;
		int i = 0, j = 0;
		for ( i = 0; go && i < places.length; i++ )
			for ( j = 0; go && j < places[0].length; j++ ) 
				if ( places[i][j] == null )
					go = false; 
		places[i-1][j-1] = f;
	}
	
	public int freiePlaetze() {
		int free = 0; 
		int i = 0, j = 0;
		for ( i = 0; i < places.length; i++ )
			for ( j = 0; j < places[i].length; j++ ) 
				if ( places[i][j] == null ) 
					free++; 
		return free;
	}
	
	public static void main(String[] args) {
		Parkplatz pp = new Parkplatz(48, 12.5); 
		Fahrzeug f1 = new Fahrzeug("BMW");
		Fahrzeug f2 = new Fahrzeug("VW");
		Fahrzeug f3 = new Fahrzeug("MRZ");

		System.out.println("free places before \"einparken\": "+ pp.freiePlaetze() );
		pp.einparken(f1);
		pp.einparken(f2);
		pp.einparken(f3);
		System.out.println(  Arrays.deepToString(pp.places));
		System.out.println("free places after \"einparken\": "+ pp.freiePlaetze() ); 
	}
	
}
