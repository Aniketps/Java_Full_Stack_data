// Write a Java program to display all array elements using recursion.

import java.util.*;

public class printarrayRecursion
{
	public static void main(String x[])
	{
		Scanner sc  = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		printdata(arr, 0);
	}
	public static int printdata(int [] arr, int index)
	{
		if(arr.length==index)
		{
			System.out.print("End");
			return 1;
		}
		else
		{
			System.out.print(arr[index]);
			printdata(arr, index + 1);
		}
	return 1;
	}
}