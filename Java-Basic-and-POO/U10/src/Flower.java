
public class Flower {

	private int state; 
	private static final int GROW = 1;
	private static final int FLOURISH = 2;
	private static final int EATEN = 3;
	private int size; // from 0 to 15
	
	Flower() {
		state = GROW;
	}
	
	int getState() {
		return state;
	}
	
	int getGrow() {
		return GROW;
	}
	
	int getFlourish() {
		return FLOURISH;
	}
	
	int getEaten() {
		return EATEN;
	}
	
	int getSize() {
		return size;
	}
	
	void setState(int s) {
		if ( s != 1 && s != 2 && s != 3 )
			System.out.println("STATE ERROR(Flower): state must be between 1 and 3");
		else
			state = s;
	} 
	
	void setSize(int s) {
		size = s;
	}

	void isGrowing() {
		if ( size < 15 ) 
		{
			size++;
			state = GROW; 
		}
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













