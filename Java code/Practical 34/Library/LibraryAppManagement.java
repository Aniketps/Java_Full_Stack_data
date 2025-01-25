import java.util.*;
class LibraryAppManagement
{
	Scanner sc = new Scanner(System.in);
	Book book[] = new Book[100];
	int CountOfBooks = 0;
	int MaxCountOfBooks = 100;
	int UniqueID = 1;
	void setBook()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		book[CountOfBooks] = new Book();
		
		// Set an unique index as ID to new book
		for(int i = 0; i<CountOfBooks; i++)
		{
			if(UniqueID == book[i].getID())
			{
				UniqueID++;
			}
		}
		book[CountOfBooks].setID(UniqueID);
		// Get title of new book from User
		System.out.print("What is new book name : ");
		book[CountOfBooks].setTitle(sc.nextLine());
		
		// Get author name from user for book
		System.out.print("What is Name of the Author : ");
		book[CountOfBooks].setAuthor(sc.nextLine());
		
		// Get Price from user for book
		System.out.print("How much is book cost  : ");
		book[CountOfBooks].setPrice(sc.nextInt());
		sc.nextLine();
		
		CountOfBooks++;
		System.out.println("Book has been added successfully");
	}

	void getAllBookDetails()
	{
		System.out.println("-------------------------------------------------------------------------------------\nAll Available books in Library");
		System.out.println("Book ID\t\tBook Title\tAuthor\t\tPrice");
		for(int i = 0; i<CountOfBooks; i++)
		{
			System.out.println(book[i].getID()+"\t\t"+book[i].getTitle()+"\t\t"+book[i].getAuthor()+"\t\t"+book[i].getPrice());
		}
	}

	void sortByAuthor()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Search by Author Name : ");
		String AuthorName = sc.nextLine();
		boolean isBookAvailable = false;
		System.out.println("All Available books in Library written by "+AuthorName);
		System.out.println("Book ID\t\tBook Title\tAuthor\t\tPrice");
		for(int i = 0; i<CountOfBooks; i++)
		{
			if(AuthorName.equals(book[i].getAuthor()))
			{
				System.out.println(book[i].getID()+"\t\t"+book[i].getTitle()+"\t\t"+book[i].getAuthor()+"\t\t"+book[i].getPrice());
				isBookAvailable = true;
			}
		}
		if(!isBookAvailable)
		{
			System.out.println("There is no any book available written by "+AuthorName);
		}
	}

	void searchByTitle()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Search by Title of book : ");
		String Title = sc.nextLine();
		boolean isBookAvailable = false;
		System.out.println("Book ID\t\tBook Title\tAuthor\t\tPrice");
		for(int i = 0; i<CountOfBooks; i++)
		{
			if(Title.equals(book[i].getTitle()))
			{
				System.out.println(book[i].getID()+"\t\t"+book[i].getTitle()+"\t\t"+book[i].getAuthor()+"\t\t"+book[i].getPrice());
				isBookAvailable = true;
			}
		}
		if(!isBookAvailable)
		{
			System.out.println("There is no any book available titled "+Title);
		}
	}
	void getBookCount()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("The total available count of books in library is "+CountOfBooks);
	}	
	void sortByID()
	{
		System.out.println("-------------------------------------------------------------------------------------\nAll Available books in Library sorted by id in ascending order ");
		System.out.println("Book ID\t\tBook Title\tAuthor\t\tPrice");
		for(int i = 0; i<CountOfBooks; i++)
		{
			System.out.println(book[i].getID()+"\t\t"+book[i].getTitle()+"\t\t"+book[i].getAuthor()+"\t\t"+book[i].getPrice());
		}
	}
	void updateBookData()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Update by Title of book : ");
		String Title = sc.nextLine();
		boolean isBookAvailable = false;
		for(int i = 0; i<CountOfBooks; i++)
		{
			if(Title.equals(book[i].getTitle()))
			{
				// Get title of book from User
				System.out.print("What is new book name : ");
				book[i].setTitle(sc.nextLine());
		
				// Get author name from user for book
				System.out.print("What is Name of the new Author : ");
				book[i].setAuthor(sc.nextLine());
		
				// Get Price from user for book
				System.out.print("New price of Book  : ");
				book[i].setPrice(sc.nextInt());
				sc.nextLine();
			}
		}
		if(!isBookAvailable)
		{
			System.out.println("There is no any book available titled "+Title);
			return;
		}
		System.out.println("Book record updated successfully");
	}
	void deleteByPrice()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("Enter price of books you want to delete : ");
		int Price = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<CountOfBooks-1; i++)
		{
			if(Price == book[i].getPrice())
			{
				for(int j = i; j<CountOfBooks-1; j++)
				{
					book[j] = book[j+1];
				}
				CountOfBooks--;
				i--;
			}
		}
		System.out.println("Book with "+Price+" had been removed from library");
	}
}