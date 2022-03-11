
public class RegularAdditions {

	public static void main(String[] args) {  
		
		for (int a = 111; a <= 999; a++)
		{
			for (int b = 111; b <= 999; b++)
			{
				for (int c = 111; c <= 999; c++)
				{
					if ( a + b == c )
					{ 
						int einheitA = 0;  
						int zehnerA = 0; 
						int hunderterA = 0;  

						int quotient = a / 10;
						int rest = a % 10;
						int i = 1;  
						
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

						if (  !( einheitA == zehnerA || einheitA == hunderterA || zehnerA == hunderterA ) && 
								 einheitA != 0 && hunderterA != 0 && zehnerA  != 0 )
						{
							int einheitB = 0; 
							int zehnerB = 0; 
							int hunderterB = 0;

							quotient = b / 10;
							rest = b % 10;
							i = 1; 

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

						if ( (einheitB != zehnerB && einheitB != hunderterB && zehnerB != hunderterB ) && 
								 einheitB != 0 && hunderterB != 0 && zehnerB  != 0 &&
						     (einheitB != einheitA && einheitB != zehnerA && einheitB != hunderterA) &&
							 (zehnerB != einheitA && zehnerB != zehnerA && zehnerB != hunderterA) &&
							 (hunderterB != einheitA && hunderterB != zehnerA && hunderterB != hunderterA)  ) 
							 {
								int einheitC = 0;  
								int zehnerC = 0;  
								int hunderterC = 0;

								quotient = c / 10;
								rest = c % 10;
								i = 1;  
								
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
				
								if ( (einheitC != zehnerC && einheitC != hunderterC && zehnerC != hunderterC)&& 
										 einheitC != 0 && hunderterC != 0 && zehnerC  != 0 &&
									 (einheitC != einheitA && einheitC != zehnerA && einheitC != hunderterA) &&
									 (einheitC != einheitB && einheitC != zehnerB && einheitC != hunderterB) &&
									 (zehnerC != einheitA && zehnerC != zehnerA && zehnerC != hunderterA) &&
									 (zehnerC != einheitB && zehnerC != zehnerB && zehnerC != hunderterB) && 
									 (hunderterC != einheitA && hunderterC != zehnerA && hunderterC != hunderterA) &&
									 (hunderterC != einheitB && hunderterC != zehnerB && hunderterC != hunderterB)  ) 
									{
										System.out.printf("%d + %d = %d %n", a, b, c);  
									}
							}
						} 
					} 
				}
			}
		}

	}

}
