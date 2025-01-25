// Write a java program to set a given number is positive or negative using if else

import java.util.*;

public class CheckPositiveNegativeIfElse
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num;
		System.out.print("Enter Number : ");
		num = Ani.nextInt();
		if(num>0)
			{
				System.out.println(num + " is positive");
			}
		else
			{
				System.out.println(num + " is negative");
			}
	}
}