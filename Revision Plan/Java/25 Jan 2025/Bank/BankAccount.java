import java.util.*;

class BankAccount
{
	private String AccountNumber;
	private int Balance;

	BankAccount()
	{
		AccountNumber = "17254685214562";
		Balance = 100;
	}

	void deposit()
	{
		Balance = Balance + 100;
	}

	void getBalance()
	{
		System.out.println("The balance is "+Balance);
	}
}