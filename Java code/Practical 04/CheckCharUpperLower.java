// Write a java program to check whether a character is uppercase or lowercase alphabet.

import java.util.*;
public class CheckCharUpperLower
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		char data;
		System.out.print("Enter character : ");
		data = Ani.next().charAt(0);
		if(data >= 'A' && data <= 'Z')
		{
			System.out.println("Character is uppercase");
		}
		if(data >= 'a' && data <= 'z')
		{
			System.out.println("Character is lowercase");
		}
	}
}