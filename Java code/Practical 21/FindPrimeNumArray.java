// Q8. Write a java program to find prime number in array.

import java.util.*;
public class FindPrimeNumArray
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
		
		Boolean isPrime = true;
		for(int i = 0; i<size; i++)
		{
			for(int j = arr[i]-1; j>1; j--)
			{
				if(arr[i]%j==0)
				{
					isPrime = false;
				}
			}
			if(isPrime)
			{
				System.out.print(arr[i]+" ");
			}
			isPrime = true;
		}
		System.out.print("are the prime numbers")
	}
}