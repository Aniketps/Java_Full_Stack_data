// Write a java program to find maximum between two numbers

import java.util.*;
public class FindMax
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num1, num2, max;
		System.out.print("Enter First number : ");
		num1 = Ani.nextInt();
		System.out.print("Enter Second number : ");
		num2 = Ani.nextInt();
		max = num1 > num2? num1 : num2;
		System.out.println("The max number is : "+ max);
	}
}