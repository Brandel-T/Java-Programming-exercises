public class Vole{
 
int state;
final int SLEEP = 1;
final int HUNGRY = 2;
final int FED_UP = 3;
final int STARVED = 4;
 
	Vole(){
		state = 1;
	}
	
	void isSleeping(){
		state = SLEEP;
	}
 
	void isFedUp(){
		state = FED_UP;
	}
 
	void isHungry(){
		state = HUNGRY;
	}
	void hasStarved(){
		state = STARVED;
	}

	int printStatus(){
		switch (state) {
			case 1: 
			  System.out.println("Vole sleeps");
			  break;
			case 2:
			  System.out.println("Vole is hungry");
			  break;
			case 3:
			  System.out.println("Vole is fed up");
			  break;
			case 4:
			  System.out.println("Vole is starved");
			  break;
		}
		return state;
	}
}