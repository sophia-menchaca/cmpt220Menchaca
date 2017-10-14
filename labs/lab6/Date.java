public class Date {
	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();//create the date object

		// show date and time as provided from the util.date 
		//the elapsed times are 1 with 4 zeros to 1 with 11 zeros
		System.out.println("The dates and times for the elapsed times of" +
		"10000,100000,1000000,10000000,100000000,1000000000,10000000000, and 100000000000");
		for (long i = 10000; i <= 1e11; i *= 10) {//1e11 is 1 with 11 0's, new i is 10 times last
			date.setTime(i);
			System.out.println(date.toString());//use to string method
		}
	}
}