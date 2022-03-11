import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) 
	{				
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Give the maximum capacity you want for the \"coffee hopper\" (at least 7.5): ");
//		double k = sc.nextDouble(); 
//		if ( k < 0 ) {
//			System.out.println("Inputs must be positiv"); 
//			//after this while loop k will be positive
//			while ( k < 0 ) {
//				System.out.println("Give the maximum capacity you want for the \"coffee hopper\" (at least 7.5): ");
//				k = sc.nextDouble(); 
//			}
//		}
//		
//		System.out.println("Give the maximum capacity you want for the \"water hopper\" (at least 150): ");
//		double w = sc.nextDouble();  
//		if ( w < 0 ) {
//			System.out.println("Inputs must be positiv"); 
//			//after this while loop w will be positive
//			while ( w < 0 ) { 
//				System.out.println("Give the maximum capacity you want for the \"water hopper\" (at least 150): ");
//				w = sc.nextDouble();
//			}
//		}		 
//		
//		CoffeeMachine cm = new CoffeeMachine(k, w); 
//		
//		System.out.println("\nHow to use it: \n---------------------------------------");
//		System.out.println("max coffee quantity: "+ cm.k + " g. \nmax water quantity " + cm.w + " ml.");
//		System.out.println("[0]: exit - to stop the coffee maker");
//		System.out.println("[1]: fillBeans - to fill the Coffee hopper");
//		System.out.println("[2]: fillwater - to fill the water hopper");
//		System.out.println("[3]: brew - to brew one coffee cup");
//		System.out.println("[4]: clean - to clean the coffee maker");
//		System.out.println("[5]: state - to get the current state of the coffee maker");
//		System.out.println("[6]: help - to get \"How to use it\" informations");
//		System.out.println("---------------------------------------");
//		
//		 
//		int cmd ;
//		boolean ok = true;
//		while (ok) 
//		{ 
//			System.out.print("\ncmd\\> ");  
//			cmd = sc.nextInt(); 
//			switch(cmd) 
//			{
//				case 0: //exit
//					ok = false;
//					System.out.println("exit.");
//					sc.close();
//					break;
//				case 1:
//					cm.fillCoffee();
//					break;
//				case 2:
//					cm.fillWater();
//					break;
//				case 3:
//					cm.brew();
//					break;
//				case 4:
//					cm.clean();
//					break;
//				case 5:
//					cm.getState();
//					break;
//				case 6: //help
//					System.out.println("How to use it: \n---------------------------------------");
//					System.out.println("max coffee quantity: "+ cm.k + " g. \nmax water quantity " + cm.w + " ml.");
//					System.out.println("[0]: to stop the coffee maker");
//					System.out.println("[1]: to fill the Coffee hopper");
//					System.out.println("[2]: to fill the water hopper");
//					System.out.println("[3]: to brew one coffee cup");
//					System.out.println("[4]: to clean the coffee maker");
//					System.out.println("[5]: to get the current state of the coffee maker");
//					System.out.println("[6]: to get \"How to use it\" informations");
//					System.out.println("---------------------------------------");
//					break;
//				default:
//					System.out.println("Command do not exit !");
//					System.out.println("Enter [6] for \"help\"");					
//			}
//		}		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the maximum capacity you want for the \"coffee hopper\" (at least 7.5 g): ");
		double k = sc.nextDouble();  

		//after this while loop k will be great or equal 7.5 g
		//so that from the start there are at least enough coffee beans in the coffee machine to make a cup
		while ( k < 7.5 ) {
			System.out.println("This input must be great or equal 7.5"); 
			System.out.println("Give the maximum capacity you want for the \"coffee hopper\" (at least 7.5 g): ");
			k = sc.nextDouble(); 
		} 
		
		System.out.println("Give the maximum capacity you want for the \"water hopper\" (at least 150 ml): ");
		double w = sc.nextDouble(); 

		//after this while loop w will be great or equal 150 ml
		//so that from the start there is at least enough water in the coffee machine to make a cup
		while ( w < 150 ) { 
			System.out.println("This input must be great or equal 150"); 
			System.out.println("Give the maximum capacity you want for the \"water hopper\" (at least 150 ml): ");
			w = sc.nextDouble();
		} 		 
		
		CoffeeMachine cm = new CoffeeMachine(k, w); 
		
		System.out.println("max coffee quantity: "+ cm.k + " g. \nmax water quantity " + cm.w + " ml.");
		System.out.println("\nHow to use it: \n---------------------------------------");
		System.out.println("[0]: exit - to stop the coffee maker");
		System.out.println("[1]: fillBeans - to fill the Coffee hopper");
		System.out.println("[2]: fillwater - to fill the water hopper");
		System.out.println("[3]: brew - to brew one coffee cup");
		System.out.println("[4]: clean - to clean the coffee maker");
		System.out.println("[5]: state - to get the current state of the coffee maker");
		System.out.println("[6]: help - to get \"How to use it\" informations");
		System.out.println("---------------------------------------");
		
		 
		int cmd ;
		boolean ok = true;
		while (ok) 
		{ 
			System.out.print("\ncmd\\> ");  
			cmd = sc.nextInt(); 
			switch(cmd) 
			{
				case 0: //exit
					ok = false;
					System.out.println("exit.");
					sc.close();
					break;
				case 1:
					cm.fillCoffee();
					break;
				case 2:
					cm.fillWater();
					break;
				case 3:
					cm.brew();
					break;
				case 4:
					cm.clean();
					break;
				case 5:
					cm.getState();
					break;
				case 6: //help
					System.out.println("How to use it: \n---------------------------------------");
					System.out.println("max coffee quantity: "+ cm.k + " g. \nmax water quantity " + cm.w + " ml.");
					System.out.println("[0]: to stop the coffee maker");
					System.out.println("[1]: to fill the Coffee hopper");
					System.out.println("[2]: to fill the water hopper");
					System.out.println("[3]: to brew one coffee cup");
					System.out.println("[4]: to clean the coffee maker");
					System.out.println("[5]: to get the current state of the coffee machine");
					System.out.println("[6]: when you need help");
					System.out.println("---------------------------------------");
					break;
				default:
					System.out.println("Command do not exist !");
					System.out.println("Enter [6] for \"help\"");					
			}
		}			
	}
}
