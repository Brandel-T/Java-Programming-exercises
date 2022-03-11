package Abnahme03;

public class MainHouse {
	
	public static void main(String[] args) {
		
		Room zimmer = new Room(0, 12, true, "Prog1", "V.L.", "TH Bingen", 300.5); 
		zimmer.printData(); 
		
		System.out.println();
		
		Room[] rooms = {zimmer, zimmer, zimmer}; 
		Apartment wohnung = new Apartment(123, rooms, "Prog1-P3", "V.F.", "Buedesheim", 500.99);
		wohnung.printData(); 
		
		System.out.println();

		Room r1 = new Room(11, 17, false, "Room1", "Tendo", "Hier", 200);
		Room r2 = new Room(22, 14, true, "Room2", "Pain", "Ort", 190);
		Room[] wr2 = {r1, r2};
		Room[] wr3 = rooms;
		Room[] wr4 = {r1, r2, new Room(23, 46, false, "Room3", "Pau", "Stadt", 455), 
				new Room(34, 56, false, "Room4", "Luiz", "Mainz", 590.5)
		};
		Apartment w1 = new Apartment(1, wr2, "Prog1-P3", "V.M.", "Buedesheim", 500.99);
		Apartment w2 = new Apartment(2, wr3, "PP3", "V.F.", "Koehl", 5870.99);
		Apartment w3 = new Apartment(3, wr4, "PP4", "V.B.", "Lutich", 800.99);
		Apartment[] apts1 = {w1, w2, w3};
		Apartment[] apts2 = {wohnung, w3, w1};		
		House h1 = new House(23, apts1, "007", "TH Campus", "Bingen", 3400.5);
		House h2 = new House(24, apts2, "567", "TH Campus 2", "Bingen-Bued.", 3500);
		
		h1.printData();
		System.out.println("h1 Nuetzflaeche: " + h1.calculateRoomSpace() );

		System.out.println();
		
		h2.printData();
		System.out.println("h2 Nuetzflaeche: " + h2.calculateRoomSpace() );
		
	} 	
}
