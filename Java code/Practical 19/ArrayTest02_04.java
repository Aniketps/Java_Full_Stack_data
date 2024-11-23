// Q.4 Write a java program to take 5 elements and display elements which are multiple of 5.

import java.util.*;
public class ArrayTest02_04
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
			if(arr[j]%5==0){
				System.out.print(arr[j]+" ");
			}
		}
	}
}