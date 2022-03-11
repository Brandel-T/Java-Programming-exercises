public class ClockTime {
	int h;
	int m;
	int s;

	ClockTime(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}

	ClockTime(int h, int m) {
		this(h, m, 0);
	}

	ClockTime(int h) {
		this(h, 0);
	}

	ClockTime() {
		this(0);
	}

	int getH() {
		return h;
	}

	void setH(int h) {
		this.h = h;
	}

	int getM() {
		return m;
	}

	void setM(int m) {
		this.m = m;
	}

	int getS() {
		return s;
	}

	void setS(int s) {
		this.s = s;
	}

	ClockTime(ClockTime ct) {
		this(ct.getH(), ct.getM(), ct.getS());
	}

	boolean same(ClockTime ct) {
		return ((ct.getH() == this.getH()) && (ct.getM() == this.getM()) && (ct.getS() == this.getS()));
	}

	void add(int s) {
		this.setS(this.getS() + s);
		correction();
	}

	int diff(ClockTime ct) {
		int x = ct.sOutput() - this.sOutput();
		if (x < 0) {
			x += 60 * 60 * 24;
		}
		return x;
	}

	int getSeconds() {
		correction();
		return this.getS();
	}

	int getMinutes() {
		correction();
		return this.getM();
	}

	int getHours() {
		correction();
		return this.getH();
	}

	void output() {
		System.out.printf("%02d:" + "%02d:" + "%02d", h, m, s);
	}

	int sOutput() {
		int result = 0;
		result += this.getS() + this.getM() * 60 + this.getH() * 60 * 60;
		return result;
	}

	public String toString() {
		return h + ":" + m + ":" + s;
	}

	void correction() {
		m += s / 60;
		s = s % 60;
		if (s < 0) {
			s += 60;
		}
		h += m / 60;
		m = m % 60;
		if (m < 0) {
			m += 60;
		}
		h = h % 24;
		if (h < 0) {
			h += 24;
		}
	}
}
