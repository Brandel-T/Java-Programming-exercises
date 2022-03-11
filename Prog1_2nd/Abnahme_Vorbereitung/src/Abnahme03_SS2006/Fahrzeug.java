package Abnahme03_SS2006;

public class Fahrzeug {
	String id;
	Fahrzeug(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "\" "+ id + " \"" ;
	}
}
