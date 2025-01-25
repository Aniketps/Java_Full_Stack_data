// Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
// Expected Output :
// The given array is : 1 3 4 7 8 9 9 10
// The ceiling of 5 is: 7

import java.util.*;
public class FindCeilingArray
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
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int count = 1;
		for(int i = 0; i<size-1; i++)
		{
			System.out.print("The ceiling of "+temp+" is: "+arr[i+1]+"\n");
			if(arr[i]+count!=arr[i+1])
			{
				int temp = arr[i]+count;
				System.out.print("The ceiling of "+temp+" is: "+arr[i+1]+"\n");
				count++;
				i--;
			}
			else
			{
				count = 1;
			}
		}
	}
}