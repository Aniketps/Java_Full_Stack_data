// 1) WAP to enter the five elements in array and show it

import java.util.*;
public class ArrayTest01
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
			System.out.print(arr[j]+" ");
		}
	}
}