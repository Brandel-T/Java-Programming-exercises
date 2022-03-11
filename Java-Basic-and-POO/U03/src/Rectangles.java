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
		
		if ( px==qx && py==qy )
			System.out.println("Die zwei erste Punkte bilden kein Rechteck. Geben Sie bitte diese Punkte erneut ein. . .");
		else if ( sx==tx && sy==ty )
			System.out.println("Die zwei letzte Punkte bilden kein Rechteck. Ggeben Sie bitte diese Punkte erneut ein. . .");
		else {
 
			if ( ( ((px > sx && px > tx && qx > sx && qx > tx) || (px < sx && px < tx && qx < sx && qx < tx)) && (py==sy||py==ty) && (qy==ty||qy==sy) ) || 
				     ( ((py > sy && py > ty && qy > sy && qy > ty) || (py < sy && py < ty && qy < sy && qy < ty)) && (px==sx||px==tx) && (qx==tx||qx==sx) ) ||
				     ( (px < sx && px < tx && qx < tx && qx > sx && py > ty && py > sy && qy > ty && qy > sy) || (qx < sx && qx < tx && px < tx && px > sx && qy > ty && qy > sy && py > ty && py > sy) ) ||
				     ( (py < sy && py < ty && qy < ty && qy > sy && px > tx && px > sx && qx > tx && qx > sx) || (qy < sy && qy < ty && py < ty && py > sy && qx > tx && qx > sx && px > tx && px > sx) ) ||
				     ( (sx < px && sx < qx && tx < qx && tx > px && sy > qy && sy > py && ty > qy && ty > py) || (tx < px && tx < qx && sx < qx && sx > px && ty > qy && ty > py && sy > qy && sy > py) ) ||
				     ( (sy < py && sy < qy && ty < qy && ty > py && sx > qx && sx > px && tx > qx && tx > px) || (ty < py && ty < qy && sy < qy && sy > py && tx > qx && tx > px && sx > qx && sx > px) ))  
					System.out.println("disjoint");
			else 
				if ( (px==sx && qx==tx && py==sy && qy==ty) || (px==tx && qx==sx && py==ty && qy==sy) ||
					 (qx==tx && px==sx && qy==ty && py==sy) || (qx==sx && px==tx && qy==sy && py==ty) ||
					 (py==ty && px==sx && qy==sy && qx==tx) || (py==sy && px==tx && qy==ty && qx==sx) ||
					 (qy==ty && qx==sx && py==sy && px==tx) || (qy==sy && qx==tx && py==ty && px==sx))
					System.out.println("same");
			else 
				if ( (px < tx && px < sx && qx > tx && qx > sx && py < sy && py < ty && qy > ty && qy > sy) || 
					 (px < tx && px < sx && qx > tx && qx > sx && py > sy && py > ty && qy < ty && qy < sy) ||
					 (qx < tx && qx > sx && px < tx && px > sx && qy > sy && qy < ty && py < ty && py > sy) || 
				     (qx < tx && qx > sx && px < tx && px > sx && qy < sy && qy > ty && py > ty && py < sy) )
					System.out.println("contained");
			else 
				if ( (py==sy && qy==ty && tx!=px && qx==sx) || (qy==ty && py==sy && sx!=qx && px==tx) ||
					 (py==ty && qy==sy && qx==sx && qy==sy) || (qy==sy && py==ty && px==tx && py==ty) ||
					 (px==sx && qx==tx && ty!=py && qy==sy) || (qx==tx && px==sx && sy!=qy && py==ty) ||
					 (px==tx && qx==sx && qy==sy && qx==sx) || (qx==sx && px==tx && py==ty && px==tx) ) 
						System.out.println("aligned");
			else 
				if ( (sx==px && sy==py && qx!=tx && qy!=ty) || (sx==qx && sy==qy && px!=tx && py!=ty) || 
					 (qx==tx && qy==ty && px!=sx && py!=sy) || (tx==px && ty==py && sx!=qx && sy!=qy) ||
					 (sx==px && sy==py && qx!=tx && qy==ty) || (sx==qx && sy==qy && px!=tx && py==ty) ||
					 (sy==py && sx==px && qy!=ty && qx==tx) || (sy==qy && sx==qx && py!=ty && px==tx) ||
					 (sx==qx && sy!=py && tx!=px && tx!=qx && ty==qy) || (tx==qx && ty!=py && sx!=px && sx!=qx && sy==qy) ||
					 (sx==px && sy!=qy && tx!=qx && tx!=px && ty==py) || (tx==px && ty!=qy && sx!=qx && sx!=px && sy==py) ||
					 (tx==qx && ty!=qy && sx!=qx && sx!=px && sy==py) || (tx==qx && ty!=qy && sx!=qx && sx!=px && sy==py) ||
					 (tx==px && ty!=py && sx!=px && sx!=qx && sy==qy) || (tx==px && ty!=py && sx!=px && sx!=qx && sy==qy) ) 
					System.out.println("touching");
			else
				System.out.println("intersecting");
		}
	}
}