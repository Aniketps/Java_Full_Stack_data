// 4. Write program to create array of size 5 and reverse it?

import java.util.*;

class RevArray
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

		// Reverse
		for(int i = 0, j = size-1; i<(size/2); i++,j--)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		System.out.println("\nReversed array");
		for(int i = 0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}