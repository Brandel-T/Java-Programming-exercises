package Abnahme03_SS2005;

public class Rechteck extends Querschnitt {
	double t;
	double b;
	Rechteck(double tiefe, double breite) {
		t = tiefe;
		b = breite;
	}

	@Override
	double flaeche() { 
		return t*b;
	}

	
}
