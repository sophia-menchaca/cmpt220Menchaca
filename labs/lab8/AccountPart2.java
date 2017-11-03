
public class AccountPart2 {
	public static void main(String[] args) {
		//make all acount objects
		Account account = new Account(1122, 20000);
		SavingsAccount savings = new SavingsAccount(1001, 20000);
		CheckingAccount checking = new CheckingAccount(1004, 20000, -20);
		//set annual interest rate to 4.5
		account.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);

		//withdraw 2,500
		account.withdraw(2500);
		savings.withdraw(2500);
		checking.withdraw(2500);

		//deposit 3,000
		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}

//UML DIAGRAMS
/*
*                     Account                           
* -id: int                                              
* -balance: double                                      
* -annualInterestRate: double                           
* ---------------------------                           
* -dateCreated: String                                  
* +Account()                                            
* +Account(newid: int, newBalance: double)              
* +setId(newId: int)                                    
* +setBalance(newBalance: double)                       
* +setAnnualInterestRate(newAnnualInterestRate: double) 
* +getId(): int                                         
* +getBalance(): double                                 
* +getAnnualInterestRate(): double                      
* +getDateCreated(): String                             
* +getMonthlyInterestRate(): double                     
* +getMonthlyInterest(): double                         
* +withdraw(amount: double)                             
* +deposit(amount: double)                              
*/

/*
*                              CheckingAccount                             
* -overdraftLimit: double                                                  
* +CheckingAccount()                                                       
* +CheckingAccount(newId: int, newBalance: double, overdraftLimit: double) 
* +setOverdraftLimit(overdraftLimit: double): void                         
* +getOverdraftLimit(): double                                             
* +withdraw(amount: double): boolean                                       
* +toString(): String                                             
* */

/*
*          SavingsAccount            
* +SavingsAccount()                  
* +withdraw(amount: double): boolean 
*/