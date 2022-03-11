
public class EquationSolver
{

	public static void main(String[] args)
	{
		double a, b, c ;
		Equation equation ;
		try 
		{
			/*
			 * on initialise les variables a, b et c dans le block 
			 * "try-catch" parce qu'il est probable qu'ils 
			 * puissent lancer une exception: otamment dans 
			 * la mesure où leur nombre serait différent de 3
			 * 
			 */
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]); 
			if(args.length != 3)
			{
				throw new ArrayIndexOutOfBoundsException("Call: java EquationSolver a b c");
			}		

			equation = new Equation(a, b, c);
			equation.solve();
			System.out.println("solution x1: " + equation.solve().getX1() + ", solution x2: " + equation.solve().getX2());
		
		}
		catch(NoQuadraticException ex) {
			System.out.println("No quadratic: a=0 not allowed");
		}
		catch(UnsolvableException ex) {
			System.out.println("Unsolvable: b*b - 4*a*c < 0");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Call: java EquationSolver a b c");
		}
		catch(IllegalArgumentException ex) {
			System.out.println("Illegal Argument: a, b or c illegal double value!");
		}
	}
}
