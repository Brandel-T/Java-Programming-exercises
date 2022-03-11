
public class Vole {

	int state;
	final int SLEEP = 1;
	final int HUNGRY = 2;
	final int FED_UP = 3;
	final int STARVED = 4;
	
	Vole() {
		this.state = SLEEP;
	}
	
	int getState() {
		return state;
	}
	
	void isSleeping() {
		state = SLEEP;
	}
	
	void isHungry() {
		state = HUNGRY;
	}
	
	void isFedUp() {
		state = FED_UP;
	}
	
	void hasStarved() {
		state = STARVED;
	}
	
	void printStatus() {
		switch( this.getState() ) {
			case SLEEP: 
				System.out.println("sleeps"); 
				break;
			case HUNGRY: 
				System.out.println("is hungry"); 
				break;
			case FED_UP: 
				System.out.println("is fed up"); 
				break;
			case STARVED: 
				System.out.println("has starved"); 
				break;
		}
	}
}
