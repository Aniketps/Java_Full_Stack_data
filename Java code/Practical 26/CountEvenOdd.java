// Count Even and Odd Numbers in an Array
// Write a class to implement a method to count how many numbers are even and odd in an integer array.
// Explanation: Learn conditional checks and iteration in arrays.

import java.util.*;
public class CountEvenOdd
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

		Count obj = new Count();
		obj.setData(arr);
		obj.getData();
	}
}

class Count
{
	int arr[];
	void setData(int ...d)
	{
		arr = d;
	}
	void getData()
	{
		int evenCount = 0;
		int oddCount = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Even count is "+ evenCount +"\nOdd Count is "+oddCount);
	}
}