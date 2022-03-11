package Aufgabe5;

public class Swordfish extends Animal implements Swimming {
	
	Swordfish() {
		super();
	}
	
	Swordfish(String name, double weight) {
		super(name, weight);
	}
	
	@Override
	public void swim() {
		System.out.println("The Swordfish " + this.getName() + " swims.");
	}

}
