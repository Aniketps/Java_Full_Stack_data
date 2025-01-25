// Q3. WAP to create class name as ConvertDecimalToRoman 
// ConvertDecimalToRoman(int decimal): this constructor can accept decimal number 
// Void showRoman(): this function can convert a decimal number to roman and display it.

import java.util.*;

class ConvertDecimalToRoman
{
	ConvertDecimalToRoman(int d)
	{
		showRoman(d);
	}

	int showRoman(int d)
	{
		// 10:X, 50:L, 100:C, 500: D
		// limit 999
		if(d>999 || d<0){return 0;}
		if(d==100)
		{
			System.out.println("C");
		}
		else if(d<100)
		{
			if(d<100)
			{
				if(d==50)
				{
					System.out.println("L");
				}
				else if (d<50)
				{
					if(d==10)
					{
						System.out.println("X");
					}
					else if(d<10)
					{
						if(d==5)
						{
							System.out.println("V");
						}
						else if(d<5)
						{
							if(d==4)
							{
								System.out.print("IV");
								return 0;
							}
							else if(d==3)
							{
								System.out.print("III");
								return 0;
							}
							else if(d==2)
							{
								System.out.print("II");
								return 0;
							}
							else
							{
								System.out.print("I");
								return 0;	
							}
						}
						else
						{
							if(d==9)
							{
								System.out.print("IX");
							}
							else
							{
								System.out.print("V");
								return showRoman(d-5);
							}
						}
					}
					else
					{
						if(d==40)
						{
							System.out.print("XL");
							return 0;
						}
						else if(d<=49 && d>40)
						{
							System.out.print("XL");
							return showRoman(d-40);
						}
						else
						{
							System.out.print("X");
							return showRoman(d-10);
						}
					}
				}
				else
				{
					if(d==99)
					{
						System.out.print("XC");
						return showRoman(d-90);
					}
					else if(d==90)
					{
						System.out.print("XC");
						return 0;
					}
					else if(d >90 && d<99)
					{
						System.out.print("XC");
						return showRoman(d-90);
					}
					else
					{
						System.out.print("L");
						return showRoman(d-50);
					}
				}
			}
			else
			{	
				
			}
		}
		else if (d>100 && d<=500)
		{
			if(d==500)
			{
				System.out.print("D");
				return 0;
			}
			if(d==400)
			{
				System.out.print("CD");
				return 0;
			}
			else if(d<=499 && d>400)
			{
				System.out.print("CD");
				return showRoman(d-400);
			}
			else
			{
				System.out.print("C");
				return showRoman(d-100);
			}
		}
		else
		{
			if(d==900)
			{
				System.out.print("CM");
				return 0;
			}
			else if(d<=999 && d>900)
			{
				System.out.print("CM");
				return showRoman(d-400);
			}
			else
			{
				System.out.print("D");
				return showRoman(d-500);
			}
		}
		return 0;
	}
}

class ConvToDec
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Decimal Number : ");
		int n = sc.nextInt();
		sc.nextLine();
		ConvertDecimalToRoman convertDecimalToRoman = new ConvertDecimalToRoman(n);
	}
}