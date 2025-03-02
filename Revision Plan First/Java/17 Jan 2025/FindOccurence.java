//  3. Write program to create array of size 10 and find occurrence of every element in array?

import java.util.*;

class FindOccurence
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
		System.out.println("Original Data ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}

		for(int i = 0; i<size; i++)
		{
			for(int j = (i+1); j<size; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// Logic
		int aCopy[] = new int[size];
		int count = 1;
		aCopy[0] = a[0];

		for(int i = 1; i<size; i++)
		{
			if(aCopy[count-1]!=a[i])
			{
				aCopy[count] = a[i];
				count++;
			}
		}
		
		System.out.println();

		for(int i = 0; i<count; i++)
		{
			int newCount = 0;
			for(int j = 0; j<size; j++)
			{
				if(aCopy[i] == a[j])
				{
					newCount++;
				}
			}
			System.out.println(aCopy[i]+" occurred "+newCount+" times");
		}
	}
}