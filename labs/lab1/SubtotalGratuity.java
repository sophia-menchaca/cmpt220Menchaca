
import java.util.Scanner;

public class SubtotalGratuity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create new Scanner 

		// Prompt the user to enter the subtotal and the gratuity
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		// Calculate the grauiuty and total
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;

		// Show the final calculation
		System.out.println("The gratuity is $" + gratuity +
			" and total is $" + total);
    }
}

