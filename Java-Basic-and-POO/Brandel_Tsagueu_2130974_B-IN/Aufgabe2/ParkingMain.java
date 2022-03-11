package Aufgabe2;
 

public class ParkingMain {

	public static void main(String[] args) { 

		ParkingArea pa = new ParkingArea(50, 64);   
		Car[] cars = new Car[42];  
		for (int i=0; i<cars.length; i++) {
			cars[i] = new Car("car"+i);
		}
		
		for ( int i=0; i <cars.length; i++ )
		{
			pa.parking(cars[i]);
			if ( i==20 )
				System.out.println("nach 21 fahrzeuge "+( pa.places.length*pa.places[0].length - pa.freeSlots() ));
			if ( i==41 )
				System.out.println("nach 42 fahrzeuge "+ (pa.places.length*pa.places[0].length - pa.freeSlots()) );
		}
	
	}

}
