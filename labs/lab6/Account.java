import java.util.Date;
public class Account {//make the variables private so you can't change them
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	Account() {//make an account that you can edit and fill
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}

	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	//add required methods
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void setId(int newId) {//so you can set an id from somewhere else
		id = newId;
	}
	public void setBalance(double newBalance) {//can set amount of money in account from out of class
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	public int getId() {//gives id number
		return id;
	}
	public double getBalance() {//give ballance
		return balance;
	}
	public double getAnnualInterestRate() {//will plug in 4.5 later
		return annualInterestRate;
	}
	public double getMonthlyInterestRate() {//take annual and divide by 12 for month
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	public String getDateCreated() {
		return dateCreated.toString();
	}
}