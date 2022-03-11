import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ShoppingList
{
	int counter = 0;
	ArrayList<String> articlesList = new ArrayList<String>();
	Iterator<String> iter = articlesList.iterator(); 
	
	public int count() {
		return counter;
	}

	public void put (String article)
	{
		articlesList.add(article);
		counter++;
	}
	
	public String show (String article) throws IndexOutOfBoundsException
	{
		int position = 0 ;
		if ( !articlesList.contains(article))
			throw new IndexOutOfBoundsException(article + " ist not in the list.");
		else			
			for (String s : articlesList)
			{
				if ( s.equals(article))
					return article + " : position " + position;
				position ++;
			}

		return article + " : position " + position;
	}
	
	public void print() 
	{
		for (String s : articlesList)
			System.out.println("* " + s);
	}
	
	public void sort()
	{
		Collections.sort(articlesList);
	}
	
	
}
