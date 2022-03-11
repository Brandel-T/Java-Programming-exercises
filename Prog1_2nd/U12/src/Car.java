
public class Car {

	final int length;
	final int max_passengers;
	private Car next;


	public Car(int length, int max_passengers) {
		this(length, max_passengers, null);
	}
	
	public Car(int length, int max_passengers, Car next) {
		this.length = length ;
		this.max_passengers = max_passengers; 
		setNext(next);
	}	
	
	public String toString() { 
		return "-->Car:["+this.getLength()+", "+this.getMaxPassengers()+", "+this.getNext()+"] ";
	}
	
	public Car getNext() {
		return next;
	}
	
	public void setNext(Car next) {
		this.next = next;
	}

	public int getMaxPassengers() {
		return max_passengers;
	} 

	public int getLength() {
		return length;
	}  
	
}
