public class Location {
	int row;
	int column;
	double maxValue;

	Location(double[][] a) {//2 dimentional array
		maxValue = a[0][0];
		row = 0;
		column = 0;
		for (int i = 0; i < a.length; i++) {//rows
			for (int j = 0; j < a[i].length; j++) {//columns
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
	}
}