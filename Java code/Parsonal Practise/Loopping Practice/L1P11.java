// Q11. WAP to print the following pattern?

import java.util.*;
public class L1P11
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<5; j++)
			{
				if(i>=j)
				{
					System.out.print(i+1);
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