
public class NaturalNumberX {

	public static void main(String[] args) { 
		
		int i ;
		double sum = 0;  
		boolean bool = true;
		
		for ( i = 0; i <= Integer.MAX_VALUE && bool ; i++ )
		{ 
			if ( i != Integer.MIN_VALUE ) 
			{
				if ( i < 10) {
					if (i == 0)
						System.out.println("number = " + i + ", sum = " + i);
					if ( Math.pow(i, i) == i ) { 
						System.out.println("number = " + i + ", sum = " + i);
					}
				}
				else
				{  
					int quotient = i / 10;
					int rest = i % 10;
					
					if (rest == 0)
						sum = sum + 0 ;
					else if (rest == 1)
						sum++;
					else
						sum = Math.pow(rest, rest);
					
					while ( quotient != 0 )
					{
						rest = quotient % 10;
						quotient = quotient / 10;
						if (rest == 0)
							sum = sum + 0 ;
						else if (rest == 1)
							sum++;
						else
							sum = sum + Math.pow(rest, rest);
					}
					
					if ( i == sum ) { 
						System.out.println("number = " + i + ", sum = " );		
						int q = i / 10;
						int r = i%10;
						while (q!=0) {
							r = q%10;
							q=q/10;
							if (r==0)
								System.out.print(0 + " ");
							else {
								if (q!=0)
									System.out.print(Math.pow(r, r)+ " + ");
								else
									System.out.print(Math.pow(r, r)+ " ");
							}								
						}
					}					
				}
				
				sum = 0;
			}
			else bool = false; 
		}

	}

}
