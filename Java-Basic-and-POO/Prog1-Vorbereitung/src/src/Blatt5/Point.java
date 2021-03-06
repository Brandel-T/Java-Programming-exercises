package Blatt5;

public class Point {
	private double x ;
	private double y;
	
	Point(double a, double b) {
		x = a; 
		y = b;
	}
	
	Point(double a) {
		this(a, 0.0);
	}
	
	Point() {
		this(0.0);
	}
	
	//to calculate the distance between 2 points (Pythagor)
	double distance(Point pt) {
		return Math.sqrt( (this.x - pt.x)*(this.x -pt.x) + (this.y - pt.y)*(this.y - pt.y) );
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	void setX(double x) {
		this.x = x;
	}
	
	void setY(double y) {
		this.y = y;
	}
	 
	public String toString() {
		return "("+ getX() + ", " + getY() + ")"; 
	} 
}
