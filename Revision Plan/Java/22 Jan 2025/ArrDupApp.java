/*

1. Find Duplicates in an Array
-  Write a class to create a method to identify and display duplicate elements in an integer array.
 Explanation: Practice nested loops to compare elements.

*/
import java.util.*;

class Duplicate
{
	void findDuplicate(int arr[])
	{
		int dup[] = new int[arr.length];
		int count = 0;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1;j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					boolean isPresent = false;
					for(int k = 0; k<count; k++)
					{
						if(arr[i] == arr[k])
						{
							isPresent = true;
						}
					}
					if(!isPresent)
					{
						dup[count] = arr[i];
						count++;
					}
				}
			}
		}
		for(int i: dup)
		{
			if(i == 0){return;}
			System.out.print(i+" ");
		}
	}
}

class ArrDupApp
{
	public static void main(String ...a)
	{
		Duplicate duplicate = new Duplicate();
		int arr[] = {10,15,15,12,14,15,12,10,85,45,65,45,52,13,13,10};
		duplicate.findDuplicate(arr);
	}
}