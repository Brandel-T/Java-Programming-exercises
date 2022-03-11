
public class Main extends abst implements example {
	
	public static void main(String[] args) {

		Main obj = new Main(); 
		obj.parler();
		obj.crier();
		System.out.println("prenom: " + obj.prenom);
		System.out.println("age: " + obj.age);
		System.out.println("name: " + obj.name);
	}

	@Override
	public void parler() {
		System.out.println("hello brandel");
		
	}

	@Override
	void crier() {
		System.out.println("vas chierrrr !!!!!!!!");
		
	}

}
