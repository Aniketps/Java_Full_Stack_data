// Q.2 WAP to Create a class name as PalindromeApp with create function name as :

import java.util.*;
class PalindromeCheck
{
	private char arr1[];
	private int arr2[];

	void integerPalindrome(int a[ ])
	{
		// this function can accept the integer array.
		arr2 = a;
	}

	void charPalindrome(char a[ ])
	{
		// this function can accept the charcter array.
		arr1 = a;
	}

	void checkIntArray( )
	{
		//this function can use the array is palindrome or not.
		for(int i = 0, j= arr2.length - 1; i<arr2.length/2; i++, j--)
		{
			if(arr2[i] !=arr2[j])
			{
				System.out.print("Array is not a Palindrome Array");
				return;
			}
		}
		System.out.print("Array is Palindrome");
	}
	void checkCharArray()
	{
		//this function can use the string is palindrome or not.
		for(int i = 0, j= arr1.length - 1; i<arr1.length/2; i++, j--)
		{
			if(arr1[i] !=arr1[j])
			{
				System.out.print("Array is not a Palindrome Array");
				return;
			}
		}
		System.out.print("Array is Palindrome");
	}
}

public class PalindromeApp
{
	public static void main(String []x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size: ");
		int Size1 = sc.nextInt();
		System.out.print("\n1. Integer \n2. Character\n");
		int option = sc.nextInt();
		PalindromeCheck obj = new PalindromeCheck();
		if(option == 1)
		{
			int arr1[] = new int[Size1];
			System.out.print("\nData for array : ");
			for(int i = 0; i<Size1; i++)
			{
				arr1[i] = sc.nextInt();
			}
			obj.integerPalindrome(arr1);
			obj.checkIntArray();
		}
		else if(option == 2)
		{
			char arr1[] = new char[Size1];
			System.out.print("\nData for array : ");
			for(int i = 0; i<Size1; i++)
			{
				arr1[i] = sc.next().charAt(0);
			}
			obj.charPalindrome(arr1);
			obj.checkCharArray();
		}
	}
}