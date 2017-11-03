
public class CheckingAccount
		extends Account {
	private double overdraftLimit;
	//make default checking account
	public CheckingAccount() {
		super();
		overdraftLimit = -20;
	}
	//make checkingaccount with id balance and overdraftlimit
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	//set and overdraft limit
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	//return overdraft limit
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	//subtract amount from balance
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error! Amount exceeds overdraft limit.");
	}
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + 
		String.format("%.2f", overdraftLimit);
	}
}