// Q 1. Write java program to sort array in ascending and descending order.

import java.util.*;
public class SortArrayInAsceDesc
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter "+size+" elements : ");
		for(int i = 0; i< size; i++)
		{
			arr[i] = sc.nextInt();
		}
	
		System.out.print("Ascending Array : ");
		// ascending
		for(int i = 0; i<size-1; i++)
		{
			for(int j = i+1; j<size; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}

		// descending
		for(int i = 0; i<size-1; i++)
		{
			for(int j = i+1; j<size; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("\nDescending Array : ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}