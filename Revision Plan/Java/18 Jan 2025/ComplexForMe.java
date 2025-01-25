/*

Q4. Given an array nums of n integers, return an array of all the unique quadruplets [nums[a],
nums[b], nums[c], nums[d]] such that:
• 0 <= a, b, c, d < n
• a, b, c, and d are distinct.
• nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0 Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:
Input: nums = [2,2,2,2,2], target = 8 Output: [[2,2,2,2][2,2,2,2][2,2,2,2][2,2,2,2][2,2,2,2]]

*/

import java.util.*;

class ComplexForMe
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
		
		// Target
		System.out.print("\nTarget : ");
		int target = sc.nextInt();
		sc.nextLine();

		System.out.print("\nOutput: [");
		for(int i = 0; i<size; i++)
		{
			for(int j = (i+1); j<size; j++)
			{
				for(int k = (j+1); k<size; k++)
				{
					for(int l = (k+1); l<size; l++)
					{
						if((0 <= i && 0 <= j && 0 <= k && 0 <= l) && (i < size && j < size && k < size && l < size)&& (arr[i] + arr[j] + arr[k] + arr[l] == target))
						{
							System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+","+arr[l]+"]");
						}
					}
				}
			}
		}
		System.out.print("]");
	}
}