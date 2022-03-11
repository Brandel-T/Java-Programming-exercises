
public interface Queue<T> 
{
	public void enter( T o );
	public T leave();
	public T front();
	public boolean isEmpty();

}
