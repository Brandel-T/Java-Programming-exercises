package Aufgabe4;

public class NormalParable extends Polynom {
	
	NormalParable () { 
		this.degree = 2;
	}
	
	public double derivativeValue(double x) { 
		return 2*x;
	}
  
	public double value(double x) { 
		return x*x;
	}
 
	int grad() { 
		return this.degree;
	}
}
