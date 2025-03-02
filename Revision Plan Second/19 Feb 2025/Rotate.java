/*

2.Rotate an array by k positions
Rotate the elements of the array k times to the left or right.
Example: Rotate an array to the right by k positions. For example, if the input array is [1, 2, 3, 4, 5] and k = 2, 
The output should be [4, 5, 1, 2, 3].

*/
import java.util.*;

class Rotate
{
	public static void main(String ...a)
	{
		int arr[] = {1,2,3,4,5};
		int k = 2;
		for(int i = k+1; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i = 0; i<=k; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}