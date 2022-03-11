package CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MesCollection {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> hMap = new HashMap<>();
		hMap.put("Jim Kwick", 9);
		hMap.put("R. Kiyo", 45);
		hMap.put("B. Gates", 23);
		hMap.put(null, 9);
		hMap.put("E. Musk", 91);
		hMap.put("L. Messi", 10);
		hMap.put("Le grand neuf", 99);
		
		System.out.println("null ? -- " + hMap.containsKey(null) );
		System.out.println("E. Musk -- " + hMap.containsKey("E. Musk") );
		System.out.println(" cr7 -- " + hMap.containsKey(" cr7 ") );

		int billGatesValue = hMap.remove("B. Gates"); 
		System.out.println("\nbillGatesValue : " + billGatesValue + "\nnullValue : " + hMap.remove("B. Gate"));
		
//-----il existe des classes séparées dans les JavaCollectionsframeworks----
		
		//1 .keySet
		Set<String> keys = hMap.keySet(); 
			System.out.println("keys : " + keys);
		
		//2. Values
		Collection<Integer> val = hMap.values();	
		System.out.println("val : " + val);
		
		//3. Entry
		Set<Map.Entry<String, Integer>> entries = hMap.entrySet();
		System.out.println("entries : " + entries);
		//entries : [null=9, Le grand neuf=99, E. Musk=91, R. Kiyo=45, L. Messi=10, Jim Kwick=9]
		for (Map.Entry<String, Integer> e : entries)
			System.out.println(e);
		
		
	}

}























