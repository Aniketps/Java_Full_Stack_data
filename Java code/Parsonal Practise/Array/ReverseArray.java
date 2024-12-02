// Q3. Write a java program to display the reverse array.

import java.util.*;
public class ReverseArray
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
		
		int half = size/2;
		for(int i = 0, j = arr.length-1; i<half; i++,j--)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.print("\nThe reverse array is : ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}		
	}
}