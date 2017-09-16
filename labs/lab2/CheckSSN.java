//4.21
import java.util.Scanner;
public class CheckSSN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user to enter a Social Security number
		System.out.print("Enter a SSN: ");
		String ssn = input.nextLine();

		///Check whether the input is a valid SSN
		boolean isValid = 
				//make sure that the -'s are in the right places and the others are numbers
			(ssn.length() == 11) && 
			(Character.isDigit(ssn.charAt(0))) &&
			(Character.isDigit(ssn.charAt(1))) &&
			(Character.isDigit(ssn.charAt(2))) &&
			(ssn.charAt(3) == '-') &&
			(Character.isDigit(ssn.charAt(4))) &&
			(Character.isDigit(ssn.charAt(5))) &&
			(Character.isDigit(ssn.charAt(7))) &&
			(ssn.charAt(6) == '-') &&
			(Character.isDigit(ssn.charAt(8))) &&
			(Character.isDigit(ssn.charAt(9))) &&
			(Character.isDigit(ssn.charAt(10)));

		// say whether or not the input fits SSN format
		System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ")
			+ "social security number");
	}
}