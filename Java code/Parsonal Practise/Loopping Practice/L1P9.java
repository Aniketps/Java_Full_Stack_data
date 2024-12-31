// Q9. WAP to print the following pattern?

import java.util.*;
public class L1P9
{
	public static void main(String ...x)	
	{
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<9; j++)
			{
				if(i%2==0)
				{
					if(j%2==0 && 5+i>=j && 4-i<=j)
					{
						System.out.print(((i+j)==4 ||(j-i)==4)? "1" : (i==4 && j== 4)? "6" : i);
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if(j%2!=0 && 5+i>=j && 4-i<=j)
					{
						System.out.print(((i+j)==4 ||(j-i)==4)? "1" : (i==4 && j== 4)? "6" : i);
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}