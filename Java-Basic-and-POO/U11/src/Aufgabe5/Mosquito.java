package Aufgabe5;

public class Mosquito extends Animal implements Flying {

	Mosquito() {
		super();
	}
	
	Mosquito(String name, double weight) {
		super(name, weight); 
	}

	@Override
	public void takeOff() {
		System.out.println("The Mosquito " + this.getName() + " takes off.");

	}

	@Override
	public void land() {
		System.out.println("The Mosquito " + this.getName() + " lands.");
	}

}
