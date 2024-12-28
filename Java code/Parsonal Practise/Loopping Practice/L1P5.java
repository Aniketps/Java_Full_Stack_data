// Q5. WAP to print the following pattern?

import java.util.*;
public class L1P5
{
	public static void main(String ...x)
	{
		for(int i = 0; i<9; i++)
		{
			for(int j = 0; j<5; j++)
			{
				if(j<=i && 9-i > j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
	}
}