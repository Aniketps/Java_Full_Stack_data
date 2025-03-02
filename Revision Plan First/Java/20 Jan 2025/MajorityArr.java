// 4. Write a java program to pass the array function name as findMajority( ), if it's yes then return 1 otherwise return 0.

import java.util.*;

class MajorityArr
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size : ");
		int size = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[size];

		System.out.print("Enter "+size+" elements : ");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}

		if(findMajority(arr))
		{
			System.out.println("Array is Majority");
		}
		else
		{
			System.out.println("Array is not Majority");
		}
	}
	public static Boolean findMajority(int arr[])
	{
		int count = 0;
		for(int i = 0; i<arr.length; i++)
		{
			int tempCount = 0;
			for(int j = i; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					tempCount++;
				}
			}
			if(count < tempCount)
			{
				count = tempCount;
			}
		}
		if(count>(arr.length/2))
		{
			return true;
		}
		return false;
	}
}