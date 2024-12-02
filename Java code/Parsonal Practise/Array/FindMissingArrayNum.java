// Q4. Write a java program to find missing element in array.

import java.util.*;
public class FindMissingArrayNum
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
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int i;
		boolean flag = false;
		for(i = 0; i<size - 1; i++)
		{
			if(arr[i] + 1 != arr[i+1])
			{
				int Missingnum = arr[i]+1;
				while(Missingnum<arr[i+1])
				{
					System.out.print(Missingnum+" ");
					Missingnum ++;
					flag = true;
				}
			}
		}
		if(flag)
		{
			System.out.print("are missing numbers");
		}
		else
		{
			System.out.print("There are no missing numbers");
		}	
	}
}