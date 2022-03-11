
public abstract class OfficeCar extends Car {

	static final int ON = 1;
	static final int OFF = 0;
	private int state; 

	OfficeCar( ) {
		setState(OFF);
	}
	
	OfficeCar(int s) {
		setState(s);
	}
	
	
	abstract int plone();


	boolean blueLight() {
		if ( state == ON )
			return true;
		return false;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
