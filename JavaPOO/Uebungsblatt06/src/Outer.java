
public class Outer extends Aufgabe1 {
	private double k = 3;
	//double j = 11.;
	protected void f() {
		System.out.println("je suis la méthode f() dans Outer\n");
	}
	
	public class Inner {
		
		public void g(int i) {
			final int k = 44;
			System.out.println("je suis la méthode g() dans Inner " + k +" \n");
			
			class Local {
				
				public Local() {
					System.out.println("je suis le constructeur de Local");
				}
				
				public void f(int k) {
					System.out.println("je suis la méthode f() dans Local");
					System.out.println("j dans Aufgabe1 " + Outer.super.j);
					System.out.println("i dans Aufgabe1 " + Outer.this.k );
					System.out.println("i dans g() " + i);
					//System.out.println("k dans g() " + (new Inner().g(4)) );
					Outer.this.f();  
					Outer.super.f();
					//System.out.println("i dans Aufgabe1 " + Outer.super.i);
					System.out.println("je suis la méthode g() dans Inner " + k +" ++++ \n");
				}			
			}

			new Local().f(7);
		}
	}
	
	public static void main(String[] args) {
		Outer out = new Outer();
		//System.out.println(out.j);
		Outer.Inner outin = out.new Inner();
		outin.g(4);
	}
}

