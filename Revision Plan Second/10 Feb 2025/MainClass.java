/*

Move all negative numbers to the beginning
Rearrange the array such that all negative numbers are moved to the front.
Example:
 Original Array: [1, -3, 2, -2, 5, -1, 4] 
Rearranged Array: [-3, -2, -1, 1, 2, 5, 4]
Your Task:  You have to create class name as MoveNegative with constructor and methods 
MoveNegative(int a[]): this constructor accept the array as parameter 
void moveNegative(): this function can shift all negative values 
int [] getResult(): this function can return resultant array

*/
import java.util.*;

class MoveNegative
{
	int arr[];
	MoveNegative(int a[])
	{
		arr = a;
	}
	boolean dummy[];
	void moveNegative()
	{
		dummy = new boolean[arr.length];
		int newArr[] = new int[arr.length];
		int count = 0;
		for(int i = 0 ; i<arr.length; i++)
		{
			if(arr[i] < 0)
			{
				dummy[i] = true;
			}
		}
		for(int i = 0; i<arr.length; i++)
		{
			if(dummy[i])
			{
				newArr[count] = arr[i];
				count++;
			}
		}
		for(int i = 0; i<arr.length; i++)
		{
			if(!dummy[i])
			{
				newArr[count] = arr[i];
				count++;
			}
		}
		arr = newArr;
	}
	int [] getResult()
	{
		return arr;
	}
}

class MoveNum
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
		MoveNegative move = new MoveNegative(arr);
		move.moveNegative
	}
}