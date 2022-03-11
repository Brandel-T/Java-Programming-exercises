
public class Sum_UmgebungsVariable {

	public static void main(String[] args) {
		//Test von Eingabewerte auf der Kommandozeile mittels Umgebungsvariablen
		double n = Double.parseDouble(System.getenv("N"));
		double m = Double.parseDouble(System.getenv("M"));
		
		System.out.println(n);
		System.out.println(m);
		System.out.println(n+m);
		
		//System.out.println("add(n, m) = " + (n+m)); // die Klammer von (n+m) nicht vergessen!!!
	}

}
