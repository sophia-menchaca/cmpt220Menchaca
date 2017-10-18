public class AccountPart2 {
	public static void main(String[] args) {
		// make account object
		Account account = new Account(1122, 20000);

		// annual interest rate 4.5%, withdraw 2500, deposit 3000
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);

		// Display the balance, the monthly interest, 
		// and the date when this account was created
		System.out.println("Account ID: " + account.getId());
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Monthly interest: $" + account.getMonthlyInterest());
		System.out.println("Date made: " + account.getDateCreated());
	}
}
//UML Chart
/*
 * Account
 * 
 * -Id: int
 * -balance: double
 * -annualInterestRate: double
 * -dateCreated: Date
 * 
 * +Account()
 * +withdraw(double)
 * +deposit(double)
 * +setId(int)
 * +setBalance(double)
 * +setAnnualInterestRate(double)
 * +getId()
 * +getBalance()
 * +getAnnualInetrestRate()
 * +GetMonthlyInterestRate()
 * +getDateCreated()
 * */
 
