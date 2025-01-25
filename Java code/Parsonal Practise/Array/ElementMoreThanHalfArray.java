// Write a program in java to find if a given integer x appears more than n/2 times in a sorted array of n integers ?
// Expected Output :
// The given array is : 1 3 3 5 4 3 2 3 3
// The given value is : 3
// 3 appears more than 4 times in the given array[]

import java.util.*;
public class ElementMoreThanHalfArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter elements : ");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}

		int number = arr[0];
		int finalCount = 0;
		for(int i = 0; i<size; i++)
		{
			int count = 0;
			for(int j = i; j<size;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count>finalCount)
			{
				finalCount = count;
				number = arr[i];
			}
		}
		System.out.print(number+" appears "+finalCount+" times in the given array[], where array half is "+arr.length/2);
	}
}