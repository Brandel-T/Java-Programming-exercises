package GenericContainer;

public class Kontakt implements Comparable<Kontakt>
{
	private String vorname = "";
	private String nachname ="";
	private long telnr;
	
	public Kontakt (String vorname, String nachname, long telnr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.telnr = telnr;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vn) {
		vorname = vn;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public void setNachname(String nn) {
		nachname = nn;
	}
	
	public long getTelnr() {
		return telnr;
	}
	
	public void setTelnr(long tn) {
		telnr = tn;
	}
	
	@Override
	public String toString() {
		return "Kontakt [Nachname = "+ getNachname() + ", Vorname = " + getVorname() + ", tel : " + telnr + "]";
	}
	
	@Override
	public int compareTo(Kontakt o) {
		String nameOther = o.nachname; 
		return this.nachname.compareTo(nameOther);
		
	}
}
