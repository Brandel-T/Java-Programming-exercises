
public class Main 
{
	public static void main(String[] args) 
	{
		List list = new List(
				new Node(2),
				new Node(22),
				new Node(21),
				new Node(12),
				new Node(52),
				new Node(4),
				new Node(7),
				new Node(5),
				new Node(11),
				new Node(77)
				);
		
		list.insert(new Node(-121), 10);
		list.print();
		System.out.println("position of '-1234': " + list.search(new Node(-1234)));
		list.insert(new Node(-121), 8);
		list.print();
		list.insert(new Node(0), 0);
		list.print();
		list.insert(new Node(-1), 1);
		list.print();
		
		int pos = list.search(new Node(4));
		System.out.println("position of '4': " + pos);
		list.remove(pos);
		list.print();
		
		System.out.println("position of '-1234': " + list.search(new Node(-1234)));
	}	
}