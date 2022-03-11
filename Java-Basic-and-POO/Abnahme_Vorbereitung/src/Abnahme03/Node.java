package Abnahme03;

public class Node {
	
	Node (Object d, Node n) {
		data = d;
		link = n;
	}
	
	Object data;
	Node link;
	
	@Override
	public String toString() { 
		return "[" + data + ", " + link +"]" ;
	}
	
}
