package Blatt8;

public class SparseMain {

	public static void main(String[] args) {
		int vector[] = {0,0,1,0,0,3,0,0,0,0,0,0,1,0,0,0,0,0,0,0};
		Sparse s = new Sparse(vector);
		
//		System.out.println(s.getSize());
		s.printAll();
		s.printCompact();
		System.out.println(s.amount());
		
		System.out.println("\nOpposite...");
		Sparse negativ = s.opposite();
		negativ.printAll();
		negativ.printCompact();
		
		System.out.println("\nvalue changed...");
		negativ.changeValue(0, 22);
		negativ.printAll();
		negativ.printCompact();
		
		System.out.println("\naddition...");
		Sparse addObject = Sparse.add(negativ, s);
		negativ.printAll();
		s.printAll();
		System.out.println("_________________________________________");
		addObject.printAll();
		addObject.printCompact();
		
		System.out.println("\nSkalarprodukt...");
		int sp = Sparse.dot(negativ, s);
		negativ.printAll() ;
		s.printAll();
		System.out.println("skalarprodukt = " + sp);
		
		System.out.println("\ncreate a new sparse vector...");
		Sparse sparse = Sparse.create(8, 3, 1, 20);
		sparse.printAll();
		sparse.printCompact();
	}
}
