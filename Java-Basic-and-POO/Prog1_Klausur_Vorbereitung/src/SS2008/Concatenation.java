package SS2008;

public abstract class Concatenation implements Function { 
	static double concat(Function g, Function f, double x) { 
		return g.value( f.value(x) );
	} 
	
	public static void main(String[] args) {
		Function g = new Polynom(1, 1, 1, 1);
		Function f = new Polynom(1, 1, 1, 0);
		System.out.println( g.value(1) );
		System.out.println( f.value(-1) );
		System.out.println( concat(g, f, -1) );
		System.out.println( concat(g, f, 1) );
	}

}
