package Blatt8; 

public class Sparse {
	int[] vector;
//	private int size;
	
	public Sparse(int[] vector) { 
		this.vector = vector;
//		size = vector.length;
	}
	
//	public int getSize() {
//		return this.size;
//	}
	
	public double amount() {
		double a = 0;
		int i = 0;
		for (i=0; i<this.vector.length; i++) {
			a += this.vector[i]*this.vector[i]; 
		}
		
		return Math.sqrt(a);
	}
	
	public Sparse opposite() {
		int i = 0, opVector[] = new int[this.vector.length];
		for (i = 0; i < this.vector.length; i++) 
			opVector[i] = -this.vector[i];
		
		return new Sparse(opVector);
	}
	
	public void changeValue(int index, int newValue) {
		this.vector[index] = newValue;
	}

	public void printCompact() {
		int i = 0, index = 0, entry = 0;
		String output = "[";
		
		for (i = 0; i < this.vector.length; i++) {
			if (this.vector[i] != 0) {
				index = i+1;
				entry = this.vector[i];
				output += index + ":" + entry + ", "; 
			}
		} 
		StringBuilder sb = new StringBuilder(output);
		sb.deleteCharAt(output.length()-2);
		sb.replace(output.length()-2, output.length()-1, "]");
//		sb.insert(output.length()-2, "]");
		output = sb.toString();  
		
		System.out.println(output);
	}
	
	public void printAll() {
		int i = 0;
		System.out.print("(");
		for (i = 0; i < this.vector.length; i++) {
			if (i == this.vector.length-1)
				System.out.printf("%d) %n", this.vector[i]);
			else
				System.out.print(this.vector[i] + ",");
		}
	}
	
	public static Sparse add(Sparse a, Sparse b) {
		Sparse result = null;
		
		if (a.vector.length != b.vector.length)
			System.out.println("impossible addition with different dimension vectors");
		else {
			int i = 0;
			int resultVector[] = new int[a.vector.length];
			
			for (i = 0; i <a.vector.length; i++) {
				resultVector[i] = a.vector[i] + b.vector[i];
			}
			result = new Sparse(resultVector);	
		}			

		return result;
	}
	
	public static int dot(Sparse a, Sparse b) {
		int scalar = 0;
		
		if (a.vector.length != b.vector.length)
			System.out.println("impossible addition with different dimension vectors");
		else {
			int i = 0;
			for (i = 0; i < a.vector.length; i++) {
				scalar = scalar + a.vector[i]*b.vector[i];
			}
		}
		return scalar;
	}
	
	public static Sparse create(int n, int m, int a, int b) {
		Sparse sparse = null;
		
		if (m >= n)
			System.out.println("Impossible to create a sparse vector: nonzero entries greather than zero entries.");
		else {
			int i = 0, j = 0, vector[] = new int[n], index = 0, entry = a;
			for (i = 0; i < n; i++) {
				vector[i] = 0;
			}
			
			while (j < m) {
				index = (int)(Math.random()*n);
				entry = entry + (int)(Math.random()*b);
				vector[index] = entry;
				entry = a;
				j++;
			}
			
			sparse = new Sparse(vector);
		}
		
		return sparse;
	}	
}