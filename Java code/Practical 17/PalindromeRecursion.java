// Write a Java program to check whether a number is palindrome or not using recursion.


import java.util.*;

public class PalindromeRecursion
{
	public static void main(String x[])
	{
		Scanner sc  = new Scanner(System.in);
		int count = 0, num, divider = 1;
		num = sc.nextInt();
		int dummy1 = num;
		while(dummy1>0)
		{
			count++;
			dummy1 = dummy1 /10;
		}
		if(count%2==0)
		{
			// Even
			int dummy = num;
			while(dummy>0)
			{
				dummy = dummy/10;
			}
			int half = count/2;
			for(int i = 1; i<=half; i++)
			{
				divider = divider * 10;
			}
			int first = num/divider;
			int second = num%divider;
			int rev = 0, rem;
			while(second>0)
			{
				rem = second%10;
				rev = (rev * 10) + rem;
				second = second/10;
			}
			if(rev == first)												
			{
				System.out.print("The number is Pa");
			}
			else
			{
				System.out.print("The number is not Pa");
			}
		}
		else
		{
			// Odd
			int dummy = num;
			while(dummy>0)
			{
				dummy = dummy/10;
			}
			int half = count/2;
			for(int i = 1; i<=half; i++)
			{
				divider = divider * 10;
			}
			int first = num/(divider*10);
			int second = num%(divider);
			int rev = 0, rem;
			while(second>0)
			{
				rem = second%10;
				rev = (rev * 10) + rem;
				second = second/10;
			}
			if(rev == first)												
			{
				System.out.print("The number is Pa");
			}
			else
			{
				System.out.print("The number is not Pa");
			}
		}
	}
}