package Blatt8;

public class Number {
	private int z;

	public Number(int z) {
		this.z = z;
	}
	
	public boolean isPrime( ) {
		for (int i=2; i<=z; i++) {
			if (z%i == 0)
				return false;
			}
			return true;
		}
	
	public static void main(String[] args) {
		Number z = new Number(47); 
		if (z.isPrime( ))
			System.out.println(z.z + " ist Primzahl!");
	}
}
