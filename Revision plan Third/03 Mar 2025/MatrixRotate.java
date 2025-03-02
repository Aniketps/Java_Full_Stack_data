/* Question1
____________________________________________________
Matrix Rotation (for 2D Matrices)
Rotating a matrix involves turning the matrix by 90 degrees (or multiples) clockwise or counterclockwise.

Example (90-degree clockwise rotation):

A = [1, 2, 3]
    [4, 5, 6]
    [7, 8, 9]
*/

import java.util.*;

class MatrixRotate
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Size (x,y) : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.nextLine();
		int arr[][] = new int[x][y];
		for(int i = 0; i<x; i++)
		{
			for(int j = 0; j<y; j++)
			{
				arr[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		System.out.println("90 degree rotated");
		for(int i = 0; i<y;i++)
		{
			for(int j = x-1; j>=0;j--)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}