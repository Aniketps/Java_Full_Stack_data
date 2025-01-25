// 5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

import java.util.*;

class BankAccount
{
	static int amount = 100;
	public void deposit(int Amount)
	{
		amount = amount + Amount;
		System.out.println(Amount+" credited");
		System.out.println("Current balance is "+amount);
	}
	public void withdraw()
	{
		System.out.println("Bank Account called");
	}
}

class SavingsAccount extends BankAccount
{
	void withdraw(int money)
	{
		if(amount-money <100)
		{
			System.out.println("Can not withdraw money, The current balance is "+amount+", Please maintain balance above 100");
			return;
		}
		amount = amount - money;
		System.out.println(money+" debited");
		System.out.println("Current balance is "+amount);
	}
}

class ManageBankAccount
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1. Deposit money\n2. Withdraw money\n3. Exit");
			System.out.print("Make Choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			SavingsAccount savingsAccount = new  SavingsAccount();
			
			switch(choice)
			{
				case 1:
					System.out.print("The amount to be deposite : ");
					int dAmount = sc.nextInt();
					sc.nextLine();
					savingsAccount.deposit(dAmount);
					break;
				case 2:
					System.out.print("The amount to be withdrawal : ");
					int wAmount = sc.nextInt();
					sc.nextLine();
					savingsAccount.withdraw(wAmount);
					break;
				case 3:
					System.out.println("Thanks for using our service :)");
					System.exit(0);
					break;
			}
		}
	}
}	