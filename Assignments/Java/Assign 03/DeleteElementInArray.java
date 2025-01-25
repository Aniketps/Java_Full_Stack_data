// 2. Write a program to delete element present at given index

import java.util.*;
public class DeleteElementInArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("\nEnter elements : ");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\nOn which index to delete : ");
		int index = sc.nextInt();
	
		for(int i = index; i<arr.length - 1; i++)
		{
			arr[i] = arr[i+1];
		}

		System.out.print("\nNew Array : ");
		for(int i = 0; i<arr.length - 1; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}