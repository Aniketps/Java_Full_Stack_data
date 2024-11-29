// Q 6. Write a  java program to find the union and intersection of two

import java.util.*;
public class FindUnionAndIntersectionArray
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size of first: ");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		System.out.print("Enter "+size1+" elements : ");
		for(int i = 0; i< size1; i++)
		{
			arr1[i] = sc.nextInt();
		}

		System.out.print("What is array size of Second: ");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.print("Enter "+size2+" elements : ");
		for(int i = 0; i< size2; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		System.out.print("\nUnion is : ");
		// Union
		for(int i = 0; i<size1; i++)
		{
			boolean isPresent = false;
			for(int j = 0; j<size2; j++)
			{
				if(arr1[i]==arr2[j])
				{
					isPresent = true;
				}
			}
			if(!isPresent)
			{
				System.out.print(arr1[i]+" ");
			}
		}
		for(int i = 0; i<size2; i++)
		{
			System.out.print(arr2[i]+" ");
		}

		System.out.print("\nIntersection is : ");
		// Intersection
		for(int i = 0; i<size1; i++)
		{
			boolean isPresent = false;
			for(int j = 0; j<size2; j++)
			{
				if(arr1[i]==arr2[j])
				{
					isPresent = true;
				}
			}
			if(isPresent)
			{
				System.out.print(arr1[i]+" ");
			}
		}
	}
}