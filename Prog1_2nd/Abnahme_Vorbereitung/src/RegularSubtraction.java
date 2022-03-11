
public class RegularSubtraction {

	public static void main(String[] args) { 

		printRegularSubtractions() ;
	}
	
	public static void printRegularSubtractions()
	{
		int count = 1;
		
		for (int a = 111; a <= 999; a++)
		{
			for (int b = 111; b <= 999; b++)
			{
				for (int c = 111; c <= 999; c++)
				{
					if ( a - b == c )
					{ 
						int einheitA = 0; //chiffre des unités de a
						int zehnerA = 0; //chiffre des dizaines de a 
						int hunderterA = 0; //chiffre des centaines de a

						int quotient = a / 10;
						int rest = a % 10;
						int i = 1; // va nous permettre de savoir si on est sur les dizaines(alors on affecte à zehner) : i = 2
						//ou sur le chiffre des centaines (alors on affecte à hunderter) : i = 3
						//pour un dèbut on est sur les unités : i = 1
						
				//********** déterminer tous les chiffres en "a" ***************
						einheitA = rest;
						while (quotient != 0)
						{
							i++;
							rest = quotient % 10;
							quotient = quotient/10;
							if ( i == 2 )
								zehnerA = rest;
							else
								hunderterA = rest;
						}
//						System.out.println("unité : " + einheitA + "\ndizaine : " + zehnerA + "\ncentaine : " + hunderterA);
						 
						if (  !( einheitA == zehnerA || einheitA == hunderterA || zehnerA == hunderterA ) && 
								 einheitA != 0 && hunderterA != 0 && zehnerA  != 0 )
						{
							int einheitB = 0; //chiffre des unités de b
							int zehnerB = 0; //chiffre des dizaines de b
							int hunderterB = 0; //chiffre des centaines de b

							quotient = b / 10;
							rest = b % 10;
							i = 1; 
							
					//********** déterminer tous les chiffres en "b" ***************
							einheitB = rest;
							while (quotient != 0)
							{
								i++;
								rest = quotient % 10;
								quotient = quotient/10;
								if ( i == 2 )
									zehnerB = rest;
								else
									hunderterB = rest;
							}
//							System.out.println("unité : " + einheitB + "\ndizaine : " + zehnerB + "\ncentaine : " + hunderterB);
							 
						if ( (einheitB != zehnerB && einheitB != hunderterB && zehnerB != hunderterB ) && 
								 einheitB != 0 && hunderterB != 0 && zehnerB  != 0 &&
						     (einheitB != einheitA && einheitB != zehnerA && einheitB != hunderterA) &&
							 (zehnerB != einheitA && zehnerB != zehnerA && zehnerB != hunderterA) &&
							 (hunderterB != einheitA && hunderterB != zehnerA && hunderterB != hunderterA)  ) 
							 {
								int einheitC = 0; //chiffre des unités de c
								int zehnerC = 0; //chiffre des dizaines de c
								int hunderterC = 0; //chiffre des centaines de c

								quotient = c / 10;
								rest = c % 10;
								i = 1;  
								
						//********** déterminer tous les chiffres en "c" ***************
								einheitC = rest;
								while (quotient != 0)
								{
									i++;
									rest = quotient % 10;
									quotient = quotient/10;
									if ( i == 2 )
										zehnerC = rest;
									else
										hunderterC = rest;
								}
//								System.out.println("unité : " + einheitC + "\ndizaine : " + zehnerC + "\ncentaine : " + hunderterC);
//									
								if ( (einheitC != zehnerC && einheitC != hunderterC && zehnerC != hunderterC)&& 
										 einheitC != 0 && hunderterC != 0 && zehnerC  != 0 &&
									 (einheitC != einheitA && einheitC != zehnerA && einheitC != hunderterA) &&
									 (einheitC != einheitB && einheitC != zehnerB && einheitC != hunderterB) &&
									 (zehnerC != einheitA && zehnerC != zehnerA && zehnerC != hunderterA) &&
									 (zehnerC != einheitB && zehnerC != zehnerB && zehnerC != hunderterB) && 
									 (hunderterC != einheitA && hunderterC != zehnerA && hunderterC != hunderterA) &&
									 (hunderterC != einheitB && hunderterC != zehnerB && hunderterC != hunderterB)  ) 
									{
//										System.out.printf("[" + count++ +"] : %d - %d = %d %n", a, b, c); 
									System.out.printf("[%04d] : %d - %d = %d %n",count++, a, b, c);  
									}
							}
						} 
					} 
				}
			}
		}
	} 
}
