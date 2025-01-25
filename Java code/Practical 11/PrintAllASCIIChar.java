// Q 5. Write a java program to print all ASCII character with their values.

import java.util.*;
public class PrintAllASCIIChar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int startPoint = 32;
		while(startPoint!=128)
		{
			System.out.println("ASCII value is " + startPoint + " and Char is "+ (char) startPoint);
		startPoint++;
		}
	}
}