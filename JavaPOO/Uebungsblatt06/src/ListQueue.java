import java.util.LinkedList; 
import java.util.NoSuchElementException;

public class ListQueue<T> implements Queue<T>
{
	LinkedList<T> queue = new LinkedList<T>();

	@Override
	public void enter(T o) { 
		queue.addLast(o);
	}

	@Override
	public T leave() { 
		if (queue.isEmpty())
			throw new NoSuchElementException("the list is empty, we can not return the first object");
		return queue.removeFirst();
	}

	@Override
	public T front() { 
		if (queue.isEmpty())
			throw new NoSuchElementException("the list is empty, we can not show the upper object");
		return queue.getFirst();
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
}
