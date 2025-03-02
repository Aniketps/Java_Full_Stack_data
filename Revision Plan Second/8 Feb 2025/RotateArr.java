/*

2.Rotate an array by k positions
Rotate the elements of the array k times to the left or right.
Example: Rotate an array to the right by k positions. For example, if the input array is [1, 2, 3, 4, 5] and k = 2, 
The output should be [4, 5, 1, 2, 3].

Your Task:  You have to create class name RotateArray with following function 
void setArray(int a[]): this function can accept array as parameter
 void rotate(int k): this function help us to rotate array from left to right
 Int [] getResult(): this function can return resultant array

*/
import java.util.*;

class RotateArr
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size : ");
		int size = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[size];
		for(int i = 0; i<size; i++)
		{
			System.out.print(i+1+" element : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.print("Rotate from index : ");
		int index = sc.nextInt();
		sc.nextLine();
		for(int i = index; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i = 0; i<index;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}