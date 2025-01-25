// Q.4 Write a java program to find odd index number from array.

import java.util.*;
public class FindOddIndexArrayElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter "+size+" elements : ");

		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
	
		for(int i = 0; i<size; i++)
		{
			if(i%2!=0)
			{
				System.out.println("Index "+i+" : "+arr[i]);
			}
		}
	}
}



