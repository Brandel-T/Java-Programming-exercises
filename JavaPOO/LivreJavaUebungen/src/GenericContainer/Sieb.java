package GenericContainer;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author tsagu
 * Aufgabe 11.15, seite 426
 * Primzahlen zwischen 2 und n: Sieb des Eratosthenes
 */
public class Sieb //le tamis/passoire
{

	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		Set<Integer> t = new TreeSet<>();
		int i=2;
		while(i <= n) {
			t.add(i);
		}
		
		Set<Integer> s = new TreeSet<>();
		int p = 2;
		
		int j=2;
		while(p*p <= n){

			while( j <= n) {
				s.add(j*p);
				j++;
			}
			
			if (p == 2) 
				p = 3;
			else 
				while(s.contains(p)){
					p = p + 2;
				}
		}
		
		//s.retainAll(t);
		t.removeAll(s);
		System.out.println("Elemente der Menge T sind : " + t);
		
		Iterator<Integer> iter = t.iterator();
		while(iter.hasNext()) { 
			System.out.println(iter.next());
		}
	}
}



















