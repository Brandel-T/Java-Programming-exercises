
public class Raum {

	private int nummer;
	private int platzAnz;
	
	public Raum() {
		this(0); 
	}

	public Raum(int nummer) {
		this(nummer, 0);
	}

	public Raum(int nummer, int platzAnzhal) {
		setNummer(nummer);
		setPlatzAnz(platzAnzhal);
	}

	public int getNummer() {
		return this.nummer;
	}
 
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public int getPlatzAnz() {
		return this.platzAnz;
	}
 
	public void setPlatzAnz(int platzAnz) {
		this.platzAnz = platzAnz;
	}
 
}