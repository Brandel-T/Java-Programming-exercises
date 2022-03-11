import java.util.Scanner;

public class Markoff {

	public static void main(String[] args) {
		Markoff m = new Markoff();
		int n = Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
		while ( n < 1 ) {
			System.out.println("Please enter a number that is greater than or equal to 1: ");
			n = sc.nextInt();
		}
		m.findMarkoff(n);
		sc.close();
	}

	void findMarkoff(int n) {
		String result = "";
		for ( int x=1; x<=n; x++ )
			for ( int y=1; y<=n; y++ )
				for ( int z=1; z<=n; z++ ) 
//					if (x <= y && y <= z)  //pour les nombres de markoff dit "normalisés"
						if ( x*x + y*y + z*z == 3*x*y*z ) {
							Tripel markoff = new Tripel(x, y, z);
							result += markoff.toString() + ", ";
						} 		 
					
		System.out.println( result.substring(0, result.length()-2) );
	}

}
