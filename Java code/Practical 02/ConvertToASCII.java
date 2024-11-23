// Write a Java program to print the ASCII value of a given character

import java.util.*;
public class ConvertToASCII
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		// String Data = Ani.nextLine();
		System.out.println("Enter Any latter A to Z");
		char newData = Ani.next().charAt(0);
		int Value = (int) newData;
		System.out.println("ASCII Value is : " + Value);
	}
}