public class ClockMain {
	public static void main(String[] args) {
		ClockTime x = new ClockTime();
		ClockTime y = new ClockTime(0, 0, 1);

		// Differenz
		System.out.print("Die Differenz zwischen ");
		y.output();
		System.out.print(" und ");
		x.output();
		System.out.print(" ist gleich " + y.diff(x) + " Sekunden \n");
		System.out.println();

		// Kopieren
		ClockTime kopie = new ClockTime(x);

		// vergleichen
		System.out.print("Sind die Uhrzeiten ");
		x.output();
		System.out.print(" und ");
		kopie.output();
		System.out.println(" gleich? " + x.same(kopie));
		System.out.println();

		// addieren
		x.output();
		System.out.print(" + 900 Sekunden = ");
		x.add(900);
		x.output();
		System.out.println();
		System.out.println();

		// getSec
		System.out.println(x.getSeconds() + " Sekunden");

		// getMin
		System.out.println(x.getMinutes() + " Minuten");

		// getH
		System.out.println(x.getHours() + " Stunden");
	}
}
