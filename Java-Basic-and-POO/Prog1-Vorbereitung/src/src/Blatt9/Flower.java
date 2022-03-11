package Blatt9;

public class Flower {

	private int state ;
	final int GROW = 1;
	final int FLOURISH = 2;
	final int EATEN = 3;
	private int size ; //von 0 bis 15
	
	public Flower() {
		size = 0;
	}
	public int getSize() {
		return size;
	}
	
	public void isGrowing() {
		this.setState(this.GROW);
		this.size++;
	}
	
	public void isFlourishing() {
		if (this.size >= 15) {			
			this.setState(this.FLOURISH); 
		}
	}
	
	public void wasEaten() {
		this.setState(this.EATEN); 
	}
	
	public void printStatus() {
		switch(this.getState()) {
			case GROW:
				System.out.print("grows");
				break;
			case FLOURISH:
				System.out.print("flourisches");
				break;
			case EATEN:
				System.out.print("was eaten\n");
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
