package Abnahme03_SS2005;

public class Halbreis extends Querschnitt {

	double r;
	
	Halbreis(double radius) {
		r = radius;
	}
	
	@Override
	double flaeche() { 
		return Math.PI*r*r/2;
	}

}
