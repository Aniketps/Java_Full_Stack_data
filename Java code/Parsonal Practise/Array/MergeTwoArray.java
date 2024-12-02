// Q7. Write a java program to merge two array and display it.

import java.util.*;
public class MergeTwoArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is size of array 1: ");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		System.out.print("Enter "+size1+" numbers: ");
		for(int i = 0;i<size1; i++)
		{
			arr1[i] = sc.nextInt();
		}

		System.out.print("What is size of array 2: ");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.print("Enter "+size2+" numbers: ");
		for(int i = 0;i<size2; i++)
		{
			arr2[i] = sc.nextInt();
		}

		int arr3[] = new int[size1+size2];
		for(int i = 0; i<size1; i++)
		{
			arr3[i] = arr1[i];
		}
		for(int i = size1, j = 0; i<size1+size2; i++, j++)
		{
			arr3[i] = arr2[j];
		}

		System.out.print("\nMerged array 3: ");
		for(int i = 0; i<arr3.length; i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
}