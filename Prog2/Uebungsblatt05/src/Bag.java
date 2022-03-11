
public class Bag<T>
{
	private int capacity;
	private int count;
	private T[] container;
	
	public Bag() {
		count = 0;
		container = new T[count];
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public T[] getContainer() {
		return container;
	}
	
	public void setContainer(T[] container) {
		this.container = container;
	}
	
	public void add(T data) {
		
		
		count++;
	}
	
}
