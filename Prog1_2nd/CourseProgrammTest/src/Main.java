
public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		System.out.println( m.getClass().getSimpleName() );	

		//Ausgabe des Typobjektes des typs "String"
		System.out.println( String.class );
		
		System.out.println( "String".getClass().getClass().getSimpleName() );
		System.out.println( "String".getClass() == (String.class) );
		
		//Ausgabe des Typobjektes des typs "int"
		System.out.println( int.class );

		//Ausgabe des Typobjektes des typs "Integer"
		System.out.println( Integer.class );
		
		
//		String s = "main"; --> will throw an error (wrong name)
		String s = "Main";
		try {
			Class c = Class.forName(s);
			System.out.println( c );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}








