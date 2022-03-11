
public class Noten {

	public static void main(String[] args) {
		
		double maxScore = Double.parseDouble(args[0]); //maximale erreichbare Gesamtpunktzahl
		
		System.out.printf("1.0: %5.1f - %5.1f (100,0 - 95%%)%n", maxScore, maxScore*0.95);
		System.out.printf("1.3: %5.1f - %5.1f ( 94.9 - 90%%)%n", maxScore*0.95-0.1, maxScore*0.90);
		System.out.printf("1.7: %5.1f - %5.1f ( 89,9 - 85%%)%n", maxScore*0.90-0.1, maxScore*0.85);
		System.out.printf("2.0: %5.1f - %5.1f ( 84,9 - 80%%)%n", maxScore*0.85-0.1, maxScore*0.80);
		System.out.printf("2.3: %5.1f - %5.1f ( 79,9 - 75%%)%n", maxScore*0.80-0.1, maxScore*0.75);
		System.out.printf("2.7: %5.1f - %5.1f ( 74,9 - 70%%)%n", maxScore*0.75-0.1, maxScore*0.70);
		System.out.printf("3.0: %5.1f - %5.1f ( 69,9 - 65%%)%n", maxScore*0.70-0.1, maxScore*0.65);
		System.out.printf("3.3: %5.1f - %5.1f ( 64,9 - 60%%)%n", maxScore*0.65-0.1, maxScore*0.60);
		System.out.printf("3.7: %5.1f - %5.1f ( 59,9 - 55%%)%n", maxScore*0.60-0.1, maxScore*0.55);
		System.out.printf("4.0: %5.1f - %5.1f ( 54,9 - 50%%)%n", maxScore*0.55-0.1, maxScore*0.50);
		System.out.printf("5.0: weniger als %.1f Punkte", maxScore*0.50);
		
//		int a, b, c;
//		double d, e, f;
//		boolean g, h, i;
//		if( (g || h) && (!g || !h) )
//			c = (int)3.141;
//		while ( a > b && a > c && d*e/f == 0.0 )
//			g = h || i;
//		//(d != 0.0 &&  e != 0.0 && f != 0.0) || (g && !h || !i)
//		g = ( h || (!h && !i) ) ? true : false;
//		while ( d > a && b == 0 && e == 0.0 ) 
//			c = (int)(f/b + f/c);
	}
}
