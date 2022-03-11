
public class Main {
	
	public static void main(String[] args) {
		System.out.println( sphenisch(90) );
		
		char [][] array = {
				{'a', 'b', 'd', 'd', 'd', 'a', '1'},
				{'a', 'a', 'w', 'o', 'r', 't', '2'},
				{'a', 'a', 'a', 'h', 'a', 'a', '3'},
				{'h', 'a', 'a', 'a', 'f', 'a', '4'},
				{'a', 'a', 'r', 'u', 'a', 'a', '5'},
				{'a', 'j', 'a', 's', 'q', 'a', '6'},
				{'g', 'i', 'r', 'a', 'f', 'f', 'e'},
				};
		String[] s = {"Wort", "giraffe"};
		sucheWort(array, s);
		
	}
	
	/*
	 * Sphenische Zahlen bestimmen:
	 *  Zahlen, die genau das Produkt von
	 *  3 verschiedenen Primzahlen sind.
	 */
	static boolean sphenisch(int n) {
		int sphen = 1; 
		int count = 0;
		int q = n;
		String check = "";
		for (int nn=2; nn<=q; nn++ ) { //Suche nach allen Zahlen < n, die prim sind
			
			boolean isPrim=true;
			
			for (int i=2; isPrim && i<=nn/2; i++) {
				if (nn%i==0)
					isPrim = false;
			}

			
			if (isPrim && q % nn==0) {  
				if ( !check.contains( nn+"" ) ) { //neue unterschiedliche Primzahl gefunden	
					count++;
					check = check +" "+nn; 
				}  
				q=q/nn;
				while (q%nn==0) { 
					q/=nn;
					sphen *= nn;	 
				} 
				if (count <= 3) { 
					sphen *= nn;
				}   			
			} 
		}
		System.out.println(sphen);	 
		return sphen == n ? true : false;
	}
	
	/*
	 * Woerter aus einem char-Array ermitteln(le chercheur de mots)
	 * 
	 */
	static void sucheWort(char[][] charArray, String[] gesuchteWoerter) {
		int i=0, j=0;
		for ( i=0; i<charArray.length; i++) {
			String ctnH="";
			for ( j=0; j<charArray[i].length; j++) {
				//horizontal
				ctnH += charArray[i][j];
			}

			//vertical
			String ctnV="";
			for (int w=0; w<charArray.length; w++) {
				ctnV += charArray[w][j] ;
				
			}
			
			for (int w=0; w<gesuchteWoerter.length; w++) {
				if ( ctnH.contains( gesuchteWoerter[w]) || ctnV.contains( gesuchteWoerter[w] ) )
					System.out.println(gesuchteWoerter[w]);
			}
		}
		
	}

}



















