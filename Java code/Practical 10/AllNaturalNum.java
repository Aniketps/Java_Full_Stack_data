// 1. Write a java program to find all natural numbers between 1 to n.

import java.util.*;
public class AllNaturalNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter n : ");
		n = sc.nextInt();
		System.out.println("All natural Numbers from 1 to "+n);
		int StartPoint = 0;
		while(StartPoint != n)
		{
			StartPoint++;
			System.out.println(StartPoint);
		}
	}
}