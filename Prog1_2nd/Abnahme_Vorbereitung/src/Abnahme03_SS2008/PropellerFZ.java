package Abnahme03_SS2008;

public class PropellerFZ extends SchwererAlsLuft {
	
	int propellers; 
 
	PropellerFZ(int m, int l) {
		this(m, l, 0); 
	}

	PropellerFZ(int m, int l, int p) {
		super(m, l); 
		propellers = p;
	}

	@Override
	public void lenken(double grad) {
		// TODO Auto-generated method stub
		
	}
}
