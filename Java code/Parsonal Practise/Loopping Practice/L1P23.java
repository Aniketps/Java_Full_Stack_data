// Q23. WAP to print the following pattern?

import java.util.*;
public class L1P23
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<13; i++)
		{
			for(int j = 0; j<7; j++)
			{
				if((i <= j && i<7) || (12-i)<=j)
				{
					System.out.print(j+1);
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