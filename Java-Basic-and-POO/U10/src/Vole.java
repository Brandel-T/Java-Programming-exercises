
public class Vole {

//	private static final int SLEEP = 1;
//	private static final int HUNGRY = 2;
//	private static final int FED_UP = 3;
//	private static final int STARVED = 4;
	
	enum State {SLEEP, HUNGRY, FED_UP, STARVED};
	private State state;
	private int probability;

	Vole() {
		this(State.SLEEP);
	}
	
	Vole(State state) {
		this(state, 0);
	}
		
	Vole(State state, int prob) {
		this.state = state;
		probability = prob;
	}
	
	State getState() {
		return state;
	}
	
	State getSleep() {
		return State.SLEEP;
	}
	
	State getHungry() {
		return State.HUNGRY;
	}
	
	State getFedUp() {
		return State.FED_UP;
	}
	
	State getStarved() {
		return State.STARVED;
	}
	
	void isSleeping() {
		state = State.SLEEP;
	}
	
	void isHungry() {
		state = State.HUNGRY;
	}
	
	void isFedUp() {
		state = State.FED_UP;
	}
	
	void hasStarved() {
		state = State.STARVED;
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
	
	int random() {
		return (int)(Math.random() * 10); // 10% == 10/100 == 1/10
	}
	
	int getProbability() { 
		return probability;		
	}

	void setProbability(int probability) {
		this.probability = probability;
	}
}












