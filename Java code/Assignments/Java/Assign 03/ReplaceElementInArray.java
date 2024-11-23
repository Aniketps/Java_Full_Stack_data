// 4. Write a program to replace a particular element by a value

import java.util.*;
public class ReplaceElementInArray
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
		
		System.out.print("\nOn which element to replace : ");
		int oldData = sc.nextInt();
	
		System.out.print("\nNew element : ");
		int newData = sc.nextInt();
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]==oldData)
			{
				arr[i] = newData;
			}
		}

		System.out.print("\nNew Array : ");
		for(int i = 0; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}