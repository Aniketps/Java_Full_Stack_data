// Q7. WAP to print the following pattern?

import java.util.*;
public class L1P7
{
	public static void main(String ...x)
	{
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<9; j++)
			{
				if(i<5)
				{
					if(i%2==0)
					{
						if(j%2==0 && (9-i>=j && Math.abs(5-j) <= 5-i))
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
						if(j%2!=0 && (9-i>=j && Math.abs(5-j) <= 5-i))
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
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<9; j++)
			{
				if(i<5)
				{
					if(i%2==0)
					{
						if(j%2==0 && (4-i<= j && i+4 >= j))
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
						if(j%2!=0 && (4-i<= j && i+4 >= j))
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