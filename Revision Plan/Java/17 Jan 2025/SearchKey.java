// 2. Write program to create array of size 5 and input search key value and search value in array?

import java.util.*;

class SearchKey
{
	public static void main(String ...s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size :");
		int size = sc.nextInt();
		sc.nextLine();
		int a[] = new int[size];
		
		for(int i = 0; i<size; i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			a[i] = sc.nextInt();
			sc.nextLine();
		}

		// original 
		System.out.println("Original ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.print("\nWhich value want to search : ");
		int search = sc.nextInt();
		int isFound = -1;
		for(int i = 0; i<size; i++)
		{
			if(search==a[i])
			{
				isFound = i;
				break;
			}
		}
		if(isFound == -1)
		{
			System.out.println("Cant find value is data");
		}
		else
		{
			System.out.println("Value found on index "+isFound);
		}
	}
}