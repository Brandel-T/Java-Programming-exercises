package Aufgabe5;

public class Barracuda extends Animal implements Swimming {

	Barracuda() {
		super();
	}
	
	Barracuda (String name, double weight) {
		super(name, weight);
	}
		
	@Override
	public void swim() {
		System.out.println("The Barracuda " + this.getName() + " swims.");
	}

}
