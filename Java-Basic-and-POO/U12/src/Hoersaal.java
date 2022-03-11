
public class Hoersaal extends RaumMitTafel {

	private int reiheAnz;
	
	public Hoersaal( ) {
		this(-1); 
	}

	public Hoersaal(int reihenAnzahl) {
		super();
		setReiheAnz(reihenAnzahl);
	}

	public int getReiheAnz() {
		return this.reiheAnz;
	}

	public void setReiheAnz(int reiheAnz) {
		this.reiheAnz = reiheAnz;
	}

}