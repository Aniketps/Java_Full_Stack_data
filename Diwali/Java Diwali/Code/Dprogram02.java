// 2) Pascal’s Triangle

import java.util.*;

public class Dprogram02
{
	public static void main(String x[])
	{
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				if(j == 0 || j == i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}