
public class Triangle {

	Point a;
	Point b;
	Point c;
	
	Triangle (Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	double getPerimeter() {
		return a.distance(b) + a.distance(c) + b.distance(c);
	}
	
	/*
	 * eine andere Formel zur Berechnung des Flaecheninhalts
	 * eines Dreiecks mit den Punkten A, B und C ist:
	 * 
	 * Area = ( Ax*(By-Cy) + Bx*(Cy-Ay) + Cx*(Ay-By) ) / 2;
	 */
	double getArea() {
		return Math.abs( ( a.getX()*(b.getY()-c.getY()) 
						 + b.getX()*(c.getY()-a.getY())
						 + c.getX()*(a.getY()-b.getY()) ) / 2 );
	}
	
	void zStreckung(Point center, double koef) 
	{
		this.a.setX( koef*a.getX() + (1-koef)*center.getX() );
		this.a.setY( koef*a.getY() + (1-koef)*center.getY() );
		
		this.b.setX( koef*b.getX() + (1-koef)*center.getX() );
		this.b.setY( koef*b.getY() + (1-koef)*center.getY() );
		
		this.c.setX( koef*c.getX() + (1-koef)*center.getX() );
		this.c.setY( koef*c.getY() + (1-koef)*center.getY() );
		
		//aa, bb und cc sind die Bilder von a, b und c durch die 
		//zentrische Streckung mit dem Ursprung center und dem Koeffizient koef
//		Point aa = new Point(koef*a.getX() + (1-koef)*center.getX(), koef*a.getY() + (1-koef)*center.getY());
//		Point bb = new Point(koef*b.getX() + (1-koef)*center.getX(), koef*b.getY() + (1-koef)*center.getY());
//		Point cc = new Point(koef*c.getX() + (1-koef)*center.getX(), koef*c.getY() + (1-koef)*center.getY());
//
//		return new Triangle(aa, bb, cc);
	}
	
	/*
	 * Verschieben des Triangles
	 * vector repraesentiert hier den Vector zur Verschiebung
	 */
	void translation(Point vector) 
	{
		this.a.setX( a.getX() + vector.getX() );
		this.a.setY( a.getY() + vector.getY() );
		
		this.b.setX( b.getX() + vector.getX() );
		this.b.setY( b.getY() + vector.getY() );
		
		this.c.setX( c.getX() + vector.getX() );
		this.c.setY( c.getY() + vector.getY() );
//		return new Triangle( new Point(a.getX() + vector.getX(), a.getY() + vector.getY()),
//							 new Point(b.getX() + vector.getX(), b.getY() + vector.getY()),
//							 new Point(c.getX() + vector.getX(), c.getY() + vector.getY()) );
	}
	
	//textuelle Ausgabe
	void output(Point center, double koef, Point vector) {
		System.out.printf("Umfang = %.2f Umfangeinheit %n", this.getPerimeter());
 
		System.out.printf("Flaecheninhalt = %.2f Flaecheneinheit %n", this.getArea());

		zStreckung(center, koef);
		System.out.print("Nach zentrischer Streckung, Streckzentrum ");
		center.printPoint();
		System.out.print("und Streckfactor koef = " + koef + "; neues Dreieck mit den Punkten");

		System.out.print(" :\n  AA");
		this.a.printPoint();
		System.out.print("BB");
		this.b.printPoint();
		System.out.print("CC");
		this.c.printPoint(); 
		
		translation(vector);
		System.out.print("\nNach dieser zentrischen Streckung und Verschiebung vom pfeil");
		vector.printPoint();
		System.out.println("; neues Dreieck mit den Punkten : "); 
		System.out.print("  AA");
		this.a.printPoint();
		System.out.print("BB");
		this.b.printPoint();
		System.out.print("CC");
		this.c.printPoint();
	}
}