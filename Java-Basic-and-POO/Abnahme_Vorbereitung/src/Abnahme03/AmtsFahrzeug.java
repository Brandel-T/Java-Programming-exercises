package Abnahme03;

public abstract class AmtsFahrzeug extends Fahrzeug{

	private BlueLight state;
	enum BlueLight { ON, OFF }; 

	AmtsFahrzeug( ) {
		state = BlueLight.OFF;
	}
	
	AmtsFahrzeug(BlueLight s) {
		state = s;
	}
	
	abstract int telefon() ;

	boolean blaulicht() {
		if ( state == BlueLight.ON )
			return true;
		return false;
	}

	public BlueLight getState() {
		return state;
	}

	public void setState(BlueLight state) {
		this.state = state;
	}

	
	
}
