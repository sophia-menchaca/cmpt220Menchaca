import java.util.Scanner;
public class LinearEquationPart2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//have user assign variables a through f
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();//turn all into doubles
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		// Create a LinearEquation object
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		System.out.println( "The variables were plugged into the following equations:"
				+ "\nax + by = e \ncx + dy = f \nx = (ed - bf) / (ad - bc) \ny = (af - ec) / (ad - bc)");
		if (linearEquation.isSolvable()) {//if the boolean true, then solve
			System.out.println("Solution: x = " + linearEquation.getX() +
				" and y = " + linearEquation.getY());
		}
		else//if boolean is false then the equation cannot be solved
			System.out.println("The equation cannot be solved with the given variables.");
	}
}
//UML Chart
/**
 * LinearEquation
 * 
 * a: double
 * b: double
 * c: double
 * d: double
 * e: double
 * f: double
 * 
 * linearEquation(double x6)
 * getA():double
 * getB():double
 * getC():double
 * getD():double
 * getE():double
 * getF():double
 * isSolvable():boolean
 * getX():double
 * getY():double
 */
 