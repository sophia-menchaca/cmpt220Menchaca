//this is the test program part of problem 9.1
//this code uses the rectangleA class from Rectangle.java
//UML chart at bottom in comment
public class RectanglePart2 {
	public static void main(String[] args) {
		// rectangle width 4 and height 40
		rectangleA rectangle1 = new rectangleA(4, 40);

		// rectangle height 35.9 and width 3.5
		rectangleA rectangle2 = new rectangleA(3.5, 35.9);

		//retcangle1
		System.out.println("Rectangle 1");
		System.out.println("Width:" + rectangle1.width);
		System.out.println("Height:" + rectangle1.height);
		System.out.println("Area:" + rectangle1.getArea());
		System.out.println("Permieter:" + rectangle1.getPerimeter());
		// rectangle2
		System.out.println("Rectangle 2");
		System.out.println("Width:" + rectangle2.width);
		System.out.println("Height:" + rectangle2.height);
		System.out.println("Area:" + rectangle2.getArea());
		System.out.println("Perimeter:" + rectangle2.getPerimeter());
	}
}
//UML chart
/*Rectangle
 * 
 * Width: double
 * Height: double
 * 
 * rectangleA()
 * rectangleA(double newWidth, double newHeight)
 * getArea()
 * getPerimeter()
 */
