package Abnahme03;

public abstract class Fahrzeug {
	
	abstract int telefon();
	
	abstract boolean blaulicht();
	
	boolean bremstFuer(Fahrzeug other) {
		if ( other.blaulicht() )
			return true;
		return false;
	}

}
