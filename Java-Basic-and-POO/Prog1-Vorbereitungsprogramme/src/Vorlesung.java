
public class Vorlesung {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		double max = a;

		if (b > max)
			max = b;
		if (c > max)
			max = c;
		System.out.println(max);
	}

}
