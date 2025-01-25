/*

Q1. Write a java program to create class name ReverseApp using contsructor name as :

	ReverseApp(int [ ])
	{
		//  perform integer reverse array logic.
	}
	
	ReverseApp(String )
	{
		//  perform string reverse logic.
	}

*/

import java.util.*;

class ReverseApp
{
	ReverseApp(int a[])
	{
		for(int i = 0, j = a.length-1; i<(int) (a.length/2); i++, j--)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		System.out.println("Reverse array");
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	ReverseApp(String a)
	{
		System.out.println("Reverse String");
		for(int i = a.length()-1; i>=0; i--)
		{
			System.out.print(a.charAt(i));
		}
	}
}

class ReverseDataApp
{
	public static void main(String ...x)
	{
		System.out.println("1. String \n2. Array ");
		System.out.print("Make choice : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice == 1)
		{
			System.out.print("Array size : ");
			int size = sc.nextInt();
			int a[] = new int[size];
			System.out.print("Enter "+size+" elements : ");
			for(int i = 0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
			ReverseApp reverseApp = new ReverseApp(a);
		}
		else if(choice == 2)
		{
			System.out.print("Enter string : ");
			String a = sc.nextLine();
			ReverseApp reverseApp = new ReverseApp(a);
		}
	}
}