// 1. Write a program to take a 5 element array from user and display array in reverse

import java.util.*;
public class ReverseArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter 5 elements: ");
		for(int i = 0; i<5; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Original Array : ");
		for(int i = 0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i = 0, j = arr.length-1; i<(int) (arr.length)/2; i++, j--)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.print("\nReversed Array : ");
		for(int i = 0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}