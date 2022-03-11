
public abstract class RaumMitTafel extends Raum {

	private double flaeche;

	
	public RaumMitTafel() {
		super();
	}
	
	public double getFlaeche() {
		return this.flaeche;
	}

	
	public void setFlaeche(double flaeche) {
		this.flaeche = flaeche;
	}


	public static int pruefung(Raum[] raeume) {
		int anz = 0;
		for (Raum r : raeume) {
			if ( r instanceof RaumMitTafel )
				anz++;
		}
		return anz;
	}	

}