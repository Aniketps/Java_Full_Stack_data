// Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.*;
public class CheckCharVowelConsonant
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		char data;
		System.out.print("Enter character : ");
		data = Ani.next().charAt(0);
		if(data == 'a' || data == 'e' || data == 'i' || data == 'o' || data == 'u' || data == 'A' || data == 'E' || data == 'I' || data == 'O' || data == 'U')
		{
			System.out.println("Character is Vowel");
		}
		else
		{
			System.out.println("Character is Consonant");
		}
	}
}