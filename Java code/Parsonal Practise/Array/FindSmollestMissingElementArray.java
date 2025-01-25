// 17) Write a program in java to find the smallest missing element from a sorted array?
// Expected Output :
// The given array is : 0 1 3 4 5 6 7 9
// The missing smallest element is: 2

import java.util.*;
public class FindSmollestMissingElementArray
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

		for(int i = 0; i<size-1; i++)
		{
			for(int j = i+1; j<size; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		boolean flag = false;
		for(int i  = 0; i<size - 1;i++)
		{
			if(arr[i]+1!=arr[i+1])
			{
				int min = arr[i]+1;
				System.out.print("The smallest missing element is "+min);
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.print("No Smollest missing element in array");
		}
	}
}