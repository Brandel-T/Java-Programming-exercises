import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Arrays;

public class CharCount 
{	
	static void countLetter(String link) throws MalformedURLException
	{
		try {

			URL url = new URL(link);
			URLConnection connect = url.openConnection();
			
			InputStream is = connect.getInputStream(); 
			int b = is.read();
			String buffer ="";
			while(b != -1) {
				buffer += (char)b;
				b = is.read();
			}
			
			is.close();
			char[] ch = buffer.toCharArray();
			Arrays.sort(ch);
			
			char tmp=ch[ch.length-1];
			int count=0;
			for(int i=ch.length-1; i>=0; i--) {
				
				if(tmp == ch[i]) {
					count++;
				}else {
					System.out.printf("The letter %s appears %d times.%n", tmp, count);
					tmp = ch[i];
					count =1;
				}	
			}
			System.out.printf("The letter %s appears %d times.%n", tmp, count);	
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	//https://seafile.rlp.net/f/abed7a879dd94598ac07/?dl=1
	public static void main(String[] args) {
		String param = args[0];
		if(args.length == 0)
			throw new NullPointerException("link doesn't exist");
		
		try {
			countLetter(param);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
