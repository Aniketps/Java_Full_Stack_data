// Q1. WAP to create class name as Power with Parameterized constructor 
// Power(int,int): create constructor and accept two parameters in it.
// Int getPower(): this function can calculate power of a number and return it.

import java.util.*;
class  Power
{
	int n;
	int p;
	Power(int n, int p)
	{
		this.n = n;
		this.p = p;
	}
	int getPower()
	{
		int power = 1;
		for(int i = 0; i<p; i++)
		{
			power = power * n;
		}
		return power;
	}
}

class CalPower
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter power : ");
		int p = sc.nextInt();
		sc.nextLine();
		
		Power power = new Power(n,p);
		System.out.println("The power is : "+power.getPower());
	}
}