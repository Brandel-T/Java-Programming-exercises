package Abnahme03;

public class Room extends EstateObject {
	
	int number;
	double toUseArea;
	boolean furnished; 
	
	Room(int number, int toUseArea, boolean furnished, String key, String owner, String place, double price ) {
		super(key, owner, place, price);
		this.number = number;
		this.toUseArea = toUseArea;
		this.furnished = furnished;
	} 
 
	public void printData() {
		System.out.println("Room data:\n-------------------");
		super.printData();
		System.out.println("Number: " + this.number);
		System.out.println("Usable area: " + this.toUseArea + " square meter");
		System.out.println("Room is" + (furnished ? " furnished" : " not furnished") );		
	}
 
	public int calculateRoomSpace() { 
		return (int)this.toUseArea;
	}

}
