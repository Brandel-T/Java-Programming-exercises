
public class Point {

	double x;
	double y;
	
	Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	Point (double x) {
		this(x, 0.0);
	}
	
	Point() {
		this(0.0);
	}

	double getX() {
		return x;
	}

	void setX(double x) {
		this.x = x;
	}

	double getY() {
		return y;
	}

	void setY(double y) {
		this.y = y;
	}
	
	//Abstand zwischen 2 Punkten ermitteln
	double distance(Point m) { 
		return Math.sqrt( 
				(m.getX() - getX())*(m.getX() - getX()) + (m.getY() - getY())*(m.getY() - getY()) );
	}
	
	void printPoint() {
		System.out.printf("(%.1f ; %.1f) ", getX(), getY());
	}
	
}
