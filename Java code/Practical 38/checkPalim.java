// Q2. WAP to create class Palim with parameterized constructor 
// Palim(int): this constructor can accept number as parameter 
// Boolean isPalim(): this method can check number is palimdrome or not if palimdrome return true otherwise return false

import java.util.*;

class Palim
{
	int n;
	Palim(int n)
	{
		this.n = n;
	}
	Boolean isPalim()
	{
		String nS = Integer.toString(n);
		for(int i = 0, j = nS.length() -1; i<nS.length(); j--, i++ )
		{
			if(nS.charAt(i) != (nS.charAt(j)))
			{
				return false;
			}
		}
		return true;
	}
}

class checkPalim
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		sc.nextLine();
		Palim palim = new Palim(n);
		if(palim.isPalim())
		{
			System.out.println("Number is Palimdrome");
		}
		else
		{
			System.out.println("Number is not Palimdrome");
		}
	}
}