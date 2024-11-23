// 9. Write a program to print multiplication table of any number

import java.util.*;
public class Table
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n, Table = 1;
		System.out.println("Enter num : ");
		n = sc.nextInt();
		int StartPoint = 1;
		while(StartPoint != 10)
		{
			StartPoint++;
			Table = n * StartPoint;
			System.out.println(Table);
		}
	}
}