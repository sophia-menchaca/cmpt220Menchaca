
import java.util.Scanner;
public class PhysicsAcceleration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create a Scanner 

		// Prompt the user to enter the start velocity (v0) 
		// The end velocity (v1) in meters/second, and the time t in seconds.
		System.out.print(&quot;Enter v0, v1 and t: &quot;);
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();

		// Calculate the average acceleration
		double a = (v1 - v0) / t;

		// Display result
		System.out.println(&quot;The average acceleration is &quot; + a);
    }
}

