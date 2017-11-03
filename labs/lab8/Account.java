
import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	// make default account
	Account() {
		this(0, 0); 
	}
	//make account with id and initial balance
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	// set id
	public void setId(int id) {
		this.id = id;
	}
	//set balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//set annual interest rate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//return id
	public int getId() {
		return id;
	}
	//return balance
	public double getBalance() {
		return balance;
	}
	//return annaul interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	//return date created
	public String getDateCreated() {
		return dateCreated.toString();
	}
	//return monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	//subtract amount from balance
	public void withdraw(double amount) {
		balance -= amount;
	}
	// add amount to balance
	public void deposit(double amount) {
		balance += amount;
	}
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance) + 
			"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}