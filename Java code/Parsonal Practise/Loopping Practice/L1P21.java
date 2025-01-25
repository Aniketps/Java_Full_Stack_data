// Q21. WAP to print the following pattern?

import java.util.*;
public class L1P21
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<12; i++)
		{
			for(int j = 0; j<7; j++)
			{
				if((i >= j && i<5) || (7 - (i-4) >= j && i>4) )
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