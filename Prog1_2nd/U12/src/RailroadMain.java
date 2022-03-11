
public class RailroadMain {

	public static void main(String[] args) {
		Car c1 = new Car(1, 1);
		Car c2 = new Car(2, 2, c1);
		Car c3 = new Car(3, 3, c2);
		Locomotive loco1 = new Locomotive(12, "Edo Tensei", c3);
		Train tr1 = new Train(loco1);
		System.out.println( tr1.toString() );
		tr1.print();
		System.out.println( );
		
		System.out.println("Train lenght: " + tr1.getLength());

		System.out.println( );
		
		System.out.println("Train passengers: " + tr1.getPassengers());
		
		System.out.println();
		
		tr1.removeFirst();
		
		System.out.println();
		
		System.out.println("First car removed");
		System.out.println(tr1);
		
		System.out.println();
		
		Car c4 = new Car(4, 4);
		Car c5 = new Car(5, 5, c4);
		Car c6 = new Car(6, 6, c5);		
		Locomotive loco2 = new Locomotive(37, "Akatsuki", c6);
		Train tr2 = new Train(loco2);		
		System.out.println( tr2.toString() );
		
		System.out.println();
		
		System.out.println("relink");
		Train tr4 = tr1.relink(tr2);
		System.out.println(tr4);
		
		System.out.println();
		System.out.println("revert:");
		System.out.println("      before: " + tr2 ); 
		
		System.out.println();

		Train tr3 = tr1.add(c5, 1);
		System.out.println( tr3 );
	}

}
