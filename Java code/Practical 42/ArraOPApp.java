/*

Q3. Write a java program to create class name as ArrayOperation using contsructor overloading name as :

	ArrayOperation(int [ ])
	{
		//  Sort Array Ascending and Descending Order.
	}
	
	ArrayOperation(int a[ ] , int b[ ])
	{
		//  Merge Two Array and display it.
	}
	

*/

import java.util.*;

class ArrayOperation
{
	ArrayOperation(int a[])
	{
		//  Sort Array Ascending and Descending Order.
		System.out.println("Ascending sort");
		for(int i = 0; i<a.length - 1; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.println("\nDescending sort");

		for(int i = 0; i<a.length -1; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	ArrayOperation(int a[] , int b[])
	{
		int newA[] = new int[a.length+b.length];
		//  Merge Two Array and display it.
		int count = 0;
		for(int i = 0; i<a.length; i++)
		{
			newA[count] = a[i];
			count++;
		}
		for(int i = 0; i<b.length; i++)
		{
			newA[count] = b[i];
			count++;
		}
		System.out.println("\nNew merged array");
		for(int i = 0; i<count; i++)
		{
			System.out.print(newA[i]+" ");
		}
	}
}

class ArraOPApp
{
	public static void main(String ...x)
	{
		ArrayOperation arrayOperation = new ArrayOperation(new int[]{12,45,41,10,52,62,45,84,20});
		arrayOperation = new ArrayOperation(new int[]{12,45,41,10,52,62,45,84,20}, new int[]{12,45,41,10,52,62,45,84,20});
	}
}