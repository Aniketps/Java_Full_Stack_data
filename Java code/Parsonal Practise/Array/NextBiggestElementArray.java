// Write a program in java to print next greater elements in a given unsorted array. Elements for which no greater element exist, consider next greater element as -1.
// Expected Output :
// The given array is : 5 3 10 9 6 13
// Next Bigger Elements are:
// Next bigger element of 5 in the array is: 10
// Next bigger element of 3 in the array is: 10
// Next bigger element of 10 in the array is: 13
// Next bigger element of 9 in the array is: 13
// Next bigger element of 6 in the array is: 13
// Next bigger element of 13 in the array is: -1
// Next Bigger Elements Array:
// 10 10 13 13 13 -1

import java.util.*;
public class NextBiggestElementArray
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
		int biggest = -1;
		for(int i = 0; i<size-1; i++)
		{
			biggest = -1;
			for(int j = i+1; j<size;j++)
			{
				if(biggest<arr[j] && arr[i]<arr[j])
				{
					biggest = arr[j];
					break;
				}
			}
			System.out.print("Next bigger element of "+arr[i]+" in the array is: "+biggest+"\n");
		}
		System.out.print("Next bigger element of "+arr[size-1]+" in the array is: -1\n");
	}
}