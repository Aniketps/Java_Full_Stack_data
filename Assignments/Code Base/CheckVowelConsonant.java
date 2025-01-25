// Write a Java program to check whether an alphabet is vowel or consonant using 
// if else. How to check vowels and consonants using if else in Java programming. Java 
// Program to input a character from user and check whether it is vowel or 
// consonant. Logic to check vowel or consonant in Java programming.

import java.util.*;
public class CheckVowelConsonant
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		char data;		
		System.out.print("Enter character : ");
		data = sc.next().charAt(0);
		
		if((data == 'a') || (data == 'e') || (data == 'i') || (data == 'o') || (data == 'u') || (data == 'A') || (data == 'E') || (data == 'I') || (data == 'O') || (data == 'U'))
		{
			System.out.println(data + " is vowel");
		}
		else
		{
			System.out.println(data + " is consonant");	
		}
	}
}