//this is part 2 to StackOfIntegers
import java.util.Scanner;

public class DisplayPrimeFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ask user for a positive integer
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		//give factors
		System.out.print("The smallest factors of " + number + " are: ");
		StackOfIntegers stack = new StackOfIntegers(); // Create a StackOfIntegers

		smallestFactors(number, stack);

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}
	public static void smallestFactors(int number, StackOfIntegers stack) {
		int i = 2; 
		while (number / i != 1){ 
			if (number % i == 0) {//check to see if prime
				stack.push(i);
				number /= i;
			}
			else
				i++;//move to next iteratiom
		}
		stack.push(number);
	}
}
