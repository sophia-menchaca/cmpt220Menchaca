// JA: You forgot to print the pounds
public class KilogramToPound {
	public static void main(String[] args) {
		// Create constant value for number of pounds per kilogram
		final double POUNDS_PER_KILOGRAM = 2.2;

		// Display table header
		System.out.println(
			"Kilograms    Pounds");
		for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
			System.out.println(
				 (k * POUNDS_PER_KILOGRAM));
			System.out.print("     |     ");
			System.out.println( 
				(p / POUNDS_PER_KILOGRAM));
		}
	}
}