// Q9. Write a java program to find perfect number in array.

import java.util.*;
public class FindPerfectNumArray
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

		boolean isPerfect = false;
		for(int i = 0; i<size; i++)
		{
			int sum = 0;
			for(int j = arr[i]-1; j>0; j--)
			{
				if(arr[i]%j==0)
				{
					sum += j;
				}
			}
			if(sum==arr[i])
			{
				System.out.print(arr[i]+" ");
				isPerfect = true;
			}
		}
		if(isPerfect)
		{
			System.out.print("Perfect numbers");
		}
		else
		{
			System.out.print("There are no perfect numbers in array");
		}
	}
}