package Abnahme03;

import Abnahme03.AmtsFahrzeug.BlueLight;

public class FahrzeugMain {
	
	public static void main(String[] args) {
		BlueLight OFF = BlueLight.OFF;
		BlueLight ON = BlueLight.ON; 
		
		Notartz n = new Notartz();
		Polizei p = new Polizei();
		PizzaService pz = new PizzaService();
		 
		p.setState(ON); 
		System.out.println("Notartz bremst fuer Polizei mit aktiven Blaulicht" + 
				( n.bremstFuer(p) ? ": JA" : ": NEIN" ));
		
		System.out.println("\n------------------------------------------------");
		n.setState(ON);
		System.out.println( "Notartz mit aktivem Blaulicht bremst fuer Polizei mit aktivem Blaulicht ?" + 
				( n.bremstFuer(p) ? ": JA" : ": NEIN" ));
		
		System.out.println("\n------------------------------------------------");
		System.out.println("Pizza-Service bremst f\u00FCr Krankenwagen mit aktiven Blaulicht ?" + 
				( pz.bremstFuer(n) ? ": JA" : ": NEIN" ));
		
		System.out.println("\n------------------------------------------------");
		//Police x Pizza___________
		//Police with blue light
		System.out.println("(with blue light)Polizei bremst f\u00FCr Pizza-Service ?" + 
		( p.bremstFuer(pz) ? ": JA" : ": NEIN" ));
		//Police without blue light
		p.setState(OFF); 
		System.out.println("(without blue light)Polizei bremst f\u00FCr Pizza-Service ?" + 
		( p.bremstFuer(pz) ? ": JA" : ": NEIN" ));
		
		System.out.println("\n------------------------------------------------");
		p.setState(OFF);
		n.setState(OFF);
		System.out.println("Polizei bremst f\u00FCr Notartz(beide ohne Blaulicht) ?" + (p.bremstFuer(n) ? ": JA" : ": NEIN" ));
		System.out.println("Polizei bremst f\u00FCr Notartz(beide ohne Blaulicht) ?" + (n.bremstFuer(p) ? ": JA" : ": NEIN" ));
		
		
	}

}
