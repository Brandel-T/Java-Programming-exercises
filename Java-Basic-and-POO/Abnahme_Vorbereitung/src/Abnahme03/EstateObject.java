package Abnahme03;

public abstract class EstateObject {
	
	protected String key;
	protected String owner;
	protected String place;
	protected double price;
	
	public EstateObject(String key, String owner, String place, double price) {
		this.key = key;
		this.owner = owner;
		this.place = place;
		this.price = price;
	}
	
	public void printData() {
		System.out.println("key: " + key);
		System.out.println("owner: " + owner);
		System.out.println("place: " + place);
		System.out.println("price: " + price + " EURO");
	}
	
	public abstract int calculateRoomSpace();
}
