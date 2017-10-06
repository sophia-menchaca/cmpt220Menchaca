import java.util.Scanner;

public class SortedOrNot {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt there user a list
		System.out.print("Enter list of numbers: ");
		int[] list = new int[input.nextInt()];
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();

		// Displays whether the list is sorted or not.
		System.out.println(
			"The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
	}

	/** isSorted returns true if the list is already sorted 
	*   in increasing order. Otherwise false */
	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}
}