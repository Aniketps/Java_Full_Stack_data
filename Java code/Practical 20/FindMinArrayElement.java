// Q.2 Write a java program to find minimum number from array.

import java.util.*;
public class FindMinArrayElement
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
	
		for(int i = 0; i<size; i++)
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
		System.out.print("The Minimum element is : "+arr[0]);
	}
}



