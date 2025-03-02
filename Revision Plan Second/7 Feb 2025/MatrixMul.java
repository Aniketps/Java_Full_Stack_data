/*

1. Matrix Multiplication
Write a program to multiply two matrices. The program should take two matrices as input and return
their product if the multiplication is possible (i.e., the number of columns of the first matrix equals the
number of rows of the second matrix).
Input:
Matrix A with dimensions m x n
Matrix B with dimensions n x p
Output:
A matrix of size m x p representing the product of A and B.
Example:
Matrix A:
1 2 3
4 5 6
Matrix B:
7 8
9 10
11 12
Output:
58 64
139 154

*/
import java.util.*;

class MatrixMul
{
	public static void main(String ...a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Matrix size : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		int m1[][] = new int[m][n];
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<n;j++)
			{
				m1[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		
		System.out.print("2. Matrix size  only p: ");
		int p = sc.nextInt();
		sc.nextLine();
		int m2[][] = new int[n][p];
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<p;j++)
			{
				m2[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		int m3[][] = new int[m][p];
		for(int i = 0; i<m; i++)
		{
       			for(int j = 0; j<p; j++)
       			{
              			int total = 0;
              			for(int k = 0; k<n; k++)
              			{
                    			total = total + (m1[i][k] * m2[k][j]);
              			}
             		 	m3[i][j] = total;
       			}
		}
		System.out.println("OutPut");
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<p;j++)
			{
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
