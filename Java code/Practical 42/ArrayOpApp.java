/*

Q4. Write a java program to create class name as UnionApp using contsructor overloading name as :

	UnionApp(int [ ])
	{
		//  Check array is Majority or Not.
	}
	
	UnionApp(int a[ ] , int b[ ])
	{
		//  Check Array Is Union or Not.
	}

*/

import java.util.*;
class UnionApp
{
	UnionApp(int a[])
	{
		//  Check array is Majority or Not.
		int finalCount = 0;
		for(int i = 0; i<a.length; i++)
		{
			int count = 0;
			for(int j = i; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
			}
			if(finalCount<count)
			{
				finalCount = count;
			}
		}
		if(finalCount > (a.length/2))
		{
			System.out.println("The array is majority array");
		}
		else
		{
			System.out.println("The array is not majority array");
		}
	}
	
	UnionApp(int a[ ] , int b[ ])
	{
		//  Check Array Is Union or Not.
		
		for(int i = 0; i<a.length; i++)
		{
			boolean isUnion = false;
			for(int j = 0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					isUnion = true;
				}
			}
			if(!isUnion)
			{
				System.out.println("Array is A is not union array of B");
				return;
			}
		}
		System.out.println("Array is A is union array of B");
		return;
	}
}

class ArrayOpApp
{
	public static void main(String ...s)
	{
		UnionApp unionApp =  new UnionApp((new int[]{12,45,41,10,52,62,45,84,20, 12, 12, 12, 12,12,12,12,12}));
		unionApp =  new UnionApp((new int[]{12,45,41,10,52,62,45,84,20, 12, 12, 12, 12}));

		unionApp =  new UnionApp(new int[]{12}, new int[]{84,20,12});
	}
}