// Problem 

import java.util.*;
public class MCQ
{
	public static void main(String args[])
	{
		int i = 50;
		System.out.print(~i); // -51
		System.out.print(","); // ,
		System.out.print(~--i); // -50 
		System.out.print(",");
		System.out.print(~++i); // -51
	}
}