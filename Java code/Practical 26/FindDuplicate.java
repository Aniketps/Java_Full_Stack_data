// Find Duplicates in an Array
// Write a class to create a method to identify and display duplicate elements in an integer array.
// Explanation: Practice nested loops to compare elements.


import java.util.*;
public class FindDuplicate
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("\nEnter data : ");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}

		Duplicates obj = new Duplicates();
		obj.setData(arr);
		obj.getData();
	}
}

class Duplicates
{
	int arr[];
	void setData(int ...d)
	{
		arr = d;
	}
	void getData()
	{
		for(int i = 0 ; i<arr.length; i++)
		{
			for(int j = i; j<arr.length; j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					System.out.print("Duplicate found "+ arr[i]+"\n");
				}
			}	
		}
	}
}