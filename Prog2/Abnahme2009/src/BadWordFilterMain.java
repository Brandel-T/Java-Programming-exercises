 
import java.io.File; 


public class BadWordFilterMain
{
	public static void main(String[] args) 
	{ 
		String input = "Und diese Biene, die ich meine, nennt sich Maja,";
		String [] badWords = {"Biene", "Maja"};
		BadWordFilter bw = new BadWordFilter();

		File file = new File("maja.txt"); 
		
		//1. first Method
		String gefiltert = bw.filter(input, badWords);
		System.out.println( gefiltert );

		//2. second Method 
		bw.filter(file, badWords);		 
	}
}
