
public class Pi {

	public static void main(String[] args) { 
		float babylonPi = 3 + 1/8;
		double aegyptPi = (16/9)*(16/9);
		double chinaPi = Math.sqrt(10);
		double euroPi = 3 + 1/7;
		
		System.out.printf("PI berechnet von Babylonien: %.15f %n", babylonPi);
		System.out.printf("PI berechnet in Aegypten: %.15g %n", aegyptPi);
		System.out.printf("PI berechnet in China: %.15f %n", chinaPi);
		System.out.printf("PI berechnet in Europa: %.15g %n", euroPi);
		
	}

}
