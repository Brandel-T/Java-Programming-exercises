package WS2006_2007;

public class CycleList {
	
	static Node start = null;
	
	public static void insert(Object data) {
		Node n = new Node(data, null);
		if (start == null) {
			start = n;
			start.link = start;
		} else {
			n.link = start.link;
			start.link = n;
		}
	}
	
	public static void print(Node start) {
		if (start == null)
			System.out.println("ERROR: Leere zyklische Liste");
		else
		{
			Node h = start;
			System.out.print(h.data + "--> "); //start
			while ( ! h.link.equals(start) ) {
				System.out.print(h.link.data + "--> ");
				h = h.link;
			}
			System.out.println( h.link.data ); //start
		}
	}  

	public static void main(String[] args) {  
		
		CycleList.start = null;
		print(start);
		insert(88);
		print(start); 
		for (int i=0; i<10; i++)
			insert(i);
		print(start);
		
//		String s = null;
//		System.out.println(s.length());
//		System.out.println(1/0);
//		Object o = 9;
//		System.out.println( (String)o );
	}

}
