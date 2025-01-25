// Q2. WAP to create class name as Factorial with two functions 
// void setNumber(): this function can accept the number as parameter
// void displayFactorial(): this function can display the factorial of number 

import java.util.*;

class Factorial
{
	int number;
	Scanner sc = new Scanner(System.in);
	void setNumber()
	{
		System.out.print("Enter A number : ");
		number = sc.nextInt();
	}
		
	void displayFactorial()
	{
		int total = 1;
		for(int i = number; i>0; i--)
		{
			total = total *  i;
		}
		System.out.print("Factorial is "+total);
	}
}

public class CalFactorial
{
	public static void main(String ...x)
	{
		Factorial obj = new Factorial();
		obj.setNumber();
		obj.displayFactorial();
	}
}