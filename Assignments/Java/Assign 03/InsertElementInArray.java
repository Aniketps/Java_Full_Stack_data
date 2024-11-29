// 1. Write a program to insert a element at given index

import java.util.*;
public class InsertElementInArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("\nEnter elements : ");
		for(int i = 0; i<size-1; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.print("\nWhich is new element: ");
		int newData = sc.nextInt();
		
		System.out.print("\nOn which index to insert : ");
		int index = sc.nextInt();
	
		for(int i = arr.length-1; i>index; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[index] = newData;

		System.out.print("\nNew Array : ");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}