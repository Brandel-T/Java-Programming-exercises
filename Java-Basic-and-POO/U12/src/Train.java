

public class Train {

	private Locomotive loc;
	private int waggonAnz; //anzahl von Waggons
	
	public Train(Locomotive loc) {
		this.setLoc(loc);
		this.setWaggonAnz( loc.countCars() ); 
	}
		
	public Train add( Car car , int position) {
		
		Train resultTrain = this;
		
		if ( ! ( position >= 0 && position <= this.getWaggonAnz() ) || car == null ) { 
			System.out.println("Position out of range: Range[0, "+ (getWaggonAnz()-1) +"]");
			return resultTrain;
		}		 
		
		if ( position == 0 ) { //am anfang hinzufuegen
			car.setNext( resultTrain.getLoc().getNext() );
			resultTrain.getLoc().setNext(car);
		}  
		else { 
			Car currentCar = resultTrain.getLoc().getNext(); //erster waggon
			for (int i = 1; i < position; i++) { 
				currentCar = currentCar.getNext();
			}
			
			car.setNext( currentCar.getNext() );
			currentCar.setNext(car);
			resultTrain.getLoc().setNext(currentCar);
		} 	
		resultTrain.setWaggonAnz( getWaggonAnz() + 1 ); //anzahl waggons hochzaehlen 
		
		return resultTrain;
	}
	
	//Anhaengen
	public Train add( Car car ) {

		Train resultTrain = this;
		
		if ( car == null )
			return resultTrain;
		
		Car c = resultTrain.getLoc().getNext();
		while ( c.getNext() != null )
			c = c.getNext();
		car.setNext(null);
		c.setNext(car);
		
		resultTrain.getLoc().setNext(c); ; //Train reinitialisieren		
		resultTrain.setWaggonAnz( getWaggonAnz() + 1 ); //anzahl waggons hochzaehlen
		
		return resultTrain;
	}
	
	public void print() {
		System.out.println("Train infos:");
		System.out.println( "   Locomotive : [length "+ this.getLoc().getLength() + ", type: " + this.getLoc().getType()+ "]");
		System.out.println( "   Number of cars: " + this.getWaggonAnz() );
		System.out.println( "   Train lenght: " + this.getLength() );
	}

	public int getLength() {
		int len = 0; //fuer die der laengen der waggons
		Car c = this.getLoc().getNext();
		for (int i = 0; i<getWaggonAnz(); i++) {
			len += c.getLength();
			if ( c.getNext() != null )
				c = c.getNext();
		}
		
		return this.getLoc().getLength() + len;  
	} 
	
	public int getPassengers() {
		return this.getLoc().getNext().getMaxPassengers() * this.getWaggonAnz(); //moegliche anzahl
	}
	
	public Train removeFirst() {
		if (  getWaggonAnz()==0 || this.getLoc().getNext()==null)
			return null;
		
		Car secondCar = this.getLoc().getNext().getNext();
		this.getLoc().setNext( secondCar );
		this.setWaggonAnz( getWaggonAnz() - 1 ); //anzahl waggons runterzaehlen
		return this;			
	}
	
	public Train relink( Train tr ) {
		Train resultTrain = this;
		if ( tr==null )
			return this;
		resultTrain.add(tr.getLoc().getNext()); //anhaengen
		
		return resultTrain;
	}
	
	
	public Train revert() {
		
		Train resultTrain = this;
		Locomotive loco = this.getLoc();
		Car[] cars = new Car[getWaggonAnz()];
		Car c = loco.getNext();
		int i=0;
		while ( c != null ) {
			cars[i] = c;
			i++;
			c = c.getNext();
		} 
		
		int j = cars.length-1;
		for ( j=cars.length-1; j >= 1; j--) { 
			cars[j].setNext( cars[j-1] );
		}
		//fuer j=0
		cars[0].setNext(null);
		
		loco.setNext( cars[ cars.length - 1] );
		resultTrain.setLoc(loco);
		
		return resultTrain;
	}

	public Locomotive getLoc() {
		return loc;
	}

	public void setLoc(Locomotive loc) {
		this.loc = loc;
	}

	public int getWaggonAnz() {
		return waggonAnz;
	}

	public void setWaggonAnz(int waggonAnz) {
		this.waggonAnz = waggonAnz;
	}
	
	public String toString() {
		return " Train : < " + getWaggonAnz() + " cars, " + getLoc() + " >";
	}
	
}
