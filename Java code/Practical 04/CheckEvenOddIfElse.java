// Write a java program to check whether number is even or odd.


import java.util.*;
public class CheckEvenOddIfElse
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num;
		System.out.print("Enter number : ");
		num = Ani.nextInt();
		if(num%2 == 0)
		{
			System.out.println(num + " is even number");
		}
		else
		{
			System.out.println(num + " is odd number");
		}
	}
}