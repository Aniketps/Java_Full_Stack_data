// Write a java program to find the kth largest element

import java.util.*;
public class KthLargestElementArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i<size-1; i++)
		{
			for(int j = i+1; j<size; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Which largest element you need: ");
		int nLargest = sc.nextInt();
		int count = 0;
		for(int i = 0; i<size-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				count++;
			}
	
			if(count==nLargest)
			{
				System.out.print("The 3rd largest is : "+arr[i]);
				break;
			}
		}
	}
}