// Write a java program to input any  and check whether it is alphabet or digit.

import java.util.*;
public class CheckCharAlphabetDigit
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		char data;
		System.out.print("Enter character : ");
		data = Ani.next().charAt(0);
		if((data >= 'a' && data <= 'z') || (data >= 'A' && data <= 'Z'))
		{
			System.out.println("Character is alphabet");
		}
		else
		{
			System.out.println("Character is digit");
		}
	}
}