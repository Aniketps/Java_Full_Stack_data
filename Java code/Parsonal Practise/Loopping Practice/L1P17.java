// Q17. WAP to print the following pattern?

import java.util.*;
public class L1P17
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<6; i++)
		{
			for(int j = 0; j<11; j++)
			{
				if(5-i<=j && i+5>=j)
				{
					System.out.print((char) (65 - ((5-j)-i)));
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