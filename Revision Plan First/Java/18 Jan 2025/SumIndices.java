/*

Q1. Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the
same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9 Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6 Output: [1,2]

*/

import java.util.*;

class SumIndices
{
	public static void main(String ...s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size : ");
		int size = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[size];
		for(int i = 0; i<size; i++)
		{
			System.out.print(i+" element : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
		}

		// Original Array
		for(int a: arr)
		{
			System.out.print(a+" ");
		}

		System.out.print("\nTarget : ");
		int target = sc.nextInt();
		boolean isFound = false;
		for(int i = 0; i<size; i++)
		{
			for(int j = (i+1); j<size; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("Output: ["+i+","+j+"]");
					isFound = true;
				}
			}
		}
		if(!isFound)
		{
			System.out.println("Sum indices are not present");
		}
	}
}