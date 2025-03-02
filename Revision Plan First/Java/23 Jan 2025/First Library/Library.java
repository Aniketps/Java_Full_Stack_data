/*

1. Library Book Management
Task:
 Create a Book class with fields: title, author, and price.
 In the main method:
Create two individual Book objects.
Compare the prices of the two books and print the title of the more expensive book.
Explanation:
 This task teaches object instantiation and accessing instance variables directly to perform comparisons.

*/

import java.util.*;

class Library
{
	public static void main(String ...a)
	{
		Book books[] = new Book[5];
		books[0] = new Book("Atomic Habits", "James Clear", 500);
		books[1] = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 400);
		books[2] = new Book("The Alchemist", "Paulo Coelho", 300);
		books[3] = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", 350);
		books[4] = new Book("Ikigai: The Japanese Secret to a Long and Happy Life", "Francesc Miralles", 320);

		Book ExpensiveBook = books[0];
		for(Book b: books)
		{
			if(b.getPrice()>ExpensiveBook.getPrice())
			{
				ExpensiveBook = b;
			}
		}
		System.out.println("The most Expansive book details");
		System.out.println("Title : "+ExpensiveBook.getTitle());
		System.out.println("Author : "+ExpensiveBook.getAuthor());
		System.out.println("Price : "+ExpensiveBook.getPrice());
	}
}