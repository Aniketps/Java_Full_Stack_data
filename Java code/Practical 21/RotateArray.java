// Q6. Write a java program to rotate array in specific index.

import java.util.*;
public class RotateArray
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
		
		System.out.print("\nFrom which index to rotate array: ");
		int index = sc.nextInt();
		
		System.out.println("The rotated array is : ");
		for(int i = index; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i = 0; i<index; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}