/*

3. Bank Abstract Class
Problem: Create an abstract class Bank with the following methods:
deposit(double amount) — allows depositing an amount.
withdraw(double amount) — allows withdrawing an amount.
getBalance() — returns the current balance.
Then, create two subclasses:
SavingsBank — charges a fixed fee of $2 per transaction.
CurrentBank — charges a fixed fee of $5 per transaction.
Write a program that deposits and withdraws money from both types of banks and displays the balance after each transaction.
Explanation:
The abstract class Bank defines the common structure for the deposit, withdraw, and balance methods.
Each subclass applies a different transaction fee.
Logical operation: Use method overriding to show different transaction fees for each type of bank.

*/

import java.util.*;

abstract class Bank
{
	protected double amount;
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract void getBalance();
}

class SavingsBank extends Bank
{
	void deposit(double amount)
	{
		System.out.println(amount+" Depositing .....");
		if(amount > 2 || this.amount > 2 || (amount + this.amount) > 2)
		{
			this.amount = (this.amount + amount) - 2;
			System.out.println(amount+" credited with 2$ service charge");
			return;
		}
		System.out.println("Cant e Service , Total amount is less than 2$");
	}
	void withdraw(double amount)
	{
		System.out.println(amount+" Withdrawing...");
		if((this.amount - amount) < 2)
		{
			System.out.println("Insufficient balance to pay 2$ service charge");
			return;
		}
		this.amount = (this.amount - 2) - amount;
		System.out.println(amount+" debited with 2$ service charge");
	}
	void getBalance()
	{
		System.out.println("Balance is "+amount);
	}
}

class CurrentBank extends Bank
{
	void deposit(double amount)
	{
		System.out.println(amount+" Depositing .....");
		if(amount > 5 || this.amount > 5 || (amount + this.amount) > 5)
		{
			this.amount = (this.amount + amount) - 5;
			System.out.println(amount+" credited with 5$ service charge");
			return;
		}
		System.out.println("Cant e Service , Total amount is less than 5$");	
	}
	void withdraw(double amount)
	{
		System.out.println(amount+" Withdrawing...");
		if((this.amount - amount) < 5)
		{
			System.out.println("Insufficient balance to pay 5$ service charge");
			return;
		}
		this.amount = (this.amount - 5) - amount;
		System.out.println(amount+" debited with 5$ service charge");
	}
	void getBalance()
	{
		System.out.println("Balance is "+amount);
	}
}

class ATM
{
	public static void main(String ...a)
	{
		System.out.println("Saving Acount");
		Bank atm = new SavingsBank();
		atm.deposit(500);
		atm.getBalance();
		atm.withdraw(20);
		atm.getBalance();
		atm.withdraw(480);

		System.out.println("\nCurrent Acount");
		atm = new CurrentBank();
		atm.deposit(500);
		atm.getBalance();
		atm.withdraw(20);
		atm.getBalance();
		atm.withdraw(480);
	}
}