// Merge Two Integer Arrays
// Write a class to write a method to merge two integer arrays into a single array.
// Explanation: Practice combining arrays and managing their sizes.


import java.util.*;
public class MergeArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size 1: ");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		System.out.print("\nEnter data : ");
		for(int i = 0; i<size1; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("What is array size 2: ");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.print("\nEnter data : ");
		for(int i = 0; i<size2; i++)
		{
			arr2[i] = sc.nextInt();
		}

		Merge obj = new Merge();
		obj.MergeData(arr1, arr2);
	}
}

class Merge
{
	int Size = 0;
	void MergeData(int[] ...d)
	{
		for(int i = 0; i<d.length; i++)
		{
			Size = Size + d[i].length;
		}
		int arr[] = new int[Size];
		int count = 0;
		for(int i = 0; i<d.length; i++)
		{
			for(int j = 0; j<d[i].length; j++)
			{
				arr[count] = d[i][j];
				count++;
			}
		}
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}	