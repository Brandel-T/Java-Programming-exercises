

public class CarMain {

	public static void main(String[] args) {  
		int on = OfficeCar.ON;
		int off = OfficeCar.OFF;
		FireTruck fw = new FireTruck();
		Police p = new Police();
		SushiExpress se = new SushiExpress(1234);
		 
		fw.setState(on);
		p.setState(off); 
		System.out.println("Polizei bremst fuer Feuerwehr mit aktivem Blaulicht ?" + 
				( p.brakesFor(fw) ? ": JA" : ": NEIN" ));
		
		System.out.println("\n------------------------------------------------");
		p.setState(on);
		System.out.println( "Feuerwehr mit aktivem Blaulicht bremst fuer Polizei mit aktivem Blaulicht ?" + 
				( fw.brakesFor(p) ? ": JA" : ": NEIN" ));
		
		System.out.println("\n------------------------------------------------");
		System.out.println("Sushi-Express bremst fuer Polizei mit aktiven Blaulicht ?" + 
				( se.brakesFor(p) ? ": JA" : ": NEIN" ));
		
		System.out.println("\n------------------------------------------------");
		fw.setState(off);
		System.out.println("Feuerwehr bremst fuer Sushi-Express ?" + 
		( fw.brakesFor(se) ? ": JA" : ": NEIN" ));
		
		
	

	}

}
