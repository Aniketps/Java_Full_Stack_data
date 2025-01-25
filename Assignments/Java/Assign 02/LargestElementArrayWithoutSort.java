// 3. Write a program to find the 2nd largest element from the given array without sorting technique

import java.util.*;
public class LargestElementArrayWithoutSort
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter "+size+" elements: ");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Array : ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		int firstLarge, secondLarge;
		firstLarge= arr[0];
		secondLarge = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(firstLarge<arr[i])
			{
				secondLarge = firstLarge;
				firstLarge = arr[i];
			}
			else
			{
				if(secondLarge<arr[i] && arr[i] < firstLarge)
				{
					secondLarge = arr[i];
				}
			}
		}
		if(firstLarge>secondLarge)
		{
			System.out.println("\nThe Second Largest element is : "+secondLarge);
		}
		else
		{
			System.out.println("\nThe Second Largest element is : "+firstLarge);
		}
	}	
}