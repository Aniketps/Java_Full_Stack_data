// Q8. WAP to print the following pattern?

import java.util.*;
public class L1P8
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<=9; i++)
		{
			for(int j = 0; j<=9; j++)
			{
				if(i<5)
				{
					if(i%2==0)
					{
						if(j%2==0 && (4-i==j || i+4==j))
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
						if(j%2!=0 && (4-i==j || i+4==j))
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
						if(j%2!=0 && (i-5==j || 9-(i-4)==j))
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
						if(j%2==0 && (i-5==j || 9-(i-4)==j))
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
			System.out.println();
		}
	}
}