// *******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
// *******************************************************
public class Account
{
	// Your code here: declare an instance variable called balance
	// Your code here: declare an instance variable called name;
	// Your code here: declare an instance variable called acctNum;
	// ---------------------------------------------
	//Constructor -- initializes balance, owner, and account number
	// --------------------------------------------
	public Account(double initBal, String owner, int number)
	{
		// Your code here: use the parameters to initialize instance variables
	}
	// --------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	// --------------------------------------------
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}
	// --------------------------------------------
	// Adds deposit amount to balance.
	// --------------------------------------------
	public void deposit(double amount)
	{
		balance += amount;
	}
	// --------------------------------------------
	// Returns balance.
	// --------------------------------------------
	public double getBalance()
	{
		return balance;
	}
	// --------------------------------------------
	// Returns a string containing the name, account number, and balance.
	// --------------------------------------------
	public String toString()
	{
		// YOUR CODE HERE;
	}
	// --------------------------------------------
	// Deducts $10 service fee //
	// --------------------------------------------
	public void chargeFee()
	{
		// YOUR CODE HERE;
	}
	// --------------------------------------------
	// Changes the name on the account
	// --------------------------------------------
	public void changeName(String newName)
	{
		// YOUR CODE HERE;
	}
}