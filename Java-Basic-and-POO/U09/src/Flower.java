
public class Flower {

	/*
	 * state :
	 * 1) grow
	 * 2) flourish
	 * 3) eaten
	 */
	int state = 1; 
	final int GROW = 1;
	final int FLOURISH = 2;
	final int EATEN = 3;
	int size; // from 0 to 15
	
	int getState() {
		return state;
	}
	
	int getSize() {
		return size;
	}

	void isGrowing() {
		size++;
		if ( size < 15 ) 
			state = GROW; 
		else
			this.isFlourishing();
	}
	
	void isFlourishing() {
		if ( size >= 15 )
			state = FLOURISH;
	}
	
	void wasEaten() {
		state = EATEN;
	}
	
	void printStatus() {
		switch ( this.getState() ) {
			case GROW: 
				System.out.print ("grows"); 
				break;
			case FLOURISH: 
				System.out.print ("flourishes"); 
				break;
			case EATEN: 
				System.out.print ("was eaten"); 
				break;
		}
	}
	
}













