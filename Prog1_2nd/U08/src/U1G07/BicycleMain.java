package U1G07;

public class BicycleMain {

	public static void main(String[] args) {
		
		Bicycle bike = new Bicycle("Mountain Bike", 3, 9);
		
		System.out.println("brand: " + bike.getBrand());
		System.out.println("Anzahl Zahnkraenze: " + bike.getChainRingCount());
		System.out.println("Anzahl Ritzel: " + bike.getSprockCount());
		System.out.println("Standard ausgewaehlte Zahnkranz(am Anfang): " + bike.getChainRing());
		System.out.println("Standard ausgewaehltes Ritzel(am Anfang): " + bike.getSprock());
		System.out.println("\n--------------SIMULATION---------------");
		
		bike.printStatus();
		bike.gearUp(); 

		System.out.println("---------------------");
		for (int i=bike.getSprockCount(); i>0; i--) {
			bike.printStatus();
			bike.gearUp();
		}
		
		System.out.println("---------------------");
		for (int i=0; i<bike.getSprockCount(); i++) {
			bike.printStatus();
			bike.gearDown();
		}
		
		System.out.println("---------------------");
		for (int i=0; i<bike.getChainRingCount(); i++) {
			bike.printStatus();
			bike.shiftUpChainRing();
		}

		System.out.println("---------------------");
		for (int i=bike.getChainRingCount(); i>0; i--) {
			bike.printStatus();
			bike.shiftDownChainRing();
		}
	}

}
