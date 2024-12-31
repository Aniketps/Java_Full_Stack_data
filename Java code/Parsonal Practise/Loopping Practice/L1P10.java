// Q10. WAP to print the following pattern?

import java.util.*;
public class L1P10
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<7; i++)
		{
			for(int j = 0; j<7; j++)
			{
				if(3-i<=j && 3+i>=j && i-3<=j && 6-(i-3)>=j)
				{
					System.out.print((j-1<3)? Math.abs(5 - (j+1)) : Math.abs(5 - (j+3)));
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