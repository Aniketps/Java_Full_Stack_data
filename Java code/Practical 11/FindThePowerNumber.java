// Q 6. Write a java program to find power of a number.

import java.util.*;
public class FindThePowerNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, power, result = 1;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		System.out.print("Enter a power : ");
		power = sc.nextInt();
		int startPoint = 0;
		while(power!=startPoint)
		{
			result = result * num;
			startPoint++;
		}
		System.out.println("Result is  : " + result);
	}
}