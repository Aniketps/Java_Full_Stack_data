// Q5. Write a java program to copy one array to another array.

import java.util.*;
public class CopyOneArrayToAnother
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter "+size+" numbers: ");
		for(int i = 0;i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array 1 : ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}

		// Copy array 1 to array 2
		int arr2[] = new int[size];
		for(int i = 0; i<size; i++)
		{
			arr2[i] = arr[i];
		}
		
		System.out.print("\nArray 2 : ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
}