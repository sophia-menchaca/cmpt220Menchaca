//4.9
import java.util.Scanner;
public class UnicodeOfCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a character
		System.out.print("Enter a character: ");
		String a = input.nextLine();
		char ch = a.charAt(0);

		// Display Unicode of the character
		System.out.println((int)ch);
	}
}