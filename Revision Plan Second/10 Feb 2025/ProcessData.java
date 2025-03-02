/*

Find a pair in an array that sums to a specific value
Find two elements in the array that sum to a given target value.
Example:
Array: [1, 4, 6, 2, 8, 3]
Target Sum: 10
Expected output:
A pair that sums to 10: (2, 8) or (6, 4).

Your Task: You have to write class name as FindSum with constructor and methods 
FindSum(int a[]): this function is used for accept array as parameter 
Void findPair(): this function is used for find the pair of element 
Void show(): this function can show the pair of sum

*/

import java.util.*;
class FindSum
{
	Scanner sc = new Scanner(System.in);
	int arr[];
	FindSum(int a[])
	{
		arr = a;
	}
	void findPair()
	{
		System.out.print("Target : ");
		int target = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length - 1; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					System.out.print("[ "+arr[i]+", "+arr[j]+" ]");
				}
			}
		}
	}
}
class ProcessData
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Size : ");
		int size = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		FindSum findSum = new FindSum(arr);
		findSum.findPair();
	}
}