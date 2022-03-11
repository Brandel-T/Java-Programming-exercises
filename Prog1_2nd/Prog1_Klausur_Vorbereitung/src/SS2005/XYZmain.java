package SS2005;

public class XYZmain extends Y{

	public static void main(String[] args) { 
		
		/*-+---------------------------------+
		 * |      dynamisches Binden:        |
		 *-+---------------------------------+
		 * | java binden im allgemein dynamisch: |
		 * | die JVM sucht immer zuerst in der   |
		 * | Klasse des dynamischen Types        |
		 * 
		 */
		X x = new X();
		x.a();
		System.out.println("----");
		
		Y y = new Y();
		y.a();		
		System.out.println("----");

		Z z = new Z();
		z.a();
		System.out.println("----");

		/*X */x = new Y();
		x.a();
		x.b();
		x.c();
		System.out.println("----");

		X xx = new Z();
		xx.a();
		xx.b();
		xx.c();
		System.out.println("----");

		Y yy = new Z();
		yy.a();
		yy.b();
		yy.c();;;
		System.out.println("end");;;
		System.out.println("end end");;;

	}

}
