// Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class CheckNumerPalidrome
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int no, rev;
		System.out.print("Enter 5 digit number number : ");
		no = Ani.nextInt();
		rev = (no%10)*10000 + ((no/10) % 10) * 1000 +  ((no/100) % 10) * 100 + ((no/1000)%10) * 10 +no/10000;
		if(no == rev)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}
}