// Reverse an Array
// Write a class to write a method to reverse the elements of an integer array.
// Explanation: Work with array indexing and swapping.


import java.util.*;
public class ReverseArray
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

		Reverse obj = new Reverse();
		obj.setData(arr);
		obj.getData();
	}
}

class Reverse
{
	int arr[];
	void setData(int ...d)
	{
		arr = d;
	}
	void getData()
	{
		for(int i = 0, j = arr.length - 1; i<arr.length/2; i++, j--)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		printData(arr);
	}
	void printData(int ...d)
	{
		for(int i = 0; i<d.length; i++)
		{
			System.out.print(d[i]+" ");
		}
	}
}