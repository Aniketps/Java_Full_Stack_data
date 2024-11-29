// 1. Write a program to sort the given array in descending array

import java.util.*;
public class SortArrayDesc
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter "+size+" elements: ");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Array : ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}

		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i + 1; j<arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nSorted array: ");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}	
}