/*

Q1. Write a java program to display following pattern : 
1     2    3    4    5 
10   9    8    7    6 
11  12  13  14  15 
20  19  18  17  16 
21  22  23  24  25

*/

import java.util.*;

class RevisionP1
{
	public static void main(String ...a)
	{
		int count = 1;
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<5; j++)
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
		}
	}
}