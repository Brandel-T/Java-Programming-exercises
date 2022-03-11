package EinAusgabe.Serialization;

public class SerialisationDriver {

	public static void main(String[] args) 
	{
		Student apolo = new Student("apolo", 1234);
		Student hil = new Student("Hil", 12);
		Student me = new Student("me xyz", 789);
		
		System.out.println(apolo);
		System.out.println(hil);
		System.out.println(me);	
	}

}
