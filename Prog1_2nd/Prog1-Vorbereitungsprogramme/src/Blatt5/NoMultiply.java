package Blatt5;

public class NoMultiply {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);

		if (x<0 || y<0 || z<0)
			System.out.println("Die Eingabezahlen muessen positiv sein");
		else if (x==0 || y==0 || z==0)
			System.out.println(0);
		else {
			int i = 1;
			int mult = 0;
			
			for (i=1; i<=z; i++) {
				int j = 1;
				for (j=1; j<=y; j++)
					mult = mult + x;
			}
			System.out.printf("(%d * %d * %d) = %d",x, y, z, mult);
		}
	}

}
