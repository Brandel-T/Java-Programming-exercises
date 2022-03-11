
public class _1x1_Tabelle_Schleifen {

	public static void main(String[] args) {
		int x = 1;
		int y;
		while (x <= 10) 
		{
			y = 10;
			while (y <= 20) 
			{
				System.out.printf("%dx%d = %d ", x, y, x*y);
				y++;
			}
			System.out.println();
			x++;
		}

	}

}
