// Q12. WAP to print the following pattern?

import java.util.*;
public class L1P12
{
	public static void main(String ...x)	
	{
		boolean isOne = true;
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<5; j++)
			{
				System.out.print(isOne? "1" : "0");
				isOne = !isOne;
			}
			System.out.println();
		}
	}
}