package Interface_part;

public interface Complex {

	public double getReal();
	public double getImage();
	public double getPhase();
	public double getDistance();
	public Complex add(Complex a);
	public Complex mult(Complex a);
//	public Complex div(Complex a, Complex b);
//	public Complex sub(Complex a, Complex b);
}
