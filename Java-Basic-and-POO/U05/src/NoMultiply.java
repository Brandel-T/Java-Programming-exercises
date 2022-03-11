
public class NoMultiply {
	
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		
		if (x<0 || y<0 || z<0)
			System.out.println("Numbers must be positiv");
		else if (x==0||y==0|| z==0)
			System.out.println(0);
		else
		{
			long result = 0;
			for (int i=0; i<x; i++) 
				for (int j=0; j<y; j++) 
					result = result + z;
			
			System.out.printf("(%d * %d * %d) = %d%n",x ,y ,z, result);
		} 
	}
}
