// Write a java program to print all alphabets from a to z.

import java.util.*;
public class AlphabetAToZ
{
	public static void main(String x[])
	{
		char StartPoint = 'a';
		System.out.println("a to z alphabets");
		System.out.println("a");
		while(StartPoint != 'z')
		{
			StartPoint++;
			System.out.println(StartPoint);
		}
	}
}