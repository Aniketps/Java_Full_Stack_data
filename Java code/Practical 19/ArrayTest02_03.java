// Q.3 Write a java program to take 5 elements and display only odd  number from array.

import java.util.*;
public class ArrayTest02_03
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter 5 digits : ");
		for(int i = 0; i<5; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int j = 0; j<5; j++)
		{
			if(arr[j]%2!=0){
				System.out.print(arr[j]+" ");
			}
		}
	}
}