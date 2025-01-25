// 8. Write a java program to sum of all odd number between 1 to n

import java.util.*;
public class SumShowOddNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n, sum = 1;
		System.out.println("Enter n : ");
		n = sc.nextInt();
		System.out.println("1 To "+n+" odd numbers");
		int StartPoint = 1;
		while(StartPoint != n)
		{
			StartPoint++;
			if((StartPoint%2)!=0){
				sum = sum + StartPoint;
			}
		}
		System.out.println(sum);
	}
}