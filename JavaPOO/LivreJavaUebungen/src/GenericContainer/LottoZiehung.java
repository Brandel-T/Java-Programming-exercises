package GenericContainer;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * *
 * @author tsagu
 * Ziehung von Lottozahlen
 * Aufgabe 11.14, Seite 426
 * *
 */
public class LottoZiehung 
{

	public static void main(String[] args) 
	{
		Set<Integer> numbers = new HashSet<Integer>();
		double time = 0.0;
		while(numbers.size() < 7)
		{
			numbers.add((int)(Math.random() * 49) + 1);
		}

		System.out.println("nach " + (System.currentTimeMillis() - time) + " Sekunden");
		System.out.println("lotto numbers are : " + numbers);
	}
}
