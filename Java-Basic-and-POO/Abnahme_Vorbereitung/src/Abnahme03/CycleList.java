package Abnahme03;

public class CycleList {

	// fuege hier Methode insert ein
	static void insert(Object data) {		
		if (start == null) {
			start = new Node(data, null);
			start.link = start;	//on doit faire ceci apres avoir initialiser start a travers new Node(data, null)
								//car avant ca start = null, donc n'est mm pas un objet.
								//la 1ere etape consiste donc a definir start comme object avant de pouvoir lui affecter
								//des valeurs, comme avec start.link (dans le cas contraire on aura << NullPointerException >>)
		}
		else 
			start.link = new Node(data, start.link);	 
	}
	
	// fuege hier Methode print ein
	static void print(Node start) {
		System.out.print( "[" + start.data + "] --> " );
		Node current = start.link;
		while ( ! current.data.equals(start.data) ) {
			System.out.print( "[" + current.data + "] --> ");
			current = current.link;
		}
		System.out.println();
	}
	
	static Node start = null;
	public static void main (String [] args) { 
		for (int i=0;i<10;i++)
			insert(i); 
		print(start); 
	}
}
