package Abnahme03_SS2008;

public abstract class SchwererAlsLuft implements LenkbarFZ, Luftfahrzeug {

	protected static final String kategorie = "Leichter als Luft";
	protected int mitglieder ; 
	protected int leistung;
	
	
	SchwererAlsLuft(int m, int l) {
		mitglieder = m;
		leistung = l;
	}
}
