// Q4. WAP to print the following pattern?

import java.util.*;
public class L1P4
{
	public static void main(String ...x)
	{
		for(int i = 0; i<5; i++)
		{
			for(int j = 1; j<=9; j++)
			{
				if(i>=j-5)
				{
					if((Math.abs(5-i)==j || Math.abs(5+i)==j) || (i==4 && j%2!=0))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
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