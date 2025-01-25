// Problem 

import java.util.*;
public class MCQ14
{
	public static void main(String args[])
	{
		byte x = 64;
         	int i;
         	byte y; 
         	i = x << 2; // 1000000 = 100000000 = 256
        	y = (byte) (x << 2); // 268435456
	        System.out.print(i + "\t" + y);

	}
}