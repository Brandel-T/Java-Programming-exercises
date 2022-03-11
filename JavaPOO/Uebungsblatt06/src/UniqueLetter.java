import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer; 

public class UniqueLetter
{	
	private HashMap<String, HashMap<Character, Integer>> cache = new HashMap<>();
    private int repeat=0;
	
	public void countLetter(String arg ) 
	{ 
		HashMap<Character, Integer> map = new HashMap<>();   
		if ( cache.containsKey(arg) )
		{
			System.out.println("\"" + arg + "\" : cache hits = " + ++repeat + ".");
			map = cache.get(arg) ;
		}
		else
		{ 
			//remove blanks and punctuation marks
			String trenner = " ,'.;:-_!?";
			StringTokenizer stoken = new StringTokenizer(arg, trenner);
			String newString = "";
			while (stoken.hasMoreTokens()) {
				newString += stoken.nextToken(); 
			}
			
			
			HashMap<Character, Integer> buffer = new HashMap<Character, Integer>();
			char[] ch = newString.toCharArray();
			for (char c : ch) //initialization of buffer
				buffer.put(c, 0);
			
			Set<Character> keys = buffer.keySet();
			int value = 0; /*** key's value ***/

			//counting
			Character tmpkey = ' ';
			for (Character key : keys) 
			{
				for (char c : ch) {
					if ( key.equals(c) ) {
						tmpkey = key;
						buffer.put(key, ++value); 
					} 
				}
				map.put(tmpkey, value);
				value = 0;
			} 	
			cache.put(arg, map);		
		}	
		
		System.out.println( map +"\n");
	}
	
	public static void main(String[] args)
	{ 
		UniqueLetter o = new UniqueLetter();
		o.countLetter(args[0]) ;
		o.countLetter(args[0]) ;  
	}	
}
