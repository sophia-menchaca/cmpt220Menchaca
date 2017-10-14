import java.util.Scanner;
public class LocationPart2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		// have user give 2 dimentional array
		System.out.println("Type how many rows and columns you want in your array and then press enter: ");
		int c = input.nextInt();
		int r = input.nextInt();

		// create the array
		double[][] array = new double[r][c]; 
		System.out.println("Enter numeric values to fill your array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		} Location max = locateMax(array);//add 1 to max because it will give you (0,0) for first column otherwise
		
		//printMatrix(r,c);
		/*
		public static void printMatrix(int r, int c) {
			for (int rows = 0; rows < r; rows++) {
				for (int cols = 0; cols < c; cols ++) {
					// Generate and print randomly 0 or 1
					System.out.print(array[i][j]);
				}
				// Print newline
				System.out.println();
			}
		}*/
		
		//If I wanted to print the matrix, how would I go about doing that in the code?
		
		System.out.println("The maximal value is " +
			max.maxValue + " at (" + (max.row + 1) + ", " + (max.column + 1) + ")");
	} 
	public static Location locateMax(double[][] a) {
		return new Location(a);
	}
	/*	print(array);
	public static void print(double[][] m, int r) {	
		for (int j = 0; j < m[r].length; j++) {
			System.out.print(m[r][j] + " ");
		}	
	*/
	
	
} //UML Chrat
/*
 * Location
 * 
 * row: int
 * column: int
 * maxValue: double
 * 
 * Location(double[][])
 * */
 
