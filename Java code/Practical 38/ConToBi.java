// Q4. WAP to create class name as ConvertDecimalToBinary 
// ConvertDecimalToBinary(int): this constructor is used for accept integer as parameter 
// Vodi showBinary(): this function can convert decimal number to binary and display it.

import java.util.*;

class ConvertDecimalToBinary
{
	int n;
	ConvertDecimalToBinary(int n)
	{
		this.n = n;
	}
	void showBinary()
	{
		int end = 1;
		if(n==0)
		{
			System.out.print(0);
		}
		while(true)
		{
			if(n<=end)
			{
				break;
			}
			end = end + end;
		}
		end = end/2;
		for(int i = end; i>=1;)
		{
			if(n-i>0)
			{
				System.out.print(1);
				n = n - i;
			}
			else
			{
				System.out.print(0);
			}
			i = (i-(i%2))/2;
		}
		System.out.print(n%2);
	}
}

class ConToBi
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A number : ");
		int n = sc.nextInt();
		sc.nextLine();
		ConvertDecimalToBinary convertDecimalToBinary = new ConvertDecimalToBinary(n);
		convertDecimalToBinary.showBinary();
	}
}