package Blatt7;

public class CoffeeMachine {
	double water;
	double waterMax; //maximum für wasserbehälter
	double beans;
	double beanMax; //maximum für Bohnenbehälter
	int coffeeCups; //schon gebruehten Tassen
	int restCups; //noch zu bruehenden Tassen 
	
	CoffeeMachine(double w, double k) {
		water = 0;
		waterMax = w;		
		beans = 0;
		beanMax = k;		
		coffeeCups = 0; 
	}
	
	void fillBeans(double k) {
		if (k <= beanMax) {
			if(k + beans > beanMax) {
				System.out.println("Bohnenbehaelterkapazitaet ueberschritten");
				System.out.println();				
			}
			else
				beans = beans + k;
		}
		else {
			System.out.println("Bohnenbehaelterkapazitaet ueberschritten: limit = " + beanMax +" g.");
			System.out.println();			
		}
	}
	
	void fillWater(double w) {
		if (w <= waterMax) {
			if ( w + water > waterMax) {
				System.out.println("Wasserbehaelterkapazitaet ueberschritten");
				System.out.println();				
			}
			else
				water = water + w;
		}
		else {
			System.out.println("Wasserbehaelterkapazitaet ueberschritten: limit = " + waterMax + " ml."); 
			System.out.println();			
		}
	}
	
	void brew() {
		if (coffeeCups < 12 && restCups > 0) {
			if (water < 150 && beans > 7.5) {
				System.out.println("Wasserbehaelter nachfuellen");
				System.out.println();
			}
			else if (water > 150 && beans < 7.5) {
				System.out.println("Bohnennehaelter nachfuellen");
				System.out.println();
			}
			else if (water < 150 && beans < 7.5) {
				System.out.println("Wasser- und Bohnenbehaelter nachfuellen");
				System.out.println();
			}
			else {
				System.out.println("Eine Tasse Kaffee wird gebrueht...");
				water = water - 150;
				beans = beans - 7.5;
				coffeeCups++;
				restCups--;
				System.out.println();
			}
		}
		else if (coffeeCups >= 12) {
			System.out.println("/_!_\\ Reinigen Sie bitte die Maschine /_!_\\");
			System.out.println();
		}			
		else {
			System.out.println("Unbekanntes Problem !");
			System.out.println();
		}		
	}

	void clean() { 
		System.out.println("Reinigung...");
		coffeeCups = 0;
		restCups = 12;
		water = 0;
		beans = 0;		 
		System.out.println(); 	
	}
	
	void info() {
		System.out.printf("Wasserbehaelter: %.2f ml %n", water);
		System.out.printf("Kaffeebohnenbehaelter: %.2f g %n", beans);
		System.out.printf("Gebruehte(n) Tasse(n): %d %n", coffeeCups);
		System.out.printf("Noch zu bruehenden Tassen: %d %n%n", restCups);
	}
}
