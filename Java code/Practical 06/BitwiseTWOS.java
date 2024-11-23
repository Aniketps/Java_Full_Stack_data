// BitwiseTWOS

import java.util.*;
public class BitwiseTWOS
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int a, c;
		System.out.print("Enter first : ");
		a = Ani.nextInt();
		c = ~a+1; 		
		System.out.println("C = " + c);
	}
}