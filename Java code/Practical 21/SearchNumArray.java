// Q2. Write a java program to search element in array , its element found or not.

import java.util.*;
public class SearchNumArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter "+size+" numbers: ");
		for(int i = 0;i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\nWhich number you want to search : ");
		int SearchNum = sc.nextInt();
		boolean flag = false;
		
		for(int i = 0; i<size; i++)	
		{
			if(arr[i]==SearchNum)
			{
				flag = true;
			}
		}

		String result = flag? ("The number "+SearchNum+" present in array") : ("The number "+SearchNum+" not present in array");
		System.out.print("\n"+result);
	}
}