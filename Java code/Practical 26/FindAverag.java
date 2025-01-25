//  Calculate the Average of an Array
// Write a class to create a method to calculate the average of elements in an integer array.
// Explanation: Practice basic arithmetic operations and array traversal.

import java.util.*;
class Average
{
	int arr[];
	void setData(int ...d)
	{
		arr = d;
	}
	float getData()
	{
		int max = arr[0];
		int total = 0;
		for(int i = 0; i<arr.length; i++)
		{
			total = total + arr[i];
		}
		return (total/arr.length);
	}
}

public class FindAverag
{
	public static void main(String ...x)
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

		Average obj = new Average();
		obj.setData(arr);
		float result = obj.getData();
		System.out.println("The Average is "+result);
	}
}