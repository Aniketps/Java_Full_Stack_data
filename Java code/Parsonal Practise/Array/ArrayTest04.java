// 5). Write a program to enter the 5 values in ascending order and store in array and find out the missing element from array?

import java.util.*;
public class ArrayTest04
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter 5 elements: ");
		for(int i = 0; i<5; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<5-1; i++)
		{
			for(int j = 0; j<5-i; j++)
			{
				if(arr[j]> arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i<5-1; i++)
		{
			if(arr[i]>0)
			{
				for(int j = 0; j<arr[i]; j++)
				{
					System.out.print(j+" ");
				}
			}
			else if(arr)
			{
				
			}
		}
	}
}