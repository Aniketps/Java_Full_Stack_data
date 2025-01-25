// Q1. WAP to create class name as Table with two functions 
// void setValue(): this function is used for accept number from keyboard 
// void showTable(): this function can display the table of number 

import java.util.*;

class Table
{
	int number;
	Scanner sc = new Scanner(System.in);
	void setValue()
	{
		System.out.print("Enter A number : ");
		number = sc.nextInt();
	}
		
	void showTable()
	{
		System.out.println("The table is");
		for(int i = 1; i<=10; i++)
		{
			System.out.println(number*i);
		}
	}
}

public class CreateTable
{
	public static void main(String ...x)
	{
		Table obj = new Table();
		obj.setValue();
		obj.showTable();
	}
}