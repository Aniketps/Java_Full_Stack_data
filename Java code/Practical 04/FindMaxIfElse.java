// Write a java program to find maximum between two numbers.


import java.util.*;
public class FindMaxIfElse
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num1, num2;
		System.out.print("Enter number 1 : ");
		num1 = Ani.nextInt();
		System.out.print("Enter number 2 : ");
		num2 = Ani.nextInt();
		if(num1 > num2)
		{
			System.out.println(num1 + " is greater than " + num2);
		}
		else
		{
			System.out.println(num2 + " is greater than " + num1);
		}
	}
}