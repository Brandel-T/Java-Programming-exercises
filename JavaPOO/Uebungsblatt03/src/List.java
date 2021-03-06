
public class List 
{
	
	/**
	 * une methode statique n'utilise que DES ATTIBUTS STATIQUES
	 * 
	 */
	
	Node head ;
	Node tail;
	int count; //length of the list
	
	public List() { //create a empty List
		head = null;
		tail = null;
		count = 0;
	}


	public List(Node ... nodes)
	{
		count = nodes.length;
		
		nodes[0].next = nodes[1];
		nodes[0].previous = null;
		head = nodes[0];
		
		nodes[count-1].next = null;
		nodes[count-1].previous = nodes[count-2];
		tail = nodes[count-1];
		
		int i=0;
		for (i=1 ; i<count-1; i++)
		{
			nodes[i].next = nodes[i+1];
			nodes[i].previous = nodes[i-1]; 
		}
	}
	

	public void print()
	{
		Node current = head;
		int i=0;
		while(i <= count-1 && current != null)
		{
			System.out.print(current.value +" ");
			current = current.next;
			i++;
		}
		
		System.out.println();
	}
	
	
	public void insert(Node x, int p) throws NullPointerException
	{	
		//insert at the first position
		if(p < 0 || p > count){
			throw new NullPointerException("you are outside of the list");
		}
		
		if(p == count) {
			tail.next = x;
			x.next = null;
			x.previous =tail;
			tail = x;
		}
		
		if(count == 0) {
			if(p == 0 ) 
				head = x;
				tail = x;
				x.next = null;
				x.previous = null;
		}else 
			if(p == 0 ) { 
				x.next = head.next;
				x.previous = null;
				head = x;
		}
		else 
			if(p==1)
			{
				x.next = head.next;
				x.previous = head;
				head.next.previous = x;
				head.next = x;
				
			}else{
				Node current = head; //to traverse the list
				Node prev = null; //the previous of current node
				int i =0;
				
				while( i < p-1 && current.next != null )
				{
					prev = current;
					current = current.next;
					i++;
				}
				x.next = current.next;
				x.previous = prev; //or "current" directly
				current.next.previous = x;
				current.next = x;
			}
		count++;
	}

	
	public void remove(int p) throws NullPointerException
	{
		if(p<0 || p>count || (head == null && tail == null)) {
			throw new NullPointerException("node don't exist");
		}
		if(p == 0) {
			head = head.next;
			head.previous = null;
		}
		else
			if(p==1){
				head.next = head.next.next;
				head.next.next.previous = head;
			}
			else
			{
				Node current = head; //to traverse the list
				int i =0;
				
				while( (i < p-1) && (current.next != null) )
				{
					current = current.next ;
					i++;
				}

				current.next = current.next.next;
				current.next.next.previous = current;
			}
		
		count--; //reduce the length of the list 
	}
	
	int search(Node x)
	{
		Node current = head;
		int pos=0; 
		int i=0; 
		while(i<count && current.value != x.value) 
		{
			current = current.next;
			pos++;
			i++;
		}
		if(i>=count) //element not in the list
			return -1;

		return pos;
		
	}
}
