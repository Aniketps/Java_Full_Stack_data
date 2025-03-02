/*

3. Find the subarray with the maximum sum (Kadane’s Algorithm)
Implement Kadane’s algorithm to find the sum of the maximum subarray.
Example: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output:
	The subarray with the maximum sum is [4, -1, 2, 1], which has a sum of 6
	
Note: your task is to create class FindMaxSum with two methods 
     void setValue(int a[]): this function is used for accept array as parameter 
     Void findMaxSum(): this function is used for find the maximum subsequence of array
      Int [] getResult(): this function is used for return resultant array 

*/

import java.util.*;

class FindMaxSum
{
	int arr[];
	int size;
	void setValue(int a[])
	{
		arr = a;
		size = a.length;
	}
	int length = 1;
	int maxSum = 0;
	int toBeReturned[];
	void findMaxSum()
	{
		// size = 9
		// [0, 0, 0, 0, 0, 0, 0, 0, 0]
		toBeReturned = new int[size];
		// 0
		for(int i = 0; i<size; i++)
		{
			// 1 >= 9
			if(length >= size)
			{
				break;
			}
			// 1 => (9-1)=8
			for(int j = 0; j<=size-length; j++)
			{
				// [0, 0, 0, 0, 0, 0, 0, 0, 0]
				int temp[] = new int[size];
				// 0
				int count= 0;
				// 0
				int sum = 0;
				// 0
				int top = 0;
				// 0
				int bottom = length;
				// 0 => 1
				for(int k = top; k<bottom; k++)
				{
					// 0 + arr[0] => -2
					sum += arr[k];
					temp[count] = arr[k];
					count++;
				}
				// 1
				top += length;
				bottom += bottom+length;
				// -2 > 0
				if(sum > maxSum)
				{
					maxSum = sum;
					for(int k = 0; k<count; k++)
					{
						toBeReturned[k] = temp[k];
					}
				}
			}
			length++;
		}
	}
	int [] getResult()
	{
		int helper = 0;
		for(int i : toBeReturned)
		{
			if(i == 0)
			{
				helper++;
			}
		}
		int temp[] = new int[helper];
		for(int i = 0; i<helper; i++)
		{
			temp[i] = toBeReturned[i];
		}
		return temp;
	}
}

class MaxSum
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
		
		FindMaxSum findMaxSum = new FindMaxSum();
		findMaxSum.setValue(arr);
		findMaxSum.findMaxSum();
		for(int i : findMaxSum.getResult())
		{
			System.out.print(i+" ");
		}
	}
}