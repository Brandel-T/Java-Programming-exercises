package Abnahme03;

public class PizzaService extends Fahrzeug {

	private int tel;

	PizzaService() {
		this.setTel(49151);
	}
	
	PizzaService(int tel) {
		this.setTel(tel);
	}
	
	int telefon() {
		return this.getTel();
	}
	
	boolean blaulicht() { //darf kein Blaulicht besitzen
		return false;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
	
}
