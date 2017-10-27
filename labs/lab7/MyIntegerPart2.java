
public class MyIntegerPart2 {
	public static void main(String[] args) {
		// Create an array of test values
		int[] values = {1, 2, 3, 4, 5}; 

		//isEven(int)
		System.out.println("\nTest if values are even using isEven(int):");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
		}
		//isOdd
		System.out.println("\nTest if values are odd using isOdd(int):");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
		}
		//isPrime
		System.out.println("\nTest if values are prime using isPrime(int):");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
		}

		//MyInteger(), isEven(), isOdd(), isPrime() and getValue()
		System.out.println("\nTest if values are even using isEven():");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + value.isEven());
		}

		System.out.println("\nTest if values are odd using isOdd():");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + value.isOdd());
		}

		System.out.println("\nTest if values are prime using isPrime():");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + value.isPrime());
		}

		// Test isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
		System.out.println("\nTest if values are even using isEven(MyInteger):");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isEven(value));
		}

		System.out.println("\nTest if values are odd using isOdd(MyInteger):");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
		}

		System.out.println("\nTest if values are prime using isPrime(MyInteger):");
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
		}

		// Test equals(int) and equals(MyInteger)
		int[] values2 = {5, 9, 7};
		MyInteger value = new MyInteger(9);
		System.out.println("\nTest if " + value.getValue() + 
			" is equal to the specified value:");
		for (int i = 0; i < values2.length; i++) {
			System.out.println(values2[i] + " " + value.equals(values2[i]));
		}

		System.out.println("\nTest if " + value.getValue() + 
			" is equal to the specified value:");
		for (int i = 0; i < values2.length; i++) {
			MyInteger myInteger = new MyInteger(values2[i]);	
			System.out.println(values2[i] + " " + value.equals(myInteger));
		}

		//parseInt(char[]) and parseInt(String)
		System.out.println("\nTest parseInt(char[]) and parseInt(String):");
		char[] numericCharacters = {'1', '5', '4','4'};
//add 1544 and 8456
		String numericString = "8456";
		System.out.print("\'");
		for (int i = 0; i < numericCharacters.length; i++) {
		 	System.out.print(numericCharacters[i] + "");
		} 
		System.out.println("\' + \"" + numericString + "\" = " + 
			(MyInteger.parseInt(numericCharacters) + 
			MyInteger.parseInt(numericString)));
	}
}