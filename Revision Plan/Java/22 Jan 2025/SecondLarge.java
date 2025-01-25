/*

2. Find the Second Largest Element in an Array
-  Write a class to write a method to find the second largest element in an integer array.
 Explanation: Practice logic building and conditional checks.

*/
import java.util.*;

class Second
{
	void SecondMission(int arr[])
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print(dupli(arr, 1));
	}
	int dupli(int arr[],int index)
	{
		if(arr[0] == arr[index])
		{
			return dupli(arr, index+1);
		}
		return arr[index];
	}
}


class SecondLarge
{
	public static void main(String ...a)
	{
		int arr[] = {45,45,45,45,12,12,13,13,11};
		Second second = new Second();
		second.SecondMission(arr);
	}
}