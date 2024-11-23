// 4) Hollow Diamond Pattern

import java.util.*;

public class Dprogram04
{
	public static void main(String x[])
	{
		for(int i = 1; i<=9; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(i-5==2-j)
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