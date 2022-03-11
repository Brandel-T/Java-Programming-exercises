package Abnahme03_SS2005;

public class Verbund extends Querschnitt {

	Querschnitt q1;
	Querschnitt q2;
	Querschnitt q3; 
	
	Verbund(double r, double t1, double b1, double t2, double b2) {
		q1 = new Rechteck(t1, b1); 
		q2 = new Rechteck(t2, b2);
		q3 = new Halbreis(r);
	}
	
	Verbund(Querschnitt q1, Querschnitt q2, Querschnitt q3) {
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
	}

	@Override
	double flaeche() { 
		return q1.flaeche() + q2.flaeche() + q3.flaeche();
	}

	public static void main(String[] args) {
		Verbund v1 = new Verbund(4, 5, 7, 3, 2);
		System.out.println("v1: "+ v1.flaeche() + " Flaecheneinheit" );
		
		Querschnitt q1 = new Halbreis(4);
		Querschnitt q2 = new Rechteck(3, 5);
		Querschnitt q3 = new Rechteck(2, 7);
		Verbund v2 = new Verbund(q1, q2, q3);
		System.out.println("v2: "+ v2.flaeche() + " Flaecheneinheit" );
		
	}
}
