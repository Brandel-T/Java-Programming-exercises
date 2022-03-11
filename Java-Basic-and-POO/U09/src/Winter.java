
public class Winter {

	int day; //current day
	Flower flower1;
	Flower flower2;
	Flower flower3;
	Flower flower4;
	Flower flower5;
	Vole vole;
	
	Winter( Flower f1, Flower f2, Flower f3, Flower f4, Flower f5, Vole v ) {
		day = 0;
		flower1 = f1;
		flower2 = f2;
		flower3 = f3;
		flower4 = f4;
		flower5 = f5;
		vole = v;
	}
	
	void oneDayPasses() {
		day++;
	}
	
}
