

public abstract class Car {

	abstract int plone();
	
	abstract boolean blueLight();
	
	boolean brakesFor(Car other) {
		if ( other.blueLight() )
			return true;
		return false;
	}

}
