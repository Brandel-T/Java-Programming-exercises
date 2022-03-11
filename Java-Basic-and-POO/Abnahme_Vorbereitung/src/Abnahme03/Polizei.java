package Abnahme03;

public class Polizei extends AmtsFahrzeug{

	Polizei() {
		super(); 
	}

	public static final int tel = 110;
	
	
	int telefon() {
		return tel;
	}
	
	boolean bremstFuer(Fahrzeug other) {
		
		boolean notartz = other instanceof Notartz;
		boolean polizei = other instanceof Polizei;
		
		if ( this.blaulicht() ) {
			if ( notartz && ((Notartz)other).blaulicht() )  
				return true;
			return false;
		} 
		else {
			if ( notartz && ((Notartz)other).blaulicht() )
				return true;
			if ( polizei && ((Polizei)other).blaulicht() )
				return true;
			return false;		
		}
	}
	
	
}
