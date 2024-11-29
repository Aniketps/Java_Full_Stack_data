// 3. Write a program to update a number by new number at given index

import java.util.*;
public class UpdateElementInArray
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
		
		System.out.print("\nOn which index to replace : ");
		int index = sc.nextInt();
	
		System.out.print("\nNew element : ");
		int newData = sc.nextInt();

		arr[index] = newData;

		System.out.print("\nNew Array : ");
		for(int i = 0; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}