
public class OctagonTest {
	/** Method method */
	public static void main(String[] args) throws CloneNotSupportedException {
		// Create octagon object
		Octagon octagon1 = new Octagon(3);

		// area and perimeter
		System.out.println("\nOctagon:\nArea: " + octagon1.getArea() + 
			"\nPerimeter: " + octagon1.getPerimeter());

		// new clone object
		System.out.println("Cloning Octagon...");
		Octagon octagon2 = (Octagon)octagon1.clone();

		// Compare the octagon to clone
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon is greather than its clone.");
		else if (result == -1)
			System.out.println("Octagon is less than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");
	}
}
