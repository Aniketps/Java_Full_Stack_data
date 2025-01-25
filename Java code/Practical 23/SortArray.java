// Q1. WAP to create function name as 
// void sort(int a[]): this function can accept integer type of array and sort it 
// void sort(char[]): this function can accept character type of array and sort it

import java.util.*;
public class SortArray
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is Size: ");
		int Size = sc.nextInt();
		System.out.print("Which type of data is there: \n1. Integer\n2. Character \n");
		int Option = sc.nextInt();

		Sort obj = new Sort();
		if(Option == 1)
		{
			int arr[] = new int[Size];
			System.out.print("\nEnter elements : ");
			for(int i = 0; i<Size; i++)
			{
				arr[i] = sc.nextInt();
			}
			obj.SortInt(arr);
		}
		else if(Option == 2)
		{
			char arr[] = new char[Size];
			System.out.print("\nEnter elements : ");
			for(int i = 0; i<Size; i++)
			{
				arr[i] = sc.next().charAt(0);
			}
			obj.SortChar(arr);			
		}
		else
		{
			System.out.print("Invalid Option");
		}
	}
}

class Sort
{
	void SortInt(int arr[])
	{
		for(int i = 0; i<arr.length - 1; i++)
		{
			for(int j = 1+i; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	void SortChar(char arr[])
	{
		for(int i = 0; i<arr.length - 1; i++)
		{
			for(int j = 1+i; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					char temp = (char) arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}