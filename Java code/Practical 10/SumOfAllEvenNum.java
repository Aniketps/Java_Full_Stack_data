// 7. Write a java program to find sum of all even numbers between 1 to n.

import java.util.*;
public class SumOfAllEvenNum
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
			if((StartPoint%2)==0){
				sum = sum + StartPoint;
			}	
		}
		System.out.println(sum);
	}
}