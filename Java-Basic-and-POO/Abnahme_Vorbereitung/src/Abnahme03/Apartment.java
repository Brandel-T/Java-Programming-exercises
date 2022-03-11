package Abnahme03;

public class Apartment extends EstateObject {
	int number; 
	boolean furnished; 
	Room[] rooms;
	int numberOfRooms;

	public Apartment(int number, Room[] rooms, String key, 
					 String owner, String place, double price) {
		super(key, owner, place, price); 
		this.number = number; 
		this.furnished = false;
		for (int i=0; !furnished && i < rooms.length; i++) {
			if ( rooms[i].furnished ) {
				this.furnished = true;
			}
		}
		this.rooms = rooms;
		this.numberOfRooms = this.rooms.length;
	}

	public void printData() {
		System.out.println("Apartment data:\n---------------------");
		super.printData();
		System.out.println("Number: " + this.number); 
		System.out.println("Apartment is" + (furnished ? " furnished" : " not furnished") );
		System.out.println("Number of rooms in apartment: " + this.numberOfRooms);	
		System.out.println("Apartment usable area: " + this.calculateRoomSpace() + " square meter");	
	}
	 
	public int calculateRoomSpace() { 
		int res = 0;
		for (Room room : this.rooms)
			res += room.calculateRoomSpace();
		return res;
	}

}
