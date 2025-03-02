/*

3. Count Words in a Character Array
- Write a class to implement a method to count the number of words represented in a character array (assume words are separated by spaces).
 Explanation: Work with delimiters and loops.

*/

import java.util.*;

class CountWords
{
	void startCount(char arr[])
	{
		int count = 1;
		for(char c: arr)
		{
			System.out.print(c);
			if(c == ' ')
			{
				count++;
			}
		}
		System.out.println("\nTotal word count is "+count);
	}
}

class WordCountArrApp
{
	public static void main(String ...a)
	{
		char arr[] = {'h', 'e', 'l', 'l', 'o', ' ', 'm', 'y', ' ', 'n', 'a', 'm', 'e', ' ', 'i', 's', ' ', 'A', 'n', 'i', 'k', 'e', 't', ' ', 'a', 'n', 'd', ' ', 'b', 'y', 'e','.'};
		CountWords countWord = new CountWords();
		countWord.startCount(arr);
	}
}