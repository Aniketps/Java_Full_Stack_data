/*

Q2. Write a java program to create class name as OccurenceApp using contsructor name as :

	OccurenceApp(int [ ])
	{
		//  count even and odd number in array.
	}
	
	OccurenceApp(char [ ])
	{
		//  count vowel and consonent charcter in string.
	}

*/

import java.util.*;

class OccurenceApp
{
	OccurenceApp(int a[])
	{
		int evenCount = 0;
		int oddCount = 0;
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Even count is "+evenCount+" and Odd count is "+oddCount);
	}
	OccurenceApp(char a[])
	{
		int vowelCoiunt = 0;
		int consonentCount = 0;
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]=='a' || a[i]=='e' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u' || a[i]=='A' || a[i]=='E' ||a[i]=='I' ||a[i]=='O' ||a[i]=='U')
			{
				vowelCoiunt++;
			}
			else if(('a'<=a[i] && a[i]<='z') || ('A'<=a[i] && a[i]<='Z'))
			{
				consonentCount++;
			}
		}
		System.out.println("The count of vowels is "+vowelCoiunt+" and count of consonent is "+consonentCount);
	}
}

class CountApp
{
	public static void main(String ...x)	
	{
		OccurenceApp occurenceApp  = new OccurenceApp(new int[]{12,45,41,10,52,62,45,84,20});
		occurenceApp  = new OccurenceApp(new char[]{'a','b','c','d','e','A','I','D','z','O','I','D','z','O','K','L'});
	}
}