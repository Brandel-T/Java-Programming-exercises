package WS2007_2008;

public class Dominostein {

	Dominostein[] nexts ;
	
	public Dominostein() {
		nexts = new Dominostein[1];
		nexts[0] = null; //kein Nachfolger
	}
	
	public Dominostein(Dominostein ... links) {
		nexts = new Dominostein[links.length];
		for (int i=0; i<links.length; i++)
			nexts[i] = links[i];
	}
	
	void stosseUm() {
		if (this.nexts[0] == null)
			System.out.print("down. ");
		else {
			System.out.print("down -> |");
			for (int i=0; i<this.nexts.length; i++)  
				this.nexts[i].stosseUm(); 
		}
	} 
	
	public static void main(String[] args) { 

		Dominostein d2 = new Dominostein();
		Dominostein d3 = new Dominostein();
		Dominostein d4 = new Dominostein();
		Dominostein d5 = new Dominostein(new Dominostein[] {d4});
		System.out.print("d5: ");
		d5.stosseUm();
		System.out.println("\n");
//		Dominostein d6 = new Dominostein(new Dominostein[] {d2, d3});
		Dominostein d6 = new Dominostein(d2, d3);
		System.out.print("d6: ");
		d6.stosseUm();
		System.out.println("\n");
		Dominostein d7 = new Dominostein();
		System.out.print("d7: ");
		d7.stosseUm();
		System.out.println("\n");
		Dominostein d8 = new Dominostein();
		System.out.print("d8: ");
		d8.stosseUm();
		System.out.println("\n");
		System.out.print("d1: ");
		Dominostein d1 = new Dominostein( d5, d6, d7, d8 );
		d1.stosseUm(); 
	}
	
	

}
