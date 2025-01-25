// Q18. WAP to print the following pattern?

import java.util.*;
public class L1P18
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<11; i++)
		{
			for(int j = 0; j<11; j++)
			{
				if((5-i==j && i<=5) || (i-5==j && i>5) || (10-(i-5)==j && i>=5) || (5+i==j && i<=5))
				{
					System.out.print((char) (65 + (i<=5? i : 10-i)));
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