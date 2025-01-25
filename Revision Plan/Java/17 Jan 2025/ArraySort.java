// 1. Write program to create array of size and arrange all values in ascending & descending order?

import java.util.*;

class ArraySort
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size :");
		int size = sc.nextInt();
		sc.nextLine();
		int a[] = new int[size];
		
		for(int i = 0; i<size; i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			a[i] = sc.nextInt();
			sc.nextLine();
		}

		// original 
		System.out.println("Original ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}

		for(int i = 0; i<size; i++)
		{
			for(int j = (i+1); j<size; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// Sort in ascending
		System.out.println("\nAscending order");
		for(int i = 0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		// Sort in descending 
		System.out.println("\nDescending order");
		for(int i = size-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}