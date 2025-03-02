/*

2. Find the longest increasing subsequence
Given an array, find the length of the longest increasing subsequence.
To find the Longest Increasing Subsequence (LIS) in an array, we need to identify the longest subsequence in which each element is strictly greater than the previous one.
Your Task: you have to create class name as FindLongSequence with two methods 
void setValue(int a[]): this function is used for accept array as parameter
Void findLongSubSequence(): this function can help us to find longest subsequence 
Int [] getArray(): this function can return longest subsequence of array

*/

import java.util.*;

class FindLongSequence
{
	int arr[];
	int arrr[];
	int current = 0;
	void setValue(int a[])
	{
		this.arr = a;
	}
	void findLongSubSequence()
	{
		arrr = new int[arr.length];
		for(int i = 0; i<arr.length; i++)
		{
			int arr1[] = new int[arr.length];
			int current1 = 0;
			arr1[current1] = arr[i];
			for(int j = i; j<arr.length - 1; j++)
			{
				if(arr1[current1] < arr[j+1])
				{
					current1++;
					arr1[current1] = arr[j+1];
					
				}
			}
			if(current1 > current)
			{
				current = current1;
				for(int j = 0; j<=current1; j++)
				{
					arrr[j] = arr1[j];
				}
				for(int j = 0; j<=current1; j++)
				{
					arr1[j] = 0;
				}
				current1 = 0;
			}
			else
			{
				for(int j = 0; j<=current1; j++)
				{
					arr1[j] = 0;
				}
				current1 = 0;
			}
		}
	}
	int [] getArray()
	{
		int newArr[]  = new int[current+1];
		for(int i = 0; i<=current; i++)
		{
			newArr[i] = arrr[i];
		}
		return newArr;
	}
}

class FindLong
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Size : ");
		int size = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		FindLongSequence findLongSequence = new FindLongSequence();
		findLongSequence.setValue(arr);
		findLongSequence.findLongSubSequence();
		int arrr[] = findLongSequence.getArray();
		for(int i : arrr)
		{
			System.out.print(i+" ");
		}
	}
}