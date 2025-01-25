// Write a java program to check whether number is even or odd.

import java.util.*;
public class CheckEvenOrOdd
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num;
		System.out.print("Enter number : ");
		num = Ani.nextInt();
		
		String result = num%2==0? "The number is even": "The number is odd";
		System.out.println(result);
	}
}