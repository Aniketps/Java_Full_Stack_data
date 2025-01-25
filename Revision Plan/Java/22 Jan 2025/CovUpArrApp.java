/*

4. Convert Character Array to Uppercase
- Write a class to implement a method to convert all characters in a character array to uppercase.
 Explanation: Use ASCII values or built-in functions to modify array elements.

*/

import java.util.*;

class Convert
{
	void UpHeadAll(char arr[])
	{
		for(char c : arr)
		{
			System.out.print(c);
		}
		char newHeads[] = new char[arr.length];
		int count = 0;
		for(int  i = 0; i<arr.length; i++)
		{
			if((int) arr[i] > 90)
			{
				newHeads[i] = (char) ((int) arr[i] - 32);
			}
			else
			{
				newHeads[i] = arr[i];
			}
		}
		System.out.println("\nIn Upper case");
		for(char c : newHeads)
		{
			System.out.print(c);
		}
	}
}

class CovUpArrApp
{
	public static void main(String ...a)
	{
		char arr[] = {'h', 'e', 'l', 'l', 'o', ' ', 'm', 'y', ' ', 'n', 'a', 'm', 'e', ' ', 'i', 's', ' ', 'A', 'n', 'i', 'k', 'e', 't', ' ', 'a', 'n', 'd', ' ', 'b', 'y', 'e','.'};
		Convert convert = new Convert();
		convert.UpHeadAll(arr);
	}
}