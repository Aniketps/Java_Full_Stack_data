// Find the Maximum Value in an Array using 
// Write a class with a method to find and return the maximum value in an integer array.
// Explanation: Learn how to traverse an array and find the largest element using methods.

import java.util.*;
class Max
{
	int arr[];
	void setData(int ...d)
	{
		arr = d;
	}
	int getData()
	{
		int max = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}
}

public class FindMax
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("\nEnter data : ");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}

		Max obj = new Max();
		obj.setData(arr);
		int result = obj.getData();
		System.out.println("The Max is "+result);
	}
}