// Write a java program check whether number is positive or negative.

import java.util.*;

public class CheckNumberType
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int num;
		System.out.print("Enter number :");
		num = Ani.nextInt();
		String result = num>=0? "The number is positive" : "The number is negative";
		System.out.println(result);
	}
}