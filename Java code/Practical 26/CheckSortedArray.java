//  Check if an Array is Sorted
// Write a class to implement a method to check whether an integer array is sorted in ascending order.
// Explanation: Understand conditions and comparisons in loops.


import java.util.*;
public class CheckSortedArray
{
	public static void main(String x[])
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

		Sort obj = new Sort();
		obj.setData(arr);
		String result = obj.getData()? "Sorted" : "Not Sorted";
		System.out.print("The array is "+ result); 
	}
}

class Sort
{
	int arr[];
	void setData(int ...d)
	{
		arr = d;
	}
	boolean getData()
	{
		for(int i = 0, j = 1; i<arr.length - 1; i++, j++)
		{
			if(arr[i] > arr[j])
			{
				return false;
			}
		}
		return true;
	}
}	