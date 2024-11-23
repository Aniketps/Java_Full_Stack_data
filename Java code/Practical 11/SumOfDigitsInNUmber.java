// Q 1. Write a java program to calculate sum of digits of a number. 

import java.util.*;
public class SumOfDigitsInNUmber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, rem , sum = 0;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		while(num!=0)
		{
			rem = num%10;
			sum = rem +sum;
			num = num/10;
		}
		System.out.println("the sum of the digits is : " + sum);
	}
}