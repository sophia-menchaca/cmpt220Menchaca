
public class Triangle 
		extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	//default triangle
	Triangle() {
		side1 = side2 = side3 = 1.0;
	}
	//designate 3 sides
	Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public static boolean isTriangleValid(double side1, double side2, double side3) {
		 if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1) {
			 return true;
		}else {
			return false;
	    }
    }

	//return area
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	//return perimeter
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}
}