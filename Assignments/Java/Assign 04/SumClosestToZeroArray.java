// Write a program in java to find two elements whose sum is closest to zero
// Expected Output :
// The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
// The Pair of elements whose sum is minimum are:
// [44, -46]

import java.util.*;
public class SumClosestToZeroArray
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

		int firstElement = arr[0];
		int secondElement = arr[0];
		int min = arr[0];
		for(int i = 0; i<size; i++)
		{
			for(int j = 0; j<size;j++)
			{
				if(arr[i] != arr[j])
				{
					if(Math.abs(arr[i] + arr[j]) < min)
					{
						min = Math.abs(arr[i] + arr[j]);
						firstElement = arr[i];
						secondElement = arr[j];
					}
				}
			}
		}
		System.out.print("The Pair of elements whose sum is minimum are: ["+firstElement+", "+secondElement+"]");
	}
}