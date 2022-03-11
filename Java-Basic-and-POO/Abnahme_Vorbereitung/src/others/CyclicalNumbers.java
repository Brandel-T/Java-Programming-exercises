package others;

public class CyclicalNumbers {

	public static void main(String[] args) { 
		//System.out.println(getLenght(1245566345));
		System.out.println( checkDigits(142857) );
	}

	//Laenge einer Zahle berechnen
	public static long getLenght(long number) 
	{ 
		if ( number < 0)
			return -1;
		else {
			long n = 1;
			long top = 1;
			while (number > 10*top) {
				n++;
				top = 10*top;
			}
			
			return n;
		}
	} 
	
	//Ziffer vergleichern
	public static boolean checkDigits(long number) 
	{		
		long i = 1;
		long product = number; //n*number
		long n = getLenght(number);
		long iNumber;
		boolean ok = false;
		long iRest;
		long pRest = 0;
		long pn;
		
		//beginnen wir direkt mit i=2, weil wir fuer i=1 sowieso dieselbe Ziffern haben 
		for ( i=2; i<=n; i++ ) 
		{
			
			iNumber = number; //number fuer jede i
			product = i*number;     //Produkt fuer jede i
			
			if ( getLenght(iNumber) == getLenght(product) ) 
			{
				
				while ( n > 0 ) //hier hole ich einzelne Ziffern von iNumber
				{
					iRest = iNumber % 10;
//					System.out.println("-------\n" + iNumber + ", " + iRest );
					
					pn = getLenght(product); //Laenge des produkts
					//long pRest ; //rest vom produkt
					while ( pn > 0 ) //hier hole ich einzelne Ziffern vom aktuellen produkt und vergleiche mit iRest
					{
//						System.out.println(iRest);
//						System.out.println(product);
//						System.out.println("----------------------");
						pRest = product % 10;
						System.out.println("-------\n" + product + ", " + pRest );
						if ( iRest ==  pRest ) {
							System.out.println(iRest + " : " + pRest);
							ok = !ok  ;  
						}

						product = product / 10;
						pn--;
					}

					System.out.println("ici, ok = "+ ok);
					if (ok == false){
						System.out.println("ici, "+ iRest+", "+pRest+" ok = "+ ok);
						
						return false;			
					} 
					ok = false;
					
					iNumber = iNumber / 10; //ich eleminiere den Rest und habe dann eine Ziffer weniger
					
					n--;
				}
			}
			else {
				System.out.println("ici");
				return false;			
			}
		}
		
		return true;
	}
	
}
