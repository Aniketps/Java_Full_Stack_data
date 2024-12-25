// Q.1 WAP to Create a class name as MergeArray with function.


import java.util.*;
class Merge
{
	private int arr1[], arr2[];
	private int arr3[];
	private int count = 0;
	void mergeArray(int a[ ] , int b[ ])
	{
		// this function can accept the array.
		arr1 = a;
		arr2 = b;
		int Size = arr1.length + arr2.length;
		arr3 = new int[Size];
	}

	void performMeger( ) 
	{
		//this function can use merge two array.
		for(int i = 0; i<arr1.length; i++)
		{
			arr3[count] = arr1[i];
			count++;
		}
		for(int i = 0; i<arr2.length; i++)
		{
			arr3[count] = arr2[i];
			count++;
		}
	}

	void sortDesc()
	{
		//Sort merge array in descending order.
		for(int i = 0; i<arr3.length - 1; i++)
		{
			for(int j = 1+i; j<arr3.length; j++)
			{
				if(arr3[i]<arr3[j])
				{
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		System.out.print("Descending order Sorted array with merged data: ");
		for(int i = 0; i<arr3.length; i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
}

public class MergeArray
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("First Array size: ");
		int Size1 = sc.nextInt();
		int arr1[] = new int[Size1];
		System.out.print("\nData for first array : ");
		for(int i = 0; i<Size1; i++)
		{
			arr1[i] = sc.nextInt();
		}

		System.out.print("\nSecond Array size: ");
		int Size2 = sc.nextInt();
		int arr2[] = new int[Size2];

		System.out.print("\nData for second array : ");
		for(int i = 0; i<Size2; i++)
		{
			arr2[i] = sc.nextInt();
		}

		Merge obj = new Merge();
		obj.mergeArray(arr1, arr2);
		obj.performMeger();
		obj.sortDesc();
	}
}