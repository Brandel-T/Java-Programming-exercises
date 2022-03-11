package Blatt8;

public class BicycleMain {
	
	public static void main(String[] args) {
		Bicycle bike = new Bicycle("VTT", 3, 9);
		System.out.println(bike.getChainRing());
//		bike.printStatus();
		
		bike.shiftDownChainRing();  
		bike.shiftUpChainRing();  
		
		bike.gearDown();
		bike.gearUp();
		bike.gearUp();
		bike.gearUp();
//		bike.gearDown();
//		bike.gearDown(); 
		bike.gearUp();
		bike.gearUp();
		bike.gearUp();
		bike.gearUp();
		bike.gearUp();
		bike.printStatus();
	}
}
