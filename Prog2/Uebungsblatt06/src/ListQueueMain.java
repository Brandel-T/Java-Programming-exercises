import java.util.NoSuchElementException;

public class ListQueueMain {

	public static void main(String[] args) 
	{
		ListQueue<String> queue = new ListQueue<String>();
		queue.enter("Samuel");
		queue.enter("Etoo");
		queue.enter("Fils");

		try { 
			System.out.println(queue.front()); 
			System.out.println(queue.leave()); 
//			System.out.println(queue.front());
		} 
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(queue.isEmpty()); 
	}

}
