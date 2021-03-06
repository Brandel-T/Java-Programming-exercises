package Blatt5;

public class MyArcSinh {

//	public static double arcSinh(double x , double eps) {
//		double result = 0.0 ;
//	
//		if ( x <= -1 || x >= 1) 
//			return -1;
//		else {
//			double prev, current; //previous and current term
//			double diff = 0.0; // = prev + (vorzeichen)*current
//			int vorzeichen = -1;
//			double exp = x*x*x;
//			
//			prev = x;
////System.out.printf("eps = %f %n", eps);
//			int i = 3;
////			System.out.printf("%f ", prev);
//			do{
//				int j = 1;
//				int k = 2;
//				int num = 1, denom = 1;
// 
//				for (j = 1; j < i; j=j+2) { 
//					num = num * (j );  
//				} 
//				for (k = 2; k < i; k = k+2) {
//					denom = denom * k; 
//				}
//				denom = denom*i;
//				System.out.println();
//				
//				current = num*exp / denom;
//				diff = prev + vorzeichen*current;
//				exp = exp*x*x;
//				System.out.println("num = "+ num);
//				System.out.println("denom = "+ denom);
//				System.out.println("diff = " + diff);
//				System.out.println("vorzeichen = "+ vorzeichen);				 
//				
//				result = result + diff;
//				System.out.println(">>>>result = "+ result);
//				
//				prev = vorzeichen*current;
//				vorzeichen = -vorzeichen;
//				System.out.println("   i = "+ i + ",    j = "+ j);
//				i = i+2;
////				System.out.println();
//			} while ( diff > eps /*|| diff < -eps*/) ;
//		}
//		
//		return result ;
//	}
////	0.694721979804081
//	
//	public static void main(String[] args) {	 
//		System.out.println();
//		System.out.println("result = "+ arcSinh(0.75, 0.0000000001)); 
//	}

	public static double arcSinh(double x , double eps) {
		
		if (x >= 1 || x <= -1) 
			return -999;
		else 
		{
			double result = 0.0;
			double altTerm = 0, neuTerm = x, diff = 0;
			int i = 3, num = 1, denom = 2, sign = -1;
			double exp = x*x*x;
			
			do {
				altTerm = neuTerm;
				num = num*(i-2);
				denom = denom*(i-1);
				neuTerm = sign*num*exp/(denom*i);
				
				diff = altTerm + neuTerm;
				result = result + diff;
				
				exp = exp*x*x;
				i = i+2;
				sign = -sign;
				
			} while (diff > eps);	
			
			return result;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(arcSinh(0.75, 0.0000000001)); //0.68858642578125
//		System.out.println(arcSinh(1, 0.0000000001)); //0.8708333333333333
//		System.out.println(arcSinh(-1, 0.0000000001)); //-0.9166666666666666
	}


}
