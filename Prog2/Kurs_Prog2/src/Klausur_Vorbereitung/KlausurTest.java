package Klausur_Vorbereitung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KlausurTest {

	public static void main(String[] args) { 

//		ArrayList nathalie = new ArrayList();
//		nathalie.add("Bonjour");
//		nathalie.add(9);
//		
//		for(int i=0; i<nathalie.size(); i++) {
//			System.out.println(nathalie.get(i));
//		}
		
		ArrayList<A> arr = new ArrayList<A>();
		
		
		arr.add(new A(2));
		arr.add(new A(11));
		arr.add(new B(0));
//		arr.add(new C());
		
		Integer[] tab = {1, 3, 5, 7};
		List<Integer> list = Arrays.asList(tab);
		
		list.add(23);
		System.out.println(list);
	}

}
