package GenericContainer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestKontakt {

	public static void main(String[] args) 
	{
		
		List<Kontakt> list = new ArrayList<>();
			list.add(new Kontakt("Leo", "AMessi", 1234566));
			list.add(new Kontakt("Cr", "Ronaldo", 34634));
			list.add(new Kontakt("Samuel", "Etoo", 57658));
			list.add(new Kontakt("junior", "Neymar", 9087));
			list.add(new Kontakt("Eden", "BHazard", 123436));
		
		Object[] contacts =  list.toArray();	 
		Arrays.sort(contacts);
		for(Object contact : contacts)
		{
			System.out.println(contact.toString());
		}
		
		System.out.println(list.get(4).compareTo(list.get(0)));
	}

}
