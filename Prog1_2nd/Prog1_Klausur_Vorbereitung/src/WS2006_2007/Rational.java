package WS2006_2007;

public class Rational {
	
	protected long num, denom;
	
	Rational(long num, long denom) {
		this.num = num;
		this.denom = denom;
	}
	
	Rational sum(Rational b) {
		long res1 = (num * b.denom) + (b.num * denom);
		long res2 = denom * b.denom;
		return new Rational(res1, res2);
	}
	
	@Override
	public String toString() {
		return num +"/"+denom;
	}
}
