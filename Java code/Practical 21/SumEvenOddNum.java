// Q1. Write a java program to calculate sum of even & odd  number of array.

import java.util.*;
public class SumEvenOddNum
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
		
		int OddSum = 0;
		int EvenSum = 0;
		
		for(int i = 0; i<size; i++)	
		{
			if(arr[i]%2==0)
			{
				EvenSum = EvenSum + arr[i];
			}
			else
			{
				OddSum = OddSum + arr[i];
			}
		}

		System.out.print("Sum of all even number is : "+EvenSum+"\n");
		System.out.print("Sum of all odd number is : "+OddSum);
	}
}