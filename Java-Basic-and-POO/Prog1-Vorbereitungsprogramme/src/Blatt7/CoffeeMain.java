package Blatt7;

import java.util.Scanner; 

public class CoffeeMain {

	public static void main(String[] args) {
		System.out.println("Gebreauchanweisung:");
		System.out.printf(
				"Maximale Wasserbehaelterkapazitaet: 2000 ml %n"
				+ "Maximale Bohnenbehaelterkapazitaet: 100 g %n"
				+ ">> Befehle: %n"
				+ " [brew]: Eine Tasse Kaffee bruehen %n"
				+ "[water]: Wasserbehaelter nachfuellen %n"
				+ "[beans]: Bohnenbehaelter nachfuellen %n"
				+ "[clean]: Kaffeemaschine reinigen %n"
				+ " [info]: Informationen ueber Bruehung %n"
				+ " [help]: Gebrauchsanleitung anzeigen %n"
				+ " [exit]: Kaffeemaschine ausschalten. %n");
		System.out.println();
		
		CoffeeMachine cm = new CoffeeMachine(2000, 100);
		String befehl = "";
		boolean state = true;
		Scanner input = new Scanner(System.in);		
		double water, bean;
		
		while( state ) 
		{		
			System.out.println("Geben Sie ein Befehl ein...");
			befehl = input.nextLine();
			System.out.println();
			
			switch( befehl ) {
				case "brew":
					cm.brew();
					break;
				case "water":
					System.out.println("Wie viele ml Wasser moechten Sie nachfuellen: ...");
					water = input.nextDouble();
					cm.fillWater(water);
					break;
				case "beans":
					System.out.println("Wie viele Gramm Kaffeebohnen moechten Sie nachfuellen: ...");
					bean = input.nextDouble();
					cm.fillBeans(bean);
					break;
				case "clean" :
					cm.clean();
					break;
				case "exit":
					state = false;
					break;
				case "info":
					cm.info();
					break;
				case "help":
					System.out.printf(">> Befehle: %n"
							+ " [brew]: Eine Tasse Kaffee bruehen %n"
							+ "[water]: Wasserbehaelter nachfuellen %n"
							+ "[beans]: Bohnenbehaelter nachfuellen %n"
							+ "[clean]: Kaffeemaschine reinigen %n"
							+ " [info]: Informationen ueber Bruehung %n"
							+ " [help]: Gebrauchsanleitung anzeigen %n"
							+ " [exit]: Kaffeemaschine ausschalten. %n%n");
					break;
				case "":
					break;
				default: 		
					System.out.println("/_!_\\ "+"["+ befehl+"] : "+ "Befehl unerkannt /_!_\\"); 
					System.out.println("Geben Sie [help] ein, um die Befehle aufzulisten.");					
					System.out.println();					
			}
		}
	}
}