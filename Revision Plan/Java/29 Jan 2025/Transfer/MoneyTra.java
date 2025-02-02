/*

4. Customer Abstract Class
Problem: Create an abstract class Customer with the following methods:
·        addTransaction(double amount) — adds a transaction amount.
·        getBalance() — returns the current balance.
Then, create two subclasses:
·        PremiumCustomer — offers a 10% discount on all transactions.
·        RegularCustomer — no discount on transactions.
Write a program that adds transactions for both types of customers and shows their final balance after applying the discount.
Explanation:
·        The abstract class Customer provides methods for adding transactions and checking balances.
·        Each subclass implements the transaction logic differently by applying a discount.
·        Logical operation: Method overriding to apply discounts and track customer balances.

*/

import java.util.*;

abstract class Customer
{
	double amount = 10000;
	abstract void addTransaction(double amount);
	abstract double getBalance();
}

class PremiumCustomer extends Customer
{
	void addTransaction(double amount)
	{
		System.out.println("Transferring "+amount);
		amount = (amount * 90)/100;
		if(this.amount == 0 || amount > this.amount)
		{
			System.out.println("Insufficient balance");
			return;
		}
		this.amount = this.amount - amount;
		System.out.println(amount+" transferred");
	}
	double getBalance()
	{
		return amount;
	}
}

class RegularCustomer extends Customer
{
	void addTransaction(double amount)
	{
		System.out.println("Transferring "+amount);
		if(this.amount == 0 || amount > this.amount)
		{
			System.out.println("Insufficient balance");
			return;
		}
		this.amount = this.amount - amount;
		System.out.println(amount+" transferred");
	}
	double getBalance()
	{
		return amount;
	}
}

class MoneyTra
{
	public static void main(String ...a)
	{
		System.out.println("Premium Acocunt 10% off");
		Customer customer = new PremiumCustomer();
		customer.addTransaction(1000);
		System.out.println("Balance is : "+customer.getBalance());
		customer.addTransaction(1000);
		System.out.println("Balance is : "+customer.getBalance());
		
		System.out.println("\nRegular Acocunt");
		customer = new RegularCustomer();
		customer.addTransaction(1000);
		System.out.println("Balance is : "+customer.getBalance());
		customer.addTransaction(1000);
		System.out.println("Balance is : "+customer.getBalance());
		
	}
}