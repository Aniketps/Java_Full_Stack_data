// Q 3. Write java program to frequency of each digit in array.

import java.util.*;
public class ElementFrequencyCheckArray
{
	public  static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter "+size+" elements : ");
		for(int i = 0; i< size; i++)
		{
			arr[i] = sc.nextInt();
		}
		boolean isMajority = false;
		int count = 0;
		for(int i = 0; i<size; i++)
		{
			for(int j = 0; j<size; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.print("\nThe frequency of "+arr[i]+" is "+count);
			count = 0;
		}
	}
}