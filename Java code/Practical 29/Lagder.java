// Q1. WAP to create billing application 
// Classes 
// Customer : id,name and mobile mark as POJO class
// Product class: id,name,price,qty,rate 
// Bill class contain method 
// void calBill(Customer c,Product …p): this function can accept single customer detail and multiple product details and your output should like as

import java.util.*;
public class Lagder
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Products has been purchased: ");
		int size = sc.nextInt();
		
		Product product[] = new Product[size];
		Customer customer = new Customer();
		
		String Name;
		int Quantity;
		int Rate;

		System.out.print("\nCustomer ID: ");
		int CusID = sc.nextInt();
		customer.setID(CusID);
		System.out.print("\nCustomer Name: ");
		String CusName = sc.nextLine();
		customer.setName(CusName);
		System.out.print("\nCustomer Name: ");
		String CusPhone= sc.nextLine();
		customer.setPhoneNum(CusPhone);

		for(int i = 0; i<size; i++)
		{
			product[i] = new Product();
			System.out.print(i+1+" Product Name: ");
			Name = sc.next();
			product[i].setName(Name);
			System.out.print(i+1+" Product Price: ");
			Rate = sc.nextInt();
			product[i].setRate(Rate);
			System.out.print(i+1+ " Product Quantity: ");
			Quantity = sc.nextInt();
			product[i].setQuantity(Quantity);
		}
		
		CalBill calBill = new CalBill();
		calBill.setData(customer, product);

		calBill.getData();
	}
}

class CalBill
{
	Product product[];
	Customer customer;

	void setData(Customer c , Product ...p)
	{
		customer = c;
		product = p;
	}

	void getData()
	{
		int total = 0;
		System.out.print("\nProduct Name\t Quantity \t Rate \t Total");
		for(int i = 0; i<product.length; i++)
		{
			total = total + (product[i].getQuantity() * product[i].getRate());
			int multi = (product[i].getQuantity() * product[i].getRate());
			System.out.print("\n"+product[i].getName()+"\t\t     "+product[i].getQuantity()+"\t\t"+product[i].getRate()+ " \t "+multi);
		}
		System.out.print("\nComplete:\t \t \t \t"+ total);
	}
}

class Product
{
	// Variables to store product data id,name,qty,rate
	int ID;
	String Name;
	int Quantity;
	int Rate;
	
	// Setter methods for all data
	void setID(int id)
	{
		ID = id;
	}
	void setName(String name)
	{
		Name = name;
	}
	void setQuantity(int qty)
	{
		Quantity = qty;
	}
	void setRate(int rate)
	{
		Rate = rate;
	}

	// Getter methods for all data
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	int getQuantity()
	{
		return Quantity;
	}
	int getRate()
	{
		return Rate;
	}	
}

class Customer
{
	// Store User data for manupulations id,name and mobile
	int ID;
	String Name;
	String PhoneNum;

	// Setter methods for all variables
	void setID(int id)
	{
		ID = id;
	}
	void setName(String name)
	{
		Name = name;
	}
	void setPhoneNum(String Phone)
	{
		PhoneNum = Phone;
	}

	// Getter methods for all variables
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	String getPhoneNum()
	{
		return PhoneNum;
	}
}