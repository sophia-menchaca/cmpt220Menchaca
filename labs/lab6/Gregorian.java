
import java.util.GregorianCalendar;
public class Gregorian {
	public static void main(String[] args) {
		//create GregorianCalendar object
		GregorianCalendar greg = new GregorianCalendar();

		// show today's date
		System.out.println();
		System.out.println("Current year, month, and day in format Mth/Day/Year: ");
		System.out.println("   " + (greg.get(greg.MONTH)) + "/" + (greg.get(greg.DAY_OF_MONTH)) 
				+ "/" + (greg.get(greg.YEAR)));

		// the elapsed time since January 1 1970 is 1234567898765L
		greg.setTimeInMillis(1234567898765L);

		System.out.println();
		System.out.println(
			"Elapsed time since January 1 1970 with value set to 1234567898765L:");
		System.out.println("   " + (greg.get(greg.MONTH) + "/" +
				greg.get(greg.DAY_OF_MONTH) + "/" + greg.get(greg.YEAR)));
	}
}