import java.util.Scanner;
import java.util.ArrayList;

public class SortArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// make an array list of integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 5 numbers from user
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
		//sort numbers
		sort(list);
		//display list
		System.out.println(list.toString());
	}

	//sort array list of integers
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}
}