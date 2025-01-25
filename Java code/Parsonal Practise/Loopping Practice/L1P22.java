// Q22. WAP to print the following pattern?

import java.util.*;
public class L1P22
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<7; i++)
		{
			for(int j = 0; j<7; j++)
			{
				if(7-i > j)
				{
					System.out.print(7-j);
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