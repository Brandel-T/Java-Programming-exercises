import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class keyComparator implements Comparator<Map.Entry<Character, String>> {

	@Override
	public int compare(Map.Entry<Character, String> o1, Map.Entry<Character, String> o2) { 
		int sign = o1.getKey().compareTo(o2.getKey());
		if ( Character.isLowerCase(o1.getKey()) && Character.isUpperCase(o2.getKey()) ) {
			return -1;
		} else if ( Character.isLowerCase(o2.getKey()) && Character.isUpperCase(o1.getKey()) ) {
			return 1;
		}
		return sign;
	} 		

}
