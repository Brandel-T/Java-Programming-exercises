
public class RueckwaertsAusgabe {

	public static void main(String[] args) {

//		int n = Integer.parseInt(args[0]);
		int n = 3057250;
		
		if (n<=0)
			System.out.println("Eingabezahl muss grosser 0 sein.");
		else
		{
			int quotient = n;
			int rest = 0;
			
			while (quotient != 0) 
			{
				rest = quotient%10;
				quotient = quotient / 10;
				
				switch (rest) {
				case 0:
					System.out.print("zero ");
					break;
				case 1:
					System.out.print("eins ");
					break;
				case 2:
					System.out.print("zwei ");
					break;
				case 3:
					System.out.print("drei ");
					break;
				case 4:
					System.out.print("vier ");
					break;
				case 5:
					System.out.print("fünf ");
					break;
				case 6:
					System.out.print("sechs ");
					break;
				case 7:
					System.out.print("sieben ");
					break;
				case 8:
					System.out.print("acht ");
					break;
				case 9:
					System.out.print("neun ");
					break;
				default:
					System.out.println("unbekannter Fehler");
				} 
			}
		}

	}

}
