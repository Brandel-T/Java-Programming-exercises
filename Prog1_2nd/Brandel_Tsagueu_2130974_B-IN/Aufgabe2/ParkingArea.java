


public class ParkingArea {
	
	private double breite;
	private double laenge;
	Car[][] places;
	static int failed;
	
	ParkingArea(double b, double l) {
		setBreite(b);
		setLaenge(l);

		int line = (int)(this.laenge - (this.laenge / 16) * 6d) / 5;  
		int col = (int)((this.breite - 2*5d) / 2.5); 
//		this.numberOfPlaces = line * col;
		this.places = new Car[line][col]; 
	}

	
	public void parking(Car c) {
		int row = (int)Math.random()*places.length;
		int col = (int)Math.random()*places[0].length;
		if ( places[row][col] == null )
		{
			places[row][col] = c;
		}
		else
		{
			int count = 1;
			row = (int)Math.random()*places.length;
			col = (int)Math.random()*places[0].length;
			while ( places[row][col] == null && count < 3) {
				row = (int)Math.random()*places.length;
				col = (int)Math.random()*places[0].length;
				
				count++;
			}

			if ( count == 3 && places[row][col] == null) {
				System.out.println("fahrer/in genervt. (parkt nicht)");
				failed ++;
			}
			
			else
				places[row][col] = c;
		}
		
	}
	
	public int fail() {
		return failed;
	}
	
	
	public int freeSlots() {
		int free = 0; 
		int i = 0, j = 0;
		for ( i = 0; i < places.length; i++ )
			for ( j = 0; j < places[i].length; j++ ) 
				if ( places[i][j] == null ) 
					free++; 
		return free;
	}
	
	
	
	
	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

}
