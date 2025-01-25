/*

1. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.

*/

import java.util.*;

class Calculator
{
	private int a;
	private int b;
	
	void setData(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	int add()
	{
		return a+b;
	}
	int mul()
	{
		return a*b;
	}
	int sub()
	{
		return a-b;
	}
	float div()
	{
		if(b==0)
		{
			System.out.println("Cant Divide by 0");
			return 0;
		}
		return a/b;
	}
}

class CalApp
{
	public static void main(String ...a)
	{
		Calculator calculator = new Calculator();
		calculator.setData(20, 10);
		System.out.println("The addition is "+calculator.add());
		System.out.println("The substraction is "+calculator.sub());
		System.out.println("The multiplication is "+calculator.mul());
		System.out.println("The division is "+calculator.div());
	}
}