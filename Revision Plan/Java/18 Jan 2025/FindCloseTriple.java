/*

Q3. Given an integer array nums of length n and an integer target, find three integers in nums such
that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

*/

import java.util.*;

class FindCloseTriple
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
		int t1 = 0,t2 = 0,t3 = 0;
		
		int sum = -1;
		for(int i = 0; i<size; i++)
		{
			for(int j = (i+1); j<size; j++)
			{
				for(int k = (j+1); k<size; k++)
				{
					if(sum == -1 )
					{
						if(target != Math.abs((arr[i]+arr[j]+arr[k])))
						{
							sum = Math.abs((arr[i]+arr[j]+arr[k]) - target);
							t1 = arr[i];
							t2 = arr[j];
							t3 = arr[k];
						}
					}
					if ((Math.abs((arr[i]+arr[j]+arr[k]) - target) < sum) && (target != Math.abs((arr[i]+arr[j]+arr[k]))) && sum != -1)
					{
						sum = Math.abs((arr[i]+arr[j]+arr[k]) - target);
						t1 = arr[i];
						t2 = arr[j];
						t3 = arr[k];
					}
				}
			}
		}
		System.out.println(t1+t2+t3);
	}
}