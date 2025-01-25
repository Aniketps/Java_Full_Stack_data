// Write a java program to check whether a number is divisible by 5 and 11 or not.

import java.util.*;

public class CheckDivisibility
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num;
		System.out.print("Enter number : ");
		num = Ani.nextInt(); 
		String result = (num%5)==0 && (num&8)==0? "The number is divisible by 5 and 8" : "The number is not divisible by both";
		System.out.println(result);
	}
}