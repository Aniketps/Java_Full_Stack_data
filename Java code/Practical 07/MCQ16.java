// Problem 

import java.util.*;
public class MCQ16
{
	public static void main(String args[])
	{
		int a = 1;
         	int b = 2;
         	int c = 3;
         	a |= 4;  // 001|100 = 101 = 5
         	b >>= 1; // 10 = 1 = 1
         	c <<= 1; // 11 = 110 = 6
         	a ^= c; // 101 ^ 110 = 011 = 3
         	System.out.println(a + " " + b + " " + c);

	}
}