// 3. Write a java program to pass the array function name as findEvenOdd( ), then display the even and odd number in array.

import java.util.*;

class ArrEvenOdd
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

		findEvenOdd(arr);
	}
	
	public static void findEvenOdd(int arr[])
	{
		// For even
		System.out.print("\nEven from array : ");
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		// for Odd
		System.out.print("\nOdd from array : ");
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}