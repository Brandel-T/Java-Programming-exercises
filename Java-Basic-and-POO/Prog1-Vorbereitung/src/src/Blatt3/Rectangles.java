package Blatt3;

public class Rectangles {

	public static void main(String[] args) {
		int px = Integer.parseInt(args[0]);
		int py = Integer.parseInt(args[1]);
		int qx = Integer.parseInt(args[2]);
		int qy = Integer.parseInt(args[3]);

		int sx = Integer.parseInt(args[4]);
		int sy = Integer.parseInt(args[5]);
		int tx = Integer.parseInt(args[6]);
		int ty = Integer.parseInt(args[7]);
		
		if ( (px > sx && px > tx && qx > sx && qx > tx) || (px < sx && px < tx && qx < sx && qx < tx)) 
			System.out.println("disjoint");
		else 
			if ( (px == sx && qx == tx) || (px == tx && qx == sx) )
				System.out.println("same");
		else 
			if ( (px < tx && px < sx && qx > tx && qx > sx && py < sy && py < ty && qy > ty && qy > sy) || 
				  (px < tx && px < sx && qx > tx && qx > sx && py > sy && py > ty && qy < ty && qy < sy) ||
				  (qx < tx && qx > sx && px < tx && px > sx && qy > sy && qy < ty && py < ty && py > sy) || 
				  (qx < tx && qx > sx && px < tx && px > sx && qy < sy && qy > ty && py > ty && py < sy)){
				System.out.println("contained");
		}
		else 
			if ( (py == qy && py == ty && ty == sy && (tx != sx || px != qx)) ||
				  (px == qx && px == tx && tx == sx && (ty != sy || py != qy))) {
			
				System.out.println("aligned");
		}
		else 
			if ( (sx == px && sy == py) || (sx == qx && sy == qy) || (qx == tx && qy == ty) ) 
				System.out.println("touching");
		else
			System.out.println("intersecting");

	}

}
