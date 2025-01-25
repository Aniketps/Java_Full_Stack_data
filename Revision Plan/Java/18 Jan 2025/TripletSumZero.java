/*

Q2. Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i
!= k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1],[0,1,-1],]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:
Input: nums = [0,1,1]Output: []
Explanation: The only possible triplet does not sum up to 0.

*/

import java.util.*;

class TripletSumZero
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

		System.out.print("\nOutput: [");
		for(int i = 0; i<size; i++)
		{
			for(int j = (i+1); j<size; j++)
			{
				for(int k = (j+1); k<size; k++)
				{
					if(((arr[i]+arr[j]+arr[k]) == 0) && i != j && i != k && j != k)
					{
						System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"],");
					}
				}
			}
		}
		System.out.println("]");
	}
}