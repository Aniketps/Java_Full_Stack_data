// Write a java program to reverse a number


import java.util.*;
public class ReverseNumberThreeDigit
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num, result;
		System.out.print("Enter Number : ");
		num = Ani.nextInt();
		result = (num%10) * 100 + ((num/10)%10) * 10 + (num/100);
		System.out.println("The reverse number is : " + result);
	}
}