
public class Police extends OfficeCar {

	public static final int tel = 110;
	
	Police () {
		super();
	}
	
	 
	int plone() { 
		return tel;
	}
	
	boolean brakesFor(Car other) {

		boolean fw = other instanceof FireTruck;
		boolean pol = other instanceof Police;
		
		if ( this.blueLight() ) {
			if ( fw && ((FireTruck)other).blueLight() )
				return true;
			return false;
		}
		else {
			if ( fw && ((FireTruck)other).blueLight() )
				return true;
			if ( pol && ((Police)other).blueLight() )
				return true;
			return false;
		}
	}

}
