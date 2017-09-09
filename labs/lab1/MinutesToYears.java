import java.util.Scanner;
public class MinutesToYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter minutes
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		// Compute the number of years and days
		//There are 525600 minutes in one year approx
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;

		// Display results
		System.out.println(minutes + " minutes is approximately " + years
			+ " years and " + days + " days");
    }
}

