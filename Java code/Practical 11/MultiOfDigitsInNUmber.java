// Q 2. Write a java program to calculate product of digits of a number.

import java.util.*;
public class MultiOfDigitsInNUmber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num, rem , multi = 1;
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		while(num!=0)
		{
			rem = num%10;
			multi = rem  * multi;
			num = num/10;
		}
		System.out.println("the product of the digits is : " + multi);
	}
}