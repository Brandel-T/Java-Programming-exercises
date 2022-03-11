import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String s = String.valueOf(3.75);
		System.out.println(s);
		s += "T";
		System.out.println(s);
		s = s.replace(".", "-");
		System.out.println(s);
		
		char[] chars = s.toCharArray();
		System.out.println( Arrays.toString(chars) );
		
		String st = String.join("_", s);
		System.out.println(st);
		
		StringBuilder sb = new StringBuilder(s);
		sb.replace(1, 2, "-wesh-");
		System.out.println( sb.toString() );

	}

}
