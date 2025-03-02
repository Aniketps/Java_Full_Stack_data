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
	int arr[];
	void setArray(int a[], int b[])
	{
		arr = new int[a.length + b.length];
		for(int i = 0; i<arr.length;i++)
		{
			if(i<a.length)
			{
				arr[i] = a[i];
			}
			else
			{
				arr[i] = b[i - b.length];
			}
		}
	}
	void sort()
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	int [ ] getMergedArray()
	{
		return arr;
	}
}

class ArrayMarge
{
	public static  void main(String ...a)
	{
		int x[] = {1,2,3,4,5};
		int y[] = {6,7,8,9,10};
		MergeSortedArray m = new MergeSortedArray();
		m.setArray(x,y);
		m.sort();
		for(int i : m.getMergedArray())
		{
			System.out.print(i+" ");
		}
	}
}