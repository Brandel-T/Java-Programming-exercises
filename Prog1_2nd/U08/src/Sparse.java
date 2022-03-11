
import java.util.StringTokenizer;

public class Sparse 
{
	String vector;
	int dimension;
	
	Sparse (String vector) 
	{
		this.vector = vector;
		StringTokenizer t = new StringTokenizer(this.vector, "(),", false);
		while ( t.hasMoreTokens() ) {
			t.nextToken();
			this.dimension++;
		}
	}
		
	
	double amount() 
	{ 
		double result = 0;
		
		StringTokenizer token = new StringTokenizer( this.vector , "0, )(" );
		String digit = "";
		while (token.hasMoreTokens()) 
		{
			digit = token.nextToken(); 
			result = result + (double)Integer.parseInt( digit ) * (double)Integer.parseInt( digit ) ;
		}
		
		return Math.sqrt( result );
	}
	
	
	Sparse opposite() 
	{
		String op = "(";	
		StringTokenizer token = new StringTokenizer( this.vector , ", )(" ); 	 
		String value = "";
		
		while (token.hasMoreTokens()) 
		{
			value = token.nextToken(); 
			op += ("" + ( -Integer.parseInt( ""+ value )) ) + ",";   
		}
		
		op = op.substring(0, op.length()-1) + ")"; //without "," at the end
		return new Sparse( op );
	}
	
	
	void changeValue(int position, int newValue) 
{  
		if ( position <= this.dimension )
		{
			String result = "(";
			 
			StringTokenizer token = new StringTokenizer(this.vector, "(),");
			int i = 0; 
			while (token.hasMoreTokens() ) 
			{ 
				i++;
				String s = token.nextToken();  
				if ( i == position)
				{
					if ( i < this.dimension)
						result += newValue + ",";
					else
						result += newValue + ")"; 
				}
				else 
				{
					if ( i < this.dimension)
						result += s + ",";
					else
						result += s + ")";
				}		
			}
			//System.out.println();	
			//System.out.println("result = " + result);
			this.vector = result;
		}
		else
			System.out.println("changevalue - position: "+position+", must be less or equal the dimension: "+this.dimension);
		
		
//		String newVector = this.vector.substring(1, this.vector.length()-1); //without "(" and ")"
//		  		System.out.println(newVector);
//		sb = new StringBuilder( newVector ); 
//		int index = 0; 
//		sb.delete(2*position-2, 2*position-1); 
//		sb.insert(2*index-2, ("" + newValue) );
//		System.out.println( sb.toString() );
		
//		StringTokenizer tk = new StringTokenizer( newVector , "," , true);	 
//		String value = ""; 
////		int index = 0; 
//		while ( tk.hasMoreTokens()  ) 
//		{
//			value = tk.nextToken();  
//			if ( "," != value)
//				if ( position == index )
//				{  
//					sb.replace( 2*index-2, 2*index-1, (""+newValue)); 
//				}
//			
//			index++;
//		} 
//		String result = "(" + sb.toString().substring(0) + ")";
//		System.out.println("result = " + result); 
//		this.vector = result;
	}
	
	
	void printCompact() 
	{ 
		String compact = "[";
		
		StringTokenizer token = new StringTokenizer( this.vector , ", )(" ); 
		
		int index=0;
		String value = "";
		while (token.hasMoreTokens()) 
		{
			value = token.nextToken();
			if ( ! value.equals("0") )
				compact += (index+1) + ":" + value + ", ";  
				
			index++;
		}
		compact = compact.substring(0, compact.length()-2); //without "," at the end

		System.out.println(compact + "]");
	}
	
	
	void printAll() 
	{
		if ( this.equals(null) )
			System.out.println("Can not print: THIS vector ist NULL");
		else
		{
			int i=0;
			for (i=0; i<this.vector.length(); i++)
				System.out.print(this.vector.charAt(i));
			System.out.println();
		}
	}
	
	
	static Sparse add (Sparse a, Sparse b) 
	{		
		if ( a.dimension != b.dimension ) 
		{
			System.out.println("CAN NOT CALCULATE add: DIMENSIONS OF VECTORS MUST BE EQUAL");
			return null;
		}
		
		String resultVector = "(";
		StringTokenizer tokenA = new StringTokenizer(a.vector, " (),", false);
		StringTokenizer tokenB = new StringTokenizer(b.vector, " (),", false);
		String aa , bb; 
		while ( tokenA.hasMoreTokens() && tokenB.hasMoreTokens() )
		{
			aa = tokenA.nextToken();
			bb = tokenB.nextToken();  
			resultVector += ( Integer.parseInt( aa ) + Integer.parseInt( bb ) ) + ",";
		}
		
		resultVector = resultVector.substring(0, resultVector.length()-1); //without "," at the end
		resultVector += ")"; 
		return new Sparse(resultVector );
	}
	
	
	static Sparse dot(Sparse a, Sparse b) 
	{
		if ( a.dimension != b.dimension ) 
		{
			System.out.println("CAN NOT CALCULATE dot: DIMENSIONS OF VECTORS MUST BE EQUAL");
			return null;
		}
		
		String resultVector = "(";
		StringTokenizer tokenA = new StringTokenizer(a.vector, " (),", false);
		StringTokenizer tokenB = new StringTokenizer(b.vector, " (),", false);
		String aa , bb;
		while ( tokenA.hasMoreTokens() && tokenB.hasMoreTokens() )
		{
			aa = tokenA.nextToken();
			bb = tokenB.nextToken(); 
			resultVector += ( Integer.parseInt( aa ) * Integer.parseInt( bb ) ) + ",";
		}
		
		resultVector = resultVector.substring(0, resultVector.length()-1); //without "," at the end
		resultVector += ")"; 
		return new Sparse(resultVector );
	}
	
	
	static Sparse create(int n, int m, int a, int b) 
	{
		if ( n <= 0 || m < 0 || m >= n || (a >= b && a!=0 && b!=0)) {
			System.out.println("FAILED SPARSE VECTOR CREATION");
			return null;
		} 
		else if (a==0 || b == 0) 
		{
			String resultVector="(";
			for (int i = 0; i < n-1; i++ )
				resultVector += 0 + ",";
			resultVector += 0 + ")"; 
			return new Sparse(resultVector );
		}
		else 
		{
			String resultVector="("; 
			
			int notNullNumber=0; ;
			int i=1;
			int index = (int)Math.random() * n;  
			
			for ( i=1; i<=n+1 ; i++ )
			{ 
				notNullNumber = a + (int) ( Math.random() * Math.abs(b - a) ) ; 
				index = ( i + (int) ( Math.random() * n ) < n ) ?
								i + (int) ( Math.random() * n ) :
														 index  ;
								
				if ( index % i == 0 )
				{
					if ( i != n+1 && m != 0 )
						resultVector += notNullNumber + ",";
					else if ( i == n+1 && m != 0 )
						resultVector += notNullNumber + ")";

					m--;	
				} 
				else 
				{
					if ( i != n+1 && m != 0 )
						resultVector += 0 + ",";
					else if ( i == n+1 && m != 0 )
						resultVector += 0 + ")";

					m--;	
				}
//				if ( m != 0 ) {
//					notNullNumber = a + (int) ( Math.random() * (b - a) ); 
//					index = ( i + (int) ( Math.random() * n ) < n ) ?
//									i + (int) ( Math.random() * n ) :
//															index   ;
//					System.out.println("index = "+index);
//					System.out.println("notNullNumber = "+  notNullNumber);
//					if( resultVector.charAt(index) != ',') {
//						sb.replace(2*index-1, 2*index, ("" + notNullNumber));
//					}
////					resultVector += notNullNumber + ",";
//					resultVector = sb.toString();
//					m--;					
//				}
//				else
//					resultVector += "0,";
			} 
//			resultVector = "(" +resultVector; //without "," before ")" at the end
			
			System.out.println("SUCCESFULL SPARSE VECTOR CREATION");
			return new Sparse( resultVector );
		}
	}

}
