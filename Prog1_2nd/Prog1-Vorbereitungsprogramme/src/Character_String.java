
public class Character_String {

	public static void main(String[] args) {
		//Viele int Werte sind keine zulässige Codes
		// => Typcast produziert keine sinnvollen Ergebnis:
		char letter = (char) (-317); // ?
		System.out.println("letter = "+ letter);
		
		//Besonderheiten der Klasse String
		System.out.println(3 + "5"); //35
		System.out.println("3" + 5); //35
		System.out.println("" + 5); //5
		System.out.println(5 + ""); //5
		System.out.println( (1==1) + "true" ); //truetrue

		

	}

}
