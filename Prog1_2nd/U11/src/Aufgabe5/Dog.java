package Aufgabe5;

public class Dog extends Animal implements Walking {
	
	Dog() {
		super();
	}
	
	Dog(String name, double weight) {
		super(name, weight);
	}
	
	@Override
	public void walk() {
		System.out.println("The Dog " + this.getName() + " walks.");
	}

	@Override
	public void stopWalking() {
		System.out.println("The Dog " + this.getName() + " does not walk anymore.");
	}

}
