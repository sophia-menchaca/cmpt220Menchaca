
public class SavingsAccount
		extends Account {
	//make default svings account
	public SavingsAccount() {
		super();
	}
	//give account id and balance
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	//subtract amount from balance
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println(
				"Error! Savings account overdrawn transtaction rejected");
	}
}