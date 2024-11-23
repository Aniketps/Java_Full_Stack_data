// Q 4. Write a java program to check whether a number is palindrome or not

import java.util.*;
public class CheckPalidromeNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, rem , rev = 0;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int realNumber = num;
		while(num!=0)
		{
			rem = num%10;
			rev = (rev  * 10) + rem;
			num = num/10;
		}
		if(realNumber == rev)
		{
			System.out.println("The number " + realNumber + " is palindrome");
		}
		else
		{
			System.out.println("The number " + realNumber + " is not palindrome");
		}
	}
}