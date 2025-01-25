// Q 2. Write java program to check whether array is majority or not.

import java.util.*;
public class MajorityArrayCheck
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter "+size+" elements : ");
		for(int i = 0; i< size; i++)
		{
			arr[i] = sc.nextInt();
		}
		boolean isMajority = false;
		int count = 0;
		for(int i = 0; i<size; i++)
		{
			for(int j = 0; j<size; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>size/2)
			{
				isMajority = true;
			}
			count = 0;
		}
		if(isMajority)
		{
			System.out.print("Array is Majority array");
		}
		else
		{
			System.out.print("Array is not Majority array");
		}
	}
}