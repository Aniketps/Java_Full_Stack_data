// 1) Floyd’s Triangle
import java.util.*;

public class Dprogram01
{
	public static void main(String x[])
	{
		int count = 1;
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(j<=i)
				{
					System.out.print(count);
					count++;
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