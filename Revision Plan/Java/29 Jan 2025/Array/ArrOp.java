/*

1. Write Program to perform method overriding you have to create class name as ArrParent with method void setValue(int arr[]): this method can accept array as parameter void arrangeSeq(): this method can display array as per user input sequence You have to create two child class name as ArrangeAscendingOrder and you have to inherit ArrParent class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort array and display in ascending order and you have to create one more class name ReverseArray and override arrangeSeq() method from ArrParent and reverse array and display it.

*/

import java.util.*;

class ArrParent
{
	protected int arr[];
	void setValue(int arr[])
	{
		this.arr = arr;
	}
	void arrangeSeq(){}
}

class ArrangeAscendingOrder extends ArrParent
{
	void arrangeSeq()
	{
		// Sort
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = (i+1); j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nIn ascending order");
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}
}

class ReverseArray extends ArrParent
{
	void arrangeSeq()
	{
		// Reverse 
		for(int i = 0, j = (arr.length-1); i<(arr.length/2); i++, j--)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println("\nReverse Array");
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}
}

class ArrOp
{
	public static void main(String ...a)
	{
		int arr[] = {1,15,2,4,6,2,8,1,12,4,6,61,4,56};
		System.out.println("Original Array");	
		for(int i: arr)
		{
			System.out.print(i+" ");
		}

		ArrParent arrParent = new ArrangeAscendingOrder();
		arrParent.setValue(arr);
		arrParent.arrangeSeq();

		arrParent = new ReverseArray();
		arrParent.setValue(arr);
		arrParent.arrangeSeq();
	}
}