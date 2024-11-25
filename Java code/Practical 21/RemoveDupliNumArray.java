// Q10. Write a java program to remove duplicate value in array.

import java.util.*;
public class RemoveDupliNumArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter "+size+" numbers: ");
		for(int i = 0;i<size; i++)
		{
			arr[i] = sc.nextInt();
		}

		int count = 0;
		for(int i = 0; i<size-1-count; i++)
		{
				
				if(arr[i]==arr[i+1])
				{
					for(int k = i; k<size-1-count; k++)
					{
						arr[k] = arr[k+1];
					}
					count++;
				}
		}

		System.out.print("\nNew array : ");
		for(int i = 0; i<size-count; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}