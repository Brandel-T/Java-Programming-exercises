package Blatt4;

public class Fact {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		int i = 1, f = 1;
		for (i = 1; i <= n; i++) {
			f *= i;
		}
		
		System.out.println(f);

	}

}
