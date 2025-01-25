// WAP to create POJO class name as Book  with field id,name and price and author and input the book details and display it.

import java.util.*;
public class BookLibrary
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		Library library = new Library();
		
		System.out.print("What is book id: ");
		int id = sc.nextInt();
		book.setID(id);
		
		System.out.print("What is book name: ");
		String Name = sc.next();
		book.setName(Name);
		
		System.out.print("What is book price: ");
		int Price = sc.nextInt();
		book.setPrice(Price);

		library.setBook(book);
		library.getBook(book);
		
	}
}

class Library{
	private Book book;
	
	void setBook(Book book)
	{
		book = book;
	}
	void getBook(Book book)
	{
		System.out.println("Book ID is : "+book.getID());
		System.out.println("Book Name is : "+book.getName());
		System.out.println("Book Price is : "+book.getPrice());
	}
}

class Book
{
	private int ID;
	private String Name;
	private int Price;

	void setID(int id)
	{
		ID = id;
	}
	public int getID()
	{
		return ID;
	}
	
	void setName(String name)
	{
		Name = name;
	}
	public String getName()
	{
		return Name;
	}

	void setPrice(int price)
	{
		Price = price;
	}
	public int getPrice()
	{
		return Price;
	}
}