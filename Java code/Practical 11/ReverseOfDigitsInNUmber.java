// Q 3. Write a java program to enter a number and print its reverse.

import java.util.*;
public class ReverseOfDigitsInNUmber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, rem , rev = 0;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		while(num!=0)
		{
			rem = num%10;
			rev = (rev  * 10) + rem;
			num = num/10;
		}
		System.out.println("the reversed number is : " + rev);
	}
}