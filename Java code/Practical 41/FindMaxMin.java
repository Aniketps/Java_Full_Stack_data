// 3. Find the Largest and Smallest Elements in an Array Using Constructors:
// Problem:
// Create a class ArrayOperations that accepts an array of integers in the constructor. Then:
// Find the smallest and largest element in the array.
// Print these values.

import java.util.*;

class MaxMin
{
	int max;
	int min;
	MaxMin(int a[])
	{
		max = a[0];
		min = a[0];
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.print("The Max element is "+max+" and min is "+min);
	}
}

class FindMaxMin
{
	public static void main(String ...x)	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter "+size+" elements : ");
		for(int i = 0; i< size; i++)
		{
			a[i] = sc.nextInt();
		}
		MaxMin maxMin = new MaxMin(a);
	}
}