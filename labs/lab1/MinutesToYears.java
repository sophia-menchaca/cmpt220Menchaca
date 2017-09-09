import java.util.Scanner;
public class MinutesToYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter minutes
		System.out.print(&quot;Enter the number of minutes: &quot;);
		int minutes = input.nextInt();

		// Compute the number of years and days
		//There are 525600 minutes in one year approx
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;

		// Display results
		System.out.println(minutes + &quot; minutes is approximately &quot; + years
			+ &quot; years and &quot; + days + &quot; days&quot;);
    }
}

