package Blatt9;

public class Vole {
	int state ;
	final int SLEEP = 1;
	final int HUNGRY = 2; //hunger
	final int FED_UP = 3; //hat sich satt
	final int STARVED = 4;
	
	Vole() {
		this.state = SLEEP;
	}
	 
	public void isSleeping() {
		setState(SLEEP);
	}
	
	public void isHungry() {
		setState(HUNGRY);
	}
	
	public void isFedUp() {
		setState(FED_UP);
	}
	
	public void hasStarved() {
		setState(STARVED);
	}

	public void printstatus() {
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
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
