//  Sort an Array (Bubble Sort)
// Write a class to implement a method to sort an integer array using bubble sort.
// Explanation: Learn basic sorting algorithms and their implementation.


import java.util.*;
public class ActionBubbleSoft
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

		BubbleSoft obj = new BubbleSoft();
		obj.setData(arr);
		obj.getData();
	}
}

class BubbleSoft
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
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		printData(arr);
	}
	void printData(int arr[])
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}	