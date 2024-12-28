// Q3. WAP to print the following pattern?

import java.util.*;
public class L1P3
{
	public static void main(String x[])
	{
		for(int i = 1; i<=9; i++)
		{
			for(int j = 1; j<=9; j++)
			{
				if(i>Math.abs(j-5))
				{
					if(i<5)
					{
						if(i%2==0)
						{
							if(j%2==0)
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
							if(j%2!=0)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
						}
					}
					else
					{	
						if(i%2==0)
						{
							if(j%2==0 && i-5<j )
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
							if(j%2!=0 && i-5<j)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
						}
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