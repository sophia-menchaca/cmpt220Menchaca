import java.util.Scanner;
public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		//an example of an index that is out of bounds is 123, or anything >=100
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Invoke getArray method
		int[] array = getArray();
		//get user index
		System.out.print("Enter a number for the index of the array you want to know: ");
		int index=input.nextInt();
		try {
			//show value at index
			System.out.println("The value at the index " + index + " is "  + 
				array[index]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index out of bounds.");
		}
	}
//put 100 random ints into array
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}