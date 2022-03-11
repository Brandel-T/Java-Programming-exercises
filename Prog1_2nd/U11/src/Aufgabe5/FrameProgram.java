package Aufgabe5;
 
import java.util.Scanner;

public class FrameProgram {
	
	static Animal[] tiere ; 
	
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		tiere=new Animal[100];
		boolean go = true;
		
		System.out.println("Willkommen im Tierpark. Viel Vergn\u00FCgen.");
		String a="";
		while(go) {
			System.out.println("-------------------------------------------------------");
			System.out.println("Was willst du tun?");
			System.out.println("1) Ein Tier erschaffen");
			System.out.println("2) Ein Tier l\u00F6schen");
			System.out.println("3) Ausgabe aller Daten");
			System.out.println("4) Ausgabe der Anzahl der fliegenden Tiere");
			System.out.println("5) Ausgabe der Anzahl der schwimmenden Tiere");
			System.out.println("6) Ausgabe der Anzahl der gehenden, fliegenden Tiere"); 
			System.out.println("7) Programm beenden");
			 a = sc.next();
			switch(a) {
			case "1":
				createAnimal();
				break;
			case "2":
				drop();
				break;
			case "3":
				data();
				break;
			case "4":
				countFly();
				break;
			case "5":
				countSwimm();
				break;
			case "6":
				countWalkFly();
				break;  
			case "7":
				go=false;
				break;
			default:
				System.out.println("!!Ung\u00FCltige Eingabe!!");	
			}				
		} 
	}
	
	public static void createAnimal() 
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Animals: 1-Bird, 2-Mosquito, 3-Dog, 4-Cow, 5-Barracuda, 6-Swordfish, 7-Flyingdinosaur"); 
		int i=0;
		for (i=0; i< tiere.length && tiere[i] != null; i++); //get a free index where we can add a new animal
		
		if (tiere[i] != null) 
			System.out.println("can not create an another animal");
		else
		{
			System.out.println("Animals you can add: \"Bird\", \"Mosquito\", \"Dog\", \"Cow\", \"Barracuda\", \"Swordfish\", \"Flyingdinosaur\"\n>"); 
			String x = sc.next();
			String name = "";
			switch( x ) {
			case "Bird":
				tiere[i] = new Bird(); 
				break;
			case "Mosquito":
				tiere[i] = new Mosquito();
				break;
			case "Dog":
				tiere[i] = new Dog();
				break;
			case "Cow":
				tiere[i] = new Cow();
				break;
			case "Swordfish":
				tiere[i] = new Swordfish();
				break;
			case "Barracuda":
				tiere[i]=new Barracuda();
				break;
			case "FlyingDinosaur":
				tiere[i] = new FlyingDinosaur();
				break;
			default: 
				System.out.println("Falsche Eingabe");
				createAnimal();
				return;
			}

			System.out.println("How do you want to call this animal ?");
			name = sc.next();
			System.out.println("What will it weigh?");
			double w = sc.nextDouble();
			while ( w < 0 ) {
				System.out.println("Weight must be positive, give it again:");
				w = sc.nextDouble();
			}
			
			tiere[i].setName(name);
			tiere[i].setWeight(w);
		} 
	}
	
	public static void drop() {
		Scanner sc = new Scanner(System.in);
		System.out.println("which animal want you to kill ? Give the name:");
		String name = sc.next();
		boolean go = true;
		int i=0;
		for ( i=0; i<tiere.length && go; i++) {
			if ( tiere[i] != null && tiere[i].getName().equals(name) ) {
				tiere[i] = null;
				go = false;
			}
		}
		System.out.println("The animal called " + name + " has been suppressed.");
		sc.close();
	}
	
	public static void data() {
		for (int i=0; i<7; i++)
			if (tiere[i] != null)
				System.out.println(tiere[i].toString());
	}
	
	public static void countFly() {
		int count=0;
		for (int i=0; i<tiere.length; i++)
			if (tiere[i] != null && tiere[i] instanceof Flying)
				count++;
		System.out.println(count + " animals can fly");
	}

	public static void countSwimm() {
		int count=0;
		for (int i=0; i<tiere.length; i++)
			if (tiere[i] != null && tiere[i] instanceof Swimming)
				count++;
		System.out.println(count + " animals can swimm");
	}

	public static void countWalkFly() {
		int count=0;
		for (int i=0; i<tiere.length; i++)
			if (tiere[i] != null && tiere[i] instanceof Walking && tiere[i] instanceof Flying )
				count++;
		System.out.println(count + " animals can walk and fly");
	}

}
