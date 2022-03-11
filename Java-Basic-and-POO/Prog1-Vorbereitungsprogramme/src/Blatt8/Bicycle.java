package Blatt8;

public class Bicycle {
	
	private String brand;
	private int chainRingCount;
	private int sprockCount;
	private int chainRing;
	private int sprock;
	
	public Bicycle(String bd, int crc, int sc) {
		brand = bd;
		chainRingCount = crc;
		sprockCount = sc;
		chainRing = 0;
		sprock = 0;
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
		int position = chainRing;
		
		if (getChainRing() == getChainRingCount()-1)
			chainRing = getChainRingCount()-1;
		else if (position++ <= getChainRingCount()-1 )
			chainRing++;
		else 
			System.out.println("chain ring maximal reached");
	}

	void shiftDownChainRing() {
		int position = chainRing;
		
		if (getChainRing() == 0)
			chainRing = 0;
		else if (position-- >= 0) 
			chainRing--;
		else 
			System.out.println("chain ring minimum reached");
	}
	
	void gearUp() {
		int pos = sprock;
		if (getSprock() == getSprockCount()-1 )
			sprock = getSprockCount()-1;
		else if (pos++ <= getSprockCount()-1)
			sprock++;
		else
			System.out.println("sprock maximum reached");
	}
	
	void gearDown() {
		int pos = sprock;
		if (--pos >= 0 )
			sprock--;
		else if( getSprock() == 0)
			sprock = 0;
		else
			System.out.println("sprock minimum reached");
	}
	
	void printStatus() {
		String ritzel = "";
		String zahnkranz = ""; 
		
		for(int i=0; i<getChainRingCount(); i++) {
			if (i == getChainRing())
				zahnkranz += "*";
			else
				zahnkranz += "o";
		}
		
		for(int i=0; i<getSprockCount(); i++) {
			if (i == getSprock())
				ritzel += "*";
			else
				ritzel += "o";
		}
		
		System.out.printf("%s %s----%s %n", getBrand(), zahnkranz, ritzel);
	}
}














































