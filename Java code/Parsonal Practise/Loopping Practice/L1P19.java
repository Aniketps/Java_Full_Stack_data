// Q19. WAP to print the following pattern?

import java.util.*;
public class L1P19
{
	public static void main(String ...x)	
	{
		for(int i = 1; i<=5; i++)
		{
			for(int j = 0; j<9; j++)
			{
				if(5-i<=j && i+3>=j)
				{
					System.out.print(Math.abs(((i*2) - 1) - ( Math.abs(j-4) ) )+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}