// BitwiseAND

import java.util.*;
public class BitwiseAND
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int a, b, c;
		System.out.print("Enter first : ");
		a = Ani.nextInt();
		System.out.print("Enter second : ");
		b = Ani.nextInt();
		c = a & b;
		System.out.println("C = " + c);
	}
}