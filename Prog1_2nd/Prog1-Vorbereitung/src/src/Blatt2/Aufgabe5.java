package Blatt2;

public class Aufgabe5 {

	public static void main(String[] args) { 
		int a = 0, b = 0, c = 0;
		double d = 0, e = 0, f = 0;
		boolean g = false, h = false, i = false;
		
		//1
		if ( (g||h) && (!g||h) ) {
			c = (int)3.141;
		}
		//2
		while ( a>b && a>c && d*e/f == 0.0 ) {
			g = h || i;
		}
		//3
		if ( (d!=0 && e!=0 && f!=0) || ((g && !h) || !i)) {}
		//4
		if (h || (h==false && i== false)) {
			g = false;
		} else {
			g = true;
		}
		//5 
		while (d>a && b!=0 && e!=0) {
			c = (int)(f/b + f/c);
		}
	}
}
