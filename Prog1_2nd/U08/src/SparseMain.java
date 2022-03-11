
public class SparseMain {

	public static void main(String[] args) {
		Sparse sp = new Sparse("(0,0,1,0,0,3,0,0,0,0,0,0,1,0,0,0,0,0,0,0)" );
		System.out.println("sp.dimension = " + sp.dimension);
		
		System.out.println( sp.amount() );
		sp.printAll();
		sp.printCompact();  
		System.out.println("\n----------------------------"); 
		
		Sparse op = sp.opposite();
		System.out.println( op.amount() );
		op.printAll();
		op.printCompact();
		System.out.println("\n----------------------------"); 
		
		sp.changeValue(3, 5);
		sp.printAll();
		sp.printCompact();
		sp.changeValue(13, 99);
		sp.printAll();
		sp.printCompact();
		sp.changeValue(10, 7);
		System.out.println("\n----------------------------"); 
		
		Sparse sps = sp.opposite();
		System.out.println( sps.amount() );
		sps.printAll();
		sps.printCompact(); 
		
		System.out.println("\n-------------ADD---------------"); 
		Sparse a = new Sparse("(1,0,1,0,0,4,0,0,0,0,0,0,1,0,4,0,0,0,9,0)" );
		System.out.println("a.dimension = " + a.dimension);
		Sparse b = new Sparse("(0,0,1,0,0,3,0,0,7,0,0,0,1,0,5,0,0,0,9,0)"); 
		System.out.println("b.dimension = " + b.dimension);
		Sparse plus = Sparse.add(a, b);
		plus.printAll();
		plus.printCompact();
		plus.opposite();
		System.out.println( plus.amount() );

		System.out.println("\n--------------DOT--------------"); 
		Sparse dot = Sparse.dot(a, b);
		dot.printAll();
		dot.printCompact();
		System.out.println( dot.amount() ); 

		System.out.println("\n--------------CREATE--------------"); 
		Sparse child = Sparse.create(7, 4, 2, 6);
		child.printAll();
		child.printCompact(); 
		System.out.println( child.amount() );
		
		System.out.println("\n------------------------------------");
		Sparse childOP = child.opposite();
		childOP.printAll();
		childOP.printCompact();
		childOP.opposite();
		System.out.println( childOP.amount() );
		System.out.println("\n------------------------------------");
		Sparse s2 = Sparse.create(7, 4, 1, 9);
		System.out.println("s2.dimension = " + s2.dimension);
		s2.printAll();
		s2.printCompact(); 
		System.out.println( s2.amount() );
		System.out.println("\n------------------------------------");
		Sparse dot2 = Sparse.dot(s2, childOP);
		dot2.printAll();
		dot2.printCompact(); 
		System.out.println( dot2.amount() );
		
		
		
	}

}
