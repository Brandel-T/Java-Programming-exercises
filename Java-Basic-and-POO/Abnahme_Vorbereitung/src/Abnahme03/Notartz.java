package Abnahme03;

public class Notartz extends AmtsFahrzeug {

	Notartz( ) {
		super(); 
	}

	public static final int tel = 112;
	
	
	int telefon() {
		return tel;
	}
	
	//Notartz mit aktivem Blaulicht bremst fuer niemanden
	boolean bremstFuer(Fahrzeug other) {		
		if ( this.blaulicht() )  
			return false; 
		else 
		{
			if ( other instanceof Polizei && ((Polizei)other).blaulicht() )
				return true;			
			if ( other instanceof Notartz && ((Notartz)other).blaulicht() )
				return true;	
			return false;
		}
	}
	
}
