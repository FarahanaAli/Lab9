
// ************************************************************
// ManageAccounts.java
//
// Use Account class to create and manage Sally and Joe's
// bank accounts
// ************************************************************
public class ManageAccounts
{
	public static void main(String[] args)
	{
		Account acct1, acct2;
		//create account1 for Sally with $1000
		acct1 = new Account(1000, "Sally", 1111);
		
		//create account2 for Joe with $500
		acct2 = new Account(500,"Joe",1112);
		
		//deposit $100 to Joe's account by calling certain method
		acct2.deposit(100);
		
		//print Joe's new balance (use getBalance())
		System.out.println(acct2.getBalance());
		
		//your code here: withdraw $50 from Sally's account
		
		//your code here: print Sally's new balance (use getBalance())
		
		//your code here: charge fees to both accounts
		
		//your code here: change the name on Joe's account to Joseph
		
		//your code here: print both acct1 and acct2
	}
}