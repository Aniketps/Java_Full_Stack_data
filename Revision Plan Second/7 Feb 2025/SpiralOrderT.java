/*

2. Spiral Order Traversal
Write a program that prints the elements of a 2D matrix in a spiral order, starting from the top-left
corner.
Input:
A 2D matrix of any size m x n
Output:
The elements of the matrix printed in a spiral order.
Example:
Input Matrix:
1 2 3
4 5 6
7 8 9
Output:
1 2 3 6 9 8 7 4 5

*/
import java.util.*;

class SpiralOrderT
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Matrix size : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.nextLine();
		int m[][] = new int[x][y];
		for(int i = 0; i<x;i++)
		{
			for(int j = 0; j<y; j++)
			{
				m[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		System.out.println("Output");
		for(int i  = 0; i<x; i++)
		{
			if(i%2 == 0)
			{
				for(int j = 0; j<y; j++)
				{
					System.out.print(m[i][j]+" ");
				}
			}
			else
			{
				for(int j = y-1; j>=0; j--)
				{
					System.out.print(m[i][j]+" ");
				}
			}
		}
	}
}