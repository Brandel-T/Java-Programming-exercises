package Aufgabe5;

public class Cow extends Animal implements Walking {
	
	private int milk; 
	
	Cow() {
		super();
	}

	Cow(String name, double weight, int milkQuantity) {
		super(name, weight);
		this.setMilk(milkQuantity);
	}
	
	@Override
	public void walk() {
		System.out.println("The cow " + this.getName() + " walks.");
	}

	@Override
	public void stopWalking() {
		System.out.println("The cow " + this.getName() + " does not walk anymore.");
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

}
