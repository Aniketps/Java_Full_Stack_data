// Q 5.Write java program to find a pair with given sum in the array.

import java.util.*;
public class FindPairInArray
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
		System.out.print("What is sum: ");
		int sum = sc.nextInt();
		for(int i = 0; i<size-1; i++)
		{
			for(int j = i+1; j<size; j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.print("Pair is "+arr[i]+" and "+arr[j]+"\n");
					break;
				}
			}
		}
	}
}