public class Schaltjahr {

	public static void main(String[] args) {
		
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);

//		if (year >= 1583) {
		//l'année ne doit pas aussi avoir plus de 5 chiffres 
		if (year >= 1583 && year <= 9999)
		{
			if ((month==1||month==3||month==5||month==7||month==9||month==11||month==12) && (day > 0 && day < 32))
				System.out.printf("%d %d %d : Syntax und Semantik korrekt", day, month, year);				
			else if ((month==4||month==6||month==8||month==10) && (day > 0 && day < 31)) 
				System.out.printf("%d %d %d : Syntax und Semantik korrekt", day, month, year);	
			else if (month==2 && (day > 0 && (day<=28 || day<=29)))
				System.out.printf("%d %d %d : Syntax und Semantik korrekt", day, month, year);	
			else
				System.out.printf("%d %d %d : Syntax korrekt und Semantik nicht korrekt", day, month, year);
			
						
			if ( (year%4 == 0 && year%100 != 0) || year%400 == 0 )
				System.out.println(", "+ year + " : ist Schaltjahr.");
			else
				System.out.println(", "+ year + " : ist aber kein Schaltjahr.");
		} 
		else {
			System.out.println("Ungueltiges Datum.");
		}
	}
}