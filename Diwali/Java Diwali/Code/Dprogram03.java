// 3)Pattern 

import java.util.*;

public class Dprogram03
{
	public static void main(String x[])
	{
		for(int i = 1; i<=10; i++)
		{
			for(int j = 1; j<=20; j++)
			{
				if(j<=i || i>=21-j)
				{
					System.out.print(j<10?j:21-j);
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