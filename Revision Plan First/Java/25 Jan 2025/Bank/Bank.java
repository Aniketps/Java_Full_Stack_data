/*

1. Create a BankAccount class
Create a BankAccount class with fields accountNumber and balance.
The default constructor should assign a fixed account number and balance.
Add a method deposit() that increases the balance by a fixed amount, e.g., 100.
Explanation: This teaches object initialization and the concept of modifying instance variables through methods.

*/

import java.util.*;

class Bank
{
	public static void main(String ...a)
	{
		BankAccount bankAccount = new BankAccount();
		bankAccount.deposit();
		bankAccount.getBalance();
	}
}