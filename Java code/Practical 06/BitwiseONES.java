// BitwiseONES

import java.util.*;
public class BitwiseONES
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int a, c;
		System.out.print("Enter first : ");
		a = Ani.nextInt();
		c = ~a; 		
		System.out.println("C = " + c);
	}
}