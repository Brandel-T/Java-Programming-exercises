package Abnahme02;

public class Lynchrel {

//	public static void main(String[] args) { 
//		System.out.println(invert(1236));
//		for (int i=1; i<=1000; i++)
//		{
//			if (! getPalindrome(i))
//				getPalindrome(i);
//		}
//		System.out.println(getPalindrome(17));
//	}
//	
//	//ausgehend von "n" erzeugen wir ein Palindrom
//	public static boolean getPalindrome(int n) {
//		int p = n;
//		for (int i=0 ; i< 1000000000 && n > 0 && ! isPalindrome(n) ; i++) {
//			p = p + invert(n);			
//		}
//
//		return p>0 && isPalindrome(p);
//	}
//	
//	public static boolean isPalindrome(int n) {
//		return invert(n) == n;
//	}
//	
//	public static int invert(int n) {
//		StringBuilder sb = new StringBuilder(""+n);
//		return Integer.parseInt( sb.reverse().toString() );
////		int result = n%10;
////		int q = n/10;
////		while (q != 0) {
////			result = result*10 + q%10;
////			q = q/10;
////		}
////		
////		return result;
//	}
	  /**
     * Berechnet alle "Lychrel-Zahl"-Kandidaten bis zu einer gegebenen Schranke l.
     * Eine "Lychrel-Zahl" ist eine natürliche Zahl n,
     * für die Folge n := n + P(n) <b>nie</b> ein Palindrom ergibt,
     * wobei P(n) aus n durch Umkehrung der Reihenfolge der Dezimalziffern entsteht.
     * Ein "Lychrel-Zahl"-Kandidat ist eine natürliche Zahl n,
     * für die Folge n := n + P(n) <b>bis zum Überlauf kein</b> Palindrom ergibt.
     *
     * @param args obere Schranle l
     */
    public static void main(final String[] args) {
//        final int l = Integer.parseInt(args[0]);
    	int l = 1000;
        int n = 1;
        while(n <= l) {
            long w = n;
            long p = 0;
            boolean overflow = false;

            while(w != p  &&  !overflow) {
                w = w + p;
                overflow = w < 0;
                p = 0;
                long x = w;
                while(x > 0) {
                    final long d = x%10;
                    x /= 10;
                    p = 10*p;
                    p = p + d;
                }
            }
            if(w != p)
                System.out.println(n);
            n++;
        }
    }

}



