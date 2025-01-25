// 16. WAP to print the following pattern?

import java.util.*;
public class L1P16
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<12; i++)
		{
			for(int j = 0; j<6; j++)
			{
				if((5-i>=j || i>5) && ((i-5)>j || i<=5))
				{
					System.out.print((char) (65+j));
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