//4.23
import java.util.Scanner;
public class PayrollApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompt user to enter the payroll info
		System.out.print("Enter employee’s name: ");
		String name = input.next();	
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();

		// Display payroll statement
		double grossPay, federal, state, totalDeducted;
		System.out.print(
			"Employee Name: " + name + 
			"\nHours Worked: " + hoursWorked +
			"\nPay Rate: $" + hourlyPayRate +
			"\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) +
			"\nDeductions:\n   Federal Witholding (20.0%): $" +
			(federal = grossPay * federalTaxRate) +
			"\n   State Witholding (9.0%): $" + (state = grossPay * stateTaxRate) +
			"\n   Total Deduction: $" + (totalDeducted = federal + state) +
			"\nNet Pay: $" + (grossPay - totalDeducted)
			);
	}
}