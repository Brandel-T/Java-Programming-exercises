package Blatt3;

public class Schaltjahr {

	public static void main(String[] args) {
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		if (day > 0 && day < 32) {
			if (month > 0 && month < 13) {
				if (year > 1582) {
					if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
						System.out.println("Das Datum ist korrekt und ist zudem ein Schaltjahr.");
					} else {
						System.out.println("Das Datum ist zwar korrekt, aber ist nicht ein Schaltjahr.");
					}
				} else {
					System.out.println("Das Datum ist false.");
				}
			} else {
				System.out.println("Das Datum ist false.");
			}
		} else {
			System.out.println("Das Datum ist false.");
		}
	}
}
