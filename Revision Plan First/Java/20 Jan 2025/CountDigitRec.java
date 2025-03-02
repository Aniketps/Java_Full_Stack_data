// 2. Write a java program to count the digit of number using function recursion and return its count of number.

import java.util.*;

class CountDigitRec
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int num = sc.nextInt();
		sc.nextLine();
		int count = 0;
		
		System.out.println("The digit count in number "+num+" is "+CountDigits(num, count));
	}
	public static int CountDigits(int num, int count)
	{
		if(num <= 0)
		{
			return count;
		}
		else
		{
			count++;
			return CountDigits(num/10, count);
		}
	}
}