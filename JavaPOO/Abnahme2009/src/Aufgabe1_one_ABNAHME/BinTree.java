package Aufgabe1_one_ABNAHME; 

public class BinTree
{
	protected Node root = null; 
	
	protected class Node 
	{
		Element value;
		Node left, right;
		
		Node(Element value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}

		public String toString() {
			return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
		}		 
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void inorder( Node n ) {
		if (n == null) {
			return;
		} else {
			inorder(n.left);
			System.out.println( n.toString() );
			inorder(n.right);
		}		
	}
	
	public boolean insert(Element e) { 
		if (e == null)
			return false;
		else {
			root = insert(e , this.root);
			return root != null;
		}		
	}
	
	public Node insert(Element e, Node tmpRoot)
	{
		if (tmpRoot == null) {
			return ( tmpRoot = new Node(e, null, null) ); 
		}		
//		else if (tmpRoot != null && tmpRoot.value.compareTo(e) == 0)
//			return null;
		else if (tmpRoot.value.compareTo(e) < 0)
			tmpRoot.right = insert(e, tmpRoot.right);
		else if (tmpRoot.value.compareTo(e) > 0)
			tmpRoot.left = insert(e, tmpRoot.left);
		
		return tmpRoot;
	}

	public static void main(String[] args) {
		
		BinTree bt = new BinTree(); 
		System.out.println( bt.isEmpty() );
		System.out.println( bt.insert( null ) ); 
		
		System.out.println( bt.insert(new Element(4)) ); 
		System.out.println( bt.insert(new Element(2)) ); 
		System.out.println( bt.insert(new Element(6)) );   
		System.out.println( bt.insert(new Element(9)) ); 
		System.out.println( bt.insert(new Element(8)) );  
		System.out.println( bt.insert(new Element(9)) ); 
		System.out.println( bt.insert(new Element(7)) ); 
		System.out.println( bt.insert(new Element(5)) ); 
		System.out.println( bt.insert(new Element(3)) ); 
		System.out.println( bt.insert(new Element(1)) );  
		System.out.println("empty ? : " + bt.isEmpty() );
		
		
		System.out.println( "bt.root.toString()  ROOT :  " +  bt.root );
		System.out.println("\n--- inorder ---\n");
		bt.inorder(bt.root);
		
	}

}
