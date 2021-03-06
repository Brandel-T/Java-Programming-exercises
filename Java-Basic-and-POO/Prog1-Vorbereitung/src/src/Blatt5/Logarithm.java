package Blatt5;

public class Logarithm {
	public static void main(String[] args){
		double x = 1; 			//Double.parseDouble(args[0]);
		if(x > -1 && x <=1){
			double eps = 10;
			int exponent = 5; 	// Integer.parseInt(args[1]);
			int i = 0;
			while(i <= exponent){
				eps *= 0.1;
				i++;
			}
			System.out.println(ln1plusx(x,eps));
		}
	}
	
	public static double ln1plusx(double x, double eps){
		double ergebnisAlt;
		double ergebnisNeu = 0;
		double ergebnisGesamt = 0;
		int y = 1;
		do{
			int i = 1;			
			ergebnisAlt = ergebnisNeu;
			ergebnisNeu = x;
			while(i < y){
				ergebnisNeu *= x;
				i++;
			}			
			ergebnisNeu /= y;
			if(y % 2 != 0){
				ergebnisGesamt += ergebnisNeu;
			}else{
				ergebnisGesamt -= ergebnisNeu;
			}
			y++;	
			System.out.println("ergebnisGesamt = " + ergebnisGesamt);
		}while((ergebnisAlt - ergebnisNeu) > eps || (ergebnisAlt - ergebnisNeu) < -eps);
		return ergebnisGesamt;
	}
	
//	public static void main(String[] args) {
//		System.out.println(arcSinh(0.75, 0.0000000001));
//	}
//
//	public static double arcSinh(double x, double eps) {
//
//		double result;
//		result = x;
//		int sign = -1, currentSign = sign, counter = 5;
//		double operator, nextOperator, diff;
//		operator = x;
//		double pow = 1;
//
//		for (int i = 0; i <= 2; i += (1)) {
//			pow *= x;
//		}
//		nextOperator = (1 / (2 * 3)) * pow;
//		diff = operator - nextOperator;
//		if (diff > eps) {
//			result *= diff;
//			operator = nextOperator;
//			while (diff > eps) {
//				double num = 1;
//				int denum = 2;
//				for (int i = 1; i <= counter; i += (2)) {
//					num *= i;
//				}
//				for (int i = 2; i <= counter; i += (2)) {
//					denum *= i;
//				}
//				denum *= counter;
//				pow = x;
//				for (int i = 0; i <= counter; i += (1)) {
//					pow *= x;
//				}
//				nextOperator = (num / denum) * pow;
//				nextOperator *= currentSign;
//				currentSign *= sign;
//				counter += 2;
//				diff = operator - nextOperator;
//				if (diff > eps) {
//					result -= nextOperator;
//					operator = nextOperator;
//				}
//			}
//		}
//		return result;
//	}
}
//result = 0.6344198821653181