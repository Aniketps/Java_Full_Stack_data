// Q.5 Write a java program to find positive and negative number from array.

import java.util.*;
public class FindPositiveNegativeArrayElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter "+size+" elements : ");

		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Positive elements : ");
		for(int i = 0; i<size; i++)
		{
			if(arr[i]>0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("\nNegative elements : ");
		for(int i = 0; i<size; i++)
		{
			if(arr[i]<0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}



