package Blatt5;

public class Triangle {

	Point a;
	Point b;
	Point c;
	
	Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	double getPerimeter() {
		return a.distance(b) + a.distance(c) + b.distance(c);
	}
	
	// https://www.java67.com/2016/10/how-to-calculate-area-of-triangle-in.html
	double getArea() {
		return ( a.getX()*( b.getY()-c.getY() ) + 
				 b.getX()*( c.getY()-a.getY() ) +
				 c.getX()*( a.getY()-b.getY() ) ) / 2;
	}
	
	Triangle zStreckung(double koef) {
		return new Triangle( new Point(a.getX()*koef, a.getY()*koef),
							 new Point(b.getX()*koef, b.getY()*koef),
							 new Point(c.getX()*koef, c.getY()*koef) );
	}
	
	void translation(Point vector) {
		this.a.setX( a.getX() + vector.getX());
		this.a.setY( a.getY() + vector.getY());

		this.b.setX( b.getX() + vector.getX());
		this.b.setY( b.getY() + vector.getY());

		this.c.setX( c.getX() + vector.getX());
		this.c.setY( c.getY() + vector.getY());  
	}
	
	void output(double koef, Point vector) {
		System.out.printf(">>> Der Umfang des Dreieckes betraegt %.2f Laengeneinheit.%n" , this.getPerimeter() ); 
		System.out.printf(">>> Die Flaeche des Dreieckes betraegt %.2f Flaecheneinheit.%n" , this.getArea() ); 
		
		Triangle zs = this.zStreckung(koef);
		System.out.println(">>> Die zentrischen Streckung des Dreieckes mit Koordinaten: A" + a + " B" + b + " C" + c +
				" um den Koeffizient " +  koef + "\nergibt das Dreieck mit den koordinaten: A'" + zs.a + " B'" + zs.b + " C'" + zs.c );

		System.out.println(">>> Koordinaten vor der Verschiebung: A" + a + " B" + b + " C" + c + ", der Vector ist v" + vector);
		this.translation(vector);
		System.out.println("Koordinaten nach der Verschiebung: A" + a + " B" + b + " C" + c);
	}
	
}
