// Q14. WAP to print the following pattern?

import java.util.*;
public class L1P14
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<9; i++)
		{
			int count = 1;
			for(int j = 0; j<9; j++)
			{
				if(i<5)
				{
					if(i%2==0)
					{
						if(j%2==0 && i<=j && 9-i>j)
						{
							System.out.print((count + i) );
							count++;
						}
						else
						{
							System.out.print(" ");
						}
					}
					else
					{
						if(j%2!=0 && i<=j && 9-i>j)
						{
							System.out.print(count + i);
							count++;
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
						if(j%2==0 && 4-(i-4)<=j && (i) >= j)
						{
							System.out.print(count + Math.abs(5 - i));
							count++;
						}
						else
						{
							System.out.print(" ");
						}
					}
					else
					{
						if(j%2!=0 && 4-(i-4)<=j && (i) >= j)
						{
							System.out.print(count + Math.abs(5 - i));
							count++;
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