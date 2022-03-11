
public class FireTruck  extends OfficeCar{

	public static final int tel = 112;
	
	FireTruck() {
		super();
	}
	
	 
	int plone() { 
		return tel;
	}
	
	
	boolean brakesFor(Car other) {
		
		if ( this.blueLight() )
			return false;
		else {
//			boolean pol = other instanceof Police;
//			boolean ftr = other instanceof FireTruck;
//			if ( pol && ((Police)other).blueLight() )
//				return true;
//			if ( ftr && ((FireTruck)other).blueLight() )
//				return true;
//			return false;
			if (this.blueLight())
				return false;
			else if (other.blueLight())
				return true;
			return false;
		}
	}

}
