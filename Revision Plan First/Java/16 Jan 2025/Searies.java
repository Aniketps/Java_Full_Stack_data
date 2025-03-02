// Q4. Write a java program to display following series using looping : Series:2  729  4  512  6  343  8  216  10  125  12  64  14  27  16  8  18  1

import java.util.*;
class Searies
{
	public static void main(String ...a)
	{
		int num1 = 0;
		for(int i = 0; i<9; i++)
		{
			// for first digit
			num1 = num1 + 2;
			System.out.print(num1+" ");
		
			// for second digit
			int num2 = 1;
			for(int j = 0; j<3; j++)
			{
				num2 = num2 * (9-i);
			}
			System.out.print(num2+" ");
		}
	}
}