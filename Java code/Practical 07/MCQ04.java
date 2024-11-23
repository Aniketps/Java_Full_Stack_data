// Problem 

import java.util.*;
public class MCQ04
{
	public static void main(String args[])
	{
		Scanner Ani = new Scanner(System.in);
		int i = 4;
        	int j = 21;                                                            //  37-21 = 16
        	int k = ++i * 7 + 2 - j--; // 5*7+2-20 = 35+2-20 = 37-20 = 17
        	System.out.println("k = " + k + " j = "+ j);


	}
}