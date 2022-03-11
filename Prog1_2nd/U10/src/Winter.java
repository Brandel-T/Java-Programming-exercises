
public class Winter {

	private int day; //current day
	private Flower flower1;
	private Flower flower2;
	private Flower flower3;
	private Flower flower4;
	private Flower flower5;
	private Vole vole;
	private int length;
	
	Winter() {
		this(20);
	}
	
	Winter( int length ) {
		this.length = length;
	}
	
	Winter( Flower f1, Flower f2, Flower f3, Flower f4, Flower f5, Vole v, int length ) {
		setDay(0);
		setFlower1(f1);
		setFlower2(f2);
		setFlower3(f3);
		setFlower4(f4);
		setFlower5(f5);
		setVole(v);
		setLength(length);
	}
	
	void oneDayPasses() {
		setDay(getDay() + 1);
	}

	Flower getFlower1() {
		return flower1;
	}

	void setFlower1(Flower flower1) {
		this.flower1 = flower1;
	}

	Flower getFlower2() {
		return flower2;
	}

	void setFlower2(Flower flower2) {
		this.flower2 = flower2;
	}

	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}

	Flower getFlower3() {
		return flower3;
	}

	void setFlower3(Flower flower3) {
		this.flower3 = flower3;
	}

	Flower getFlower4() {
		return flower4;
	}

	void setFlower4(Flower flower4) {
		this.flower4 = flower4;
	}

	Flower getFlower5() {
		return flower5;
	}

	void setFlower5(Flower flower5) {
		this.flower5 = flower5;
	}

	Vole getVole() {
		return vole;
	}

	void setVole(Vole vole) {
		this.vole = vole;
	}

	int getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	} 
}
