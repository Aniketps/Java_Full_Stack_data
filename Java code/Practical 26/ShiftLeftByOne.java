//  Shift Array Elements to the Left
// Write a class to create a method to shift all elements in an array one position to the left.
// Explanation: Work with array indexes and element reassignment.


import java.util.*;
public class ShiftLeftByOne
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

		Shift obj = new Shift();
		obj.setData(arr);
		obj.getData();
	}
}

class Shift
{
	int arr[];
	void setData(int ...d)
	{
		arr = d;
	}
	void getData()
	{
		for(int i = 0, j = 1; i<arr.length - 1; i++, j++)
		{
			arr[i] = arr[j];
		}
		for(int i = 0; i<arr.length - 1; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}	