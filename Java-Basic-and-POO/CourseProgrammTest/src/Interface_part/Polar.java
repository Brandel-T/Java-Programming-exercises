package Interface_part;

public class Polar implements Complex {

	private final double distance;
	private final double phase;
	Polar(double d, double p) { distance = d; phase = p; }
	
	@Override
	public double getReal() { return distance*Math.cos(phase); }
	
	@Override
	public double getImage() { return distance*Math.sin(phase); }
	
	@Override
	public double getDistance() { return distance; }
	
	@Override
	public double getPhase() { return phase; } 
	
	@Override
	public Complex add(Complex a) { return null; }

	@Override
	public Complex mult(Complex a) { return null; } 
}
