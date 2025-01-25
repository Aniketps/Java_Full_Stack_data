// Write a java program to find sum of all natural numbers between 1 to n.

import java.util.*;
public class SumOfAllNaturalNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		System.out.print("Enter end number : ");
		n = sc.nextInt();
		System.out.println("Sum of numbers from 1 to "+n);
		int StartPoint = 0;
		while(StartPoint != n)
		{
			StartPoint++;
			sum = sum + StartPoint;
		}
		System.out.println(sum);
	}
}