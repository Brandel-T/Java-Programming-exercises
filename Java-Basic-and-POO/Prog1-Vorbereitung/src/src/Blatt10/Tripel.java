package Blatt10;

public class Tripel {
	int x;
	int y; 
	int z;
	
	public Tripel(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString() {
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}
}
