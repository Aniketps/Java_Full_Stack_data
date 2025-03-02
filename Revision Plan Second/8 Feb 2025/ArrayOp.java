/*

1.Merge two sorted arrays
Merge two sorted arrays into a single sorted array.

Your Task : You  have to create class name as MergeSortedArray with following function 
Void setArray(int a[],int b[]): this function can two array as input 
void merge(): this function is responsible for merge two array 
 int [ ] getMergedArray(): this function can return merge array as resultant array

*/

import java.util.*;

class MergeSortedArray
{
	int a[];
	int b[];
	int arr[];
	int size = 0;
	void setArray(int a[],int b[])
	{
		this.a = a;
		this.b = b;
	}
	void merge()
	{
		arr = new int[a.length+b.length];
		for(int i = 0; i<a.length;i++)
		{
			arr[size] = a[i];
			size++;
		}
		for(int i = 0; i<b.length;i++)
		{
			arr[size] = b[i];
			size++;
		}
	}
	int [ ] getMergedArray()
	{
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}

class ArrayOp
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("First array size : ");
		int size = sc.nextInt();
		sc.nextLine();
		int arr1[] = new int[size];
		for(int i = 0; i<size; i++)
		{
			System.out.print(i+1+" element : ");
			arr1[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.print("Second array size : ");
		size = sc.nextInt();
		sc.nextLine();
		int arr2[] = new int[size];
		for(int i = 0; i<size; i++)
		{
			System.out.print(i+1+" element : ");
			arr2[i] = sc.nextInt();
			sc.nextLine();
		}
		
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		mergeSortedArray.setArray(arr1, arr2);
		mergeSortedArray.merge();
		System.out.println("Sorted Merged Array");
		for(int i : mergeSortedArray.getMergedArray())
		{
			System.out.print(i+" ");
		}
	}
}