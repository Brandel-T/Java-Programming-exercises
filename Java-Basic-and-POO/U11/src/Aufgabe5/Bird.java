package Aufgabe5;

public class Bird extends Animal implements Flying {
	
	Bird() {
		super();
	}
	
	Bird (String name, double w) {
		super(name, w);
	}

	@Override
	public void takeOff() {
		System.out.println("The Bird " + this.getName() + " takes off.");

	}

	@Override
	public void land() {
		System.out.println("The Bird " + this.getName() + " lands.");
	}

}
