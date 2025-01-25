// 3. Create a BankAccount class
// Create a BankAccount class with fields accountNumber and balance.
// The default constructor should assign a fixed account number and balance.
// Add a method deposit() that increases the balance by a fixed amount, e.g., 100.
// Explanation: This teaches object initialization and the concept of modifying instance variables through methods.

import java.util.*;

class BankAccount
{
	// Account details
	int accountNumber;
	int balance;

	// Here is my default constructor
	BankAccount()
	{
		// default account details
		accountNumber = 1234;
		balance = 0;
	}
	
	// The method to increase balance by 100 each time call
	void Deposit()
	{
		balance+=100;
	}
	
	// Show the available balance
	void ShowBalance()
	{
		System.out.println("The balance in account "+accountNumber+" is "+balance);
	}
}

class Bank
{
	public static void main(String x[])
	{
		BankAccount bankAccount = new BankAccount();
		
		// Im depositing 100
		bankAccount.Deposit();
		// again 100 to test extra data
		bankAccount.Deposit();
		// My Account Balance
		bankAccount.ShowBalance();
	}
}