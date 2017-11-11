import java.util.Scanner;
public class IllegalTriangleException2 {
	public static void main(String[] args) {
	//an example of a valid triangle is (3, 4, 5)
	// an invalid triangle is (3, 300, 7)
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Three Double Side: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		
		
		try{
			double result = Triangle( side1, side2, side3);
			System.out.println("Valid triangle sides");
		
		}
		catch(Exception e){
			System.out.println("Exception: Invalid Triangle Side Numbers");
		}
		
		class IllegalTriangleException extends Exception {
			    //we set the variables to be used in the subclass
			    protected double side1;
			    protected double side2;
			    protected double side3;
		}
	
	}
	//set what the exception is
	public static double Triangle(double side1, double side2, double side3){
	//	if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1) {
	
		if((side1+side2)<side3 || (side1+side3)<side2 || (side2+side3)<side1) {
			throw new IllegalArgumentException("INValid Triangle Side Numbers");
		}
		return 0;
	}
}
