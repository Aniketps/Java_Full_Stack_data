//  Find the Second Largest Element in an Array
// Write a class to write a method to find the second largest element in an integer array.
// Explanation: Practice logic building and conditional checks.


import java.util.*;
public class FindSecondLarge
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

		Large obj = new Large();
		obj.setData(arr);
		obj.getData();
	}
}

class Large
{
	int arr[];
	void setData(int ...d)
	{
		arr = d;
	}
	void getData()
	{
		for(int i = 0 ; i<arr.length - 1; i++)
		{
			for(int j = i + 1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Second Largest is "+ arr[1]);
	}
}	