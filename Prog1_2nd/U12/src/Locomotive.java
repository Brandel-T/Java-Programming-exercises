
public class Locomotive {

	final int length;
	final String type;
	private Car next;
	 
	
	public Locomotive(int length, String type) {
		this(length, type, null);
	}

	public Locomotive(int length, String type, Car next) {
		this.length = length;
		this.type = type;
		setNext(next);
	}

	public String toString() {
		return "Locomotive: | "+this.getLength()+", "+this.getType()+" | "+ getNext()  ;
	}
	
	public int countCars() {
		int cars = 0;
		Car c = this.getNext();
		while ( c != null ) {
			cars++;
			c = c.getNext();
		}
		return cars;
	}
	
	
	
	
	public Car getNext() {
		return next;
	}
	
	public void setNext(Car next) {
		this.next = next;
	}

	public String getType() {
		return type;
	}
 

	public int getLength() {
		return length;
	}
 
}
