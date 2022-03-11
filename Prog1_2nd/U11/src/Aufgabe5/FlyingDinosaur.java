package Aufgabe5;
public class FlyingDinosaur extends Animal implements Flying, Walking {

	FlyingDinosaur () {
		super();
	}	
	
	FlyingDinosaur (String name , double weight) {
		super(name, weight);
	}

	@Override
	public void walk() {
		System.out.println("The Dinosaur " + this.getName() + " walks.");
	}

	@Override
	public void stopWalking() {
		System.out.println("The Dinosaur " + this.getName() + " does not walk anymore.");
	}

	@Override
	public void takeOff() {
		System.out.println("The Dinosaur " + this.getName() + " takes off.");

	}

	@Override
	public void land() {
		System.out.println("The Dinosaur " + this.getName() + " lands.");
	}

}
