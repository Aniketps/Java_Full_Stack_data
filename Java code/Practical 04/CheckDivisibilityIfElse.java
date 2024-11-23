// Write a java program to check whether a year is leap year or not.

import java.util.*;
public class CheckDivisibilityIfElse
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int year;
		System.out.print("Enter year : ");
		year = Ani.nextInt();
		if(year%400 == 0 || (year%4 == 0 && year%100==0))
		{
			System.out.println("The year is leap");
		}
		else
		{
			System.out.println("The year is not leap");
		}
	}
}