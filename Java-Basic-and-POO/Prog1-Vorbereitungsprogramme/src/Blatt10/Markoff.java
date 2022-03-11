package Blatt10;

public class Markoff {
	
	public static void findMarkoff(int n) {
		int x=0, y=0, z=0;
		String s = "";
		for (x = 1; x <= n; x++) 
			for (y = 1; y <= n; y++) 
				for (z = 1; z <= n; z++) 
					if ( (x*x + y*y + z*z) == 3*x*y*z ) {
						Tripel markoff = new Tripel(x,y,z); 
						s = s + markoff.toString() + ", ";
					} 
		
		System.out.print( s.substring(0, s.length()-2) );
	}

	public static void main(String[] args) {
		int limes = Integer.parseInt(args[0]); //limite
		findMarkoff(limes);
	}

}
