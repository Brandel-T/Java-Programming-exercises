
public abstract class Buero extends Raum {

	private int etage;
	
	public Buero() {
		this(0);
	}
	
	public Buero(int etage) {
		super();
		setEtage(etage);
	} 

	public int getEtage() {
		return this.etage;
	} 
	
	
	public void setEtage(int etage) {
		this.etage = etage;
	}
}