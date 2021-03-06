package Blatt5;

public class TriangleMain {

	public static void main(String[] args) {
		double xa = Double.parseDouble(args[0]);
		double ya = Double.parseDouble(args[1]);
		Point a = new Point(xa, ya);
		
		double xb = Double.parseDouble(args[2]);
		double yb = Double.parseDouble(args[3]);
		Point b = new Point(xb, yb);
		
		double xc = Double.parseDouble(args[4]);
		double yc = Double.parseDouble(args[5]);
		Point c = new Point(xc, yc);
		
		double koef = Double.parseDouble(args[6]);
		
		Point vector = new Point( Double.parseDouble(args[7]),
								  Double.parseDouble(args[8]));
		
		if ( (xa == xb && ya == yb) || (xa == xc && ya == yc) || (xb == xc && yb == yc))
			System.out.println("Fehler: alle Punkte sind gleich.");
		else {
			Triangle tr = new Triangle(a, b, c);
			tr.output(koef, vector);			
		}
	}

}
