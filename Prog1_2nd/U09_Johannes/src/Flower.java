public class Flower{
 
int state = 0; 
static final int GROW = 1;
static final int FLOURISH = 2;
static final int EATEN = 3;
int size = 0;
	
	Flower(){
		state = GROW;
	}
	void wasEaten(){
		state = EATEN;
	}
	void isFlourishing(){
		state = FLOURISH;
	}
	
	void isGrowing(){
		if (size >= 15){
			if(state == EATEN){
				state = EATEN;
			}
			else{
				state = FLOURISH;
			}
		}
		else if(state == EATEN){
			state = EATEN;
		}
		else 
			size++;
	}
	
	int printStatus(){
		switch (state) {
			case 1: 
			  System.out.println("grows, size: " + size);
			  break;
			case 2:
			  System.out.println("is blooming, size: 15");
			  break;
			case 3:
			  System.out.println("was eaten");
			  break;
		}
		return state;
	}
}