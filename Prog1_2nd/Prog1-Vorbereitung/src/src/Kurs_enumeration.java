
public class Kurs_enumeration {

	enum Day {
		MONTAG(false), 
		DIENSTAG(false), 
		MITTWOCH(false), 
		DONNERSTAG(false), 
		FREITAG(false), 
		SAMSTAG(true), 
		SONNTAG(true);
		/**
		 * ne pas oublier de placer la virgule � la fin du listage des Enumobjekt 
		 * sinon la suite (par exple des methodes ou un constructeur ) sera consid�r�
		 * comme une suite de ce listage
		 */ 

		//attribut affect� � chaque Enumobject qui sera cr�e
		private final boolean weekend;
		
		//le constructor est toujours >> priv� << dans les enum
		Day(boolean isWeekend) {
			this.weekend = isWeekend;
		}
		
		boolean getWeekend() {
			return this.weekend;
		}
		
		void setWeekend(boolean w) {
			//� ce niveau il y a erreur car l'attribut weekend doit �tre "final" (non modifiable tout comme les "Enumobjekt")
			//this.weekend = w;
		}
		
		//methode enum
		boolean isWeekend() {
			return this.weekend;
		}
		
		/**
		 * on redefini la methode toString , car lorsqu'on
		 * utilise la methode "System.out.println()" cette derniere
		 * fait appel � la m�thode "toString()" pour l'affichage d'un
		 * contenu en chaine de caract�re.
		 */
		@Override
		public String toString() {
			return String.valueOf(weekend);
		}
	}
	
	public static void main(String[] args) {
		Day day1 = Day.MONTAG;
		System.out.println( day1.isWeekend());
		Day day = Day.SAMSTAG;
		System.out.println(day.isWeekend());
		
//		System.out.println("Avant : " + day.isWeekend());
//			day.setWeekend(!day.getWeekend());
//		System.out.println("Apr�s : " + day.isWeekend());
		
//		for (Day tag : Day.values()) {
//			System.out.println("[object = " + tag );
//		}
		
		System.out.println(day.ordinal());
		System.out.println(Integer.parseInt("1000", 2));
		System.out.println(Integer.toBinaryString(-7));
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
	
	}
	
}
