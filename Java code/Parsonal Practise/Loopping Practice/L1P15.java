// 15. WAP to print the following pattern?

import java.util.*;
public class L1P15
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<6; i++)
		{
			for(int j = 0; j<6; j++)
			{
				if(i>=j)
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