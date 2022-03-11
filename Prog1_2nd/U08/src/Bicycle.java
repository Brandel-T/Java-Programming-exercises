
public class Bicycle {
	
	private String brand;
	private int chainRingCount;
	private int sprockCount;
	private int chainRing;
	private int sprock;
	
	Bicycle(String brand, int chainRingCount, int sprockCount) {
		this.brand = brand;
		this.chainRingCount = chainRingCount;
		this.sprockCount = sprockCount;
		chainRing = 0;
		sprock = sprockCount-1;
	}
	
	String getBrand() {
		return brand;
	}
	
	int getChainRingCount() {
		return chainRingCount;
	}

	int getSprockCount() {
		return sprockCount;
	}
	
	int getChainRing() {
		return chainRing;
	}
	
	int getSprock() {
		return sprock;
	}
	
	void shiftUpChainRing() {
		if ( getChainRing() < getChainRingCount()-1 )
			chainRing++;
		else
			System.out.println("kann nicht die Kette auf den naechst groeßeren Zahnkranz verschieben");
	}
	
	void shiftDownChainRing() {
		if ( getChainRing() > 0 )
			chainRing--;
		else
			System.out.println("kann nicht die Kette auf den naechst kleineren Zahnkranz verschieben");
	}
	
	void gearUp() {
		if ( getSprock() > 0 )
			sprock--;
		else
			System.out.println("kann nicht die Kette auf das naechst kleinere Ritzel verschieben");
	}
	
	void gearDown() {
		if ( getSprock() < getSprockCount()-1 )
			sprock++;
		else
			System.out.println("kann nicht die Kette auf das naechst groeßere Ritzel verschieben");
	}
	
	void printStatus() {
		//Fahrradmarke
		System.out.print(getBrand() + " "); 
		
		//Zahnkranz
		String chain = ""; 
		for (int i=0; i < getChainRingCount(); i++) {
			if (i == getChainRing())
				chain = chain + "*";
			else
				chain = chain + "o";
		}
		System.out.print( chain );
		
		//Fahrradkette
		System.out.print("----"); 
		
		//Ritzel
		String mySprock = ""; 
		for (int i=0; i < getSprockCount(); i++) {
			if (i == getSprock())
				mySprock = mySprock + "*";
			else
				mySprock = mySprock + "o";
		}
		System.out.println( mySprock );
	}
	
}

































