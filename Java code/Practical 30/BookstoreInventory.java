// 3. Bookstore Inventory:
// Create a Book class with fields ID, title, and price.
// In the InventoryManager class, create methods to apply a discount to the price of a book and display the // book details with the new price after the discount.

import java.util.*;

public class BookstoreInventory
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Total Number of Books: ");
		int size = sc.nextInt();
		
		Book book[] = new Book[size];
		
		for(int i = 0; i<size; i++)
		{
			book[i] = new Book();	

			book[i].setID(i);
		
			System.out.print(i+1+" Book name : ");
			String name = sc.next();
			book[i].setName(name);

			System.out.print(i+1+" What is Book Price: ");
			int price = sc.nextInt();
			book[i].setPrice(price);
		}

		InventoryManager inventoryManager = new InventoryManager();
		inventoryManager.setBook(book);
		inventoryManager.getBook();
	}
}

class Book
{
	String Name;
	int price;
	int ID;

	void setName(String name)
	{
		Name = name;
	}
	void setPrice(int Price)
	{
		price = Price;
	}
	void setID(int id)
	{
		ID = id;
	}

	String getName()
	{
		return Name;
	}
	int getPrice()
	{
		return price;
	}
	int getID()
	{
		return ID;
	}
}

class InventoryManager
{
	Book book[];

	void setBook(Book ...b)
	{
		book = b;
	}
	void getBook()
	{
		int total = 0;
		for(int i = 0; i<book.length; i++)
		{
			double discount = book[i].getPrice() - ((book[i].getPrice()*10)/100);
			System.out.print("ID : "+book[i].getID()+" "+book[i].getName() + " price "+book[i].getPrice()+" New Price with 10% discount  "+ discount+"\n");
		}
	}
}