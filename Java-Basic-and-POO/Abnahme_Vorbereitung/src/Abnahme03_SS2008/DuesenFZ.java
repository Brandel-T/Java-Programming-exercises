package Abnahme03_SS2008;

public class DuesenFZ extends SchwererAlsLuft {

	boolean mitMaxGeschwindigkeit;
	
	DuesenFZ(int m, int l) {
		this(m, l, false); 
	}
	
	DuesenFZ(int m, int l, boolean mitMaxGeschwindigkeit) {
		super(m, l);
		this.mitMaxGeschwindigkeit = mitMaxGeschwindigkeit;
	}

	@Override
	public void lenken(double grad) {
		// TODO Auto-generated method stub
		
	}
}
