// 1. Matrix Multiplication using Constructors
// Problem: Create a class Matrix with a constructor that takes two matrices as input (both matrices will have the same dimensions). Implement a matrix multiplication operation using a constructor, and return the result as a new matrix.

import java.util.*;

class Matrix
{
	int m1[][];
	int m2[][];
	int m3[][];
	Scanner sc = new Scanner(System.in);
	Matrix(int r, int c)
	{
		m1 = new int[r][c];
		m2 = new int[r][c];
		m3 = new int[r][c];
	}
	void setMatrix()
	{
		for(int i = 0; i<m1.length; i++)
		{
			for(int j = 0; j<m1[i].length; j++)
			{
				System.out.print("("+i+","+j+") : ");
				m1[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
		System.out.println("For second matrix");
		for(int i = 0; i<m2.length; i++)
		{
			for(int j = 0; j<m2[i].length; j++)
			{
				System.out.print("("+i+","+j+") : ");
				m2[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
	}
	void matrixMul()
	{
		for(int i = 0; i<m3.length; i++)
		{
			for(int j = 0; j<m3[i].length; j++)
			{
				int total = 0;
				for(int k = 0; k<m3[i].length; k++)
				{
					total = total + (m1[i][k]*m2[k][j]);
				}
				m3[i][j] = total;
			}
		}
		System.out.println("The matrix Multiplication is");
		for(int i = 0; i<m3.length; i++)
		{
			System.out.print("|");
			for(int j = 0; j<m3[i].length; j++)
			{
				System.out.print(m3[i][j]+" ");
			}
			System.out.print("|");
			System.out.println();
		}
	}
}

class MatrixCal
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Matrix size : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		Matrix matrix = new Matrix(a,b);
		matrix.setMatrix();
		matrix.matrixMul();
	}
}