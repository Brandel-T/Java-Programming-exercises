package SS2006;

public abstract class Hund implements Atmend {
	public abstract int hecheln();
	public void keuchen() {
		int x = hecheln();
	}
}

//public class Dackel extends Hund implements Atmend {
//
//	@Override
//	public int hecheln() {
//		// TODO Auto-generated method stub
//		return 0;
//	}	
//}
