package Aufgabe5;

public class Animal {

	private String name;
	private double weight;
	
	Animal() {
		setName(null);
		setWeight(0);
	}
	
	Animal(String name, double w) {
		setName(name);
		setWeight(w);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double w) {
		this.weight = w;
	}
	
	public String toString() {
		return "["+ getName() + ", " + getWeight() +"]";
	}
	
}
