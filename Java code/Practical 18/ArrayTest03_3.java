// 3)WAP to enter the five element and display in ascending order ?

import java.util.*;
public class ArrayTest03_3
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
		for(int i = 0; i<5-1; i++)
		{
			for(int j = 0; j<5-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}