// Write a java program to print all even numbers between 1 to 100.

import java.util.*;
public class ShowEvenNum
{
	public static void main(String x[])
	{
		System.out.println("1 To 100 even numbers");
		int StartPoint = 1;
		while(StartPoint != 100)
		{
			StartPoint++;
			if((StartPoint%2)==0){
				System.out.println(StartPoint);
			}
		}
	}
}