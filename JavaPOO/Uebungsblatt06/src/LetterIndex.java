import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map; 
import java.util.StringTokenizer;
import java.util.TreeSet;

public class LetterIndex
{

	public static HashMap<Character, String> letterIndex( String... arg )
	{
		
		String stringParameter = "";
		for (String string : arg) {
			stringParameter += string;
		}
		
		//remove blank and punctuation
		String trenner = " ,.:;-_!$%&/()=?'#+\\\"*~[]{}`´§°^<>|";
		StringTokenizer stoken = new StringTokenizer(stringParameter, trenner);
		String newString = "";
		while (stoken.hasMoreTokens()) {
			newString += stoken.nextToken(); 
		}
		
		//map, which will content our final result
		HashMap<Character, String> resultMap = new HashMap<>(); 
		
		//to store each character just once
		TreeSet<Character> bufferOfLetter = new TreeSet<Character>();
		//initialization of buffers
		for (int i=0; i<newString.length(); i++) {
			if ( Character.isLetter(newString.charAt(i)) ) 
			{
				bufferOfLetter.add(newString.charAt(i));
				resultMap.put(newString.charAt(i), null);
			}
		}

		ArrayList<Integer> positions = new ArrayList<Integer>();
		Character tmpKey = ' '; //temporary key
		for (Character ch : bufferOfLetter) {
			for (int i=0; i<newString.length(); i++) {
				if ( ch.equals(newString.charAt(i)) ) {
//					tmpKey = ch; 
					tmpKey = newString.charAt(i);
					positions.add(i);   
				} 
			} 
			
			resultMap.put(tmpKey, Arrays.toString(positions.toArray())); 
			positions.clear(); 
		}

		List<Map.Entry<Character, String>> list = new LinkedList<>( resultMap.entrySet() );
		Collections.sort(list, new Comparator<Map.Entry<Character, String>>() {
			
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
		});
		
		//Once the sorting is complete, we create a map in which we insert the sorted entries,
		// then return it
		HashMap<Character, String> sortedHashMap = new LinkedHashMap<Character, String>();
	       for (Iterator<Map.Entry<Character, String>> it = list.iterator(); it.hasNext(); ) 
	       {
	           Map.Entry<Character, String> entry =  it.next();
	           sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       
	       
	       return sortedHashMap; 
	}	
	
	

	public static void main(String[] args) { 
		
		try {
			System.out.println( letterIndex(args) ); 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
	}
}