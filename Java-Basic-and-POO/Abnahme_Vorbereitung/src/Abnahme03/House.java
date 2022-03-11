package Abnahme03;

public class House extends EstateObject {

	int number; 
	boolean furnished; 
	Apartment[] apt;
	int numberOfRooms;

	public House(int number, Apartment[] apt, String key, 
					 String owner, String place, double price) {
		super(key, owner, place, price); 
		this.number = number; 
		this.furnished = false;
		for (int i=0; !furnished && i < apt.length; i++) {
			if ( apt[i].furnished ) {
				this.furnished = true;
			}
		}
		this.apt = apt;
		this.numberOfRooms = this.apt.length;
	}

	@Override
	public void printData() {
		System.out.println("House data:\n---------------------");
		super.printData();
		System.out.println("Number: " + this.number); 
		System.out.println("House is" + (furnished ? " furnished" : " not furnished") );
		System.out.println("Number of rooms in house: " + this.numberOfRooms);
		System.out.println("House usable area: " + this.calculateRoomSpace() + " square meter");
	}

	@Override
	public int calculateRoomSpace() { 
		int res = 0;
		for (Apartment ap : this.apt )
			for (Room room : ap.rooms)
				res += room.calculateRoomSpace();
		return res;
	}
}
