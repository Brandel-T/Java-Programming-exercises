
public class SushiExpress extends Car {

	private int tel;

	SushiExpress(int tel) {
		this.setTel(tel);
	}
 
	int plone() { 
		return getTel();
	}

 
	boolean blueLight() { 
		return false;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

}
