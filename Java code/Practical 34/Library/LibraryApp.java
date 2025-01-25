// Q1 Create a class called Library to hold accession number, title of the book, author name, price of the book and write a menu driven program in java that implements the working of a library.

import java.util.*;
class LibraryApp
{
	public static void main(String ...x)
	{
		LibraryAppManagement libraryAppManagement = new LibraryAppManagement();
		Scanner sc = new Scanner(System.in);
		boolean isContinue = true;
		do
		{
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1. Add New Book Details\n2. Display All Book Details.\n3. Display List of all book of given author.\n4. Display list the title of specified book.\n5. Display list count of the book in the library.\n6. Display list the books in the ascending order of accession number.\n7. Update book details by title of book.\n8. Delete book details by price.\n9. Exit.");
			System.out.print("Enter choice : ");
			switch(sc.nextInt())
			{
				case 1:
					libraryAppManagement.setBook();
					break;
				case 2:
					libraryAppManagement.getAllBookDetails();
					break;
				case 3:
					libraryAppManagement.sortByAuthor();
					break;
				case 4:
					libraryAppManagement.searchByTitle();
					break;
				case 5:
					libraryAppManagement.getBookCount();
					break;
				case 6:
					libraryAppManagement.sortByID();
					break;
				case 7:
					libraryAppManagement.updateBookData();
					break;
				case 8:
					libraryAppManagement.deleteByPrice();
					break;
				case 9:
					System.out.println("Thank you for being a part of our service :)");
					isContinue = false;
					break;
				default:
					System.out.println("Invalit Input");
			}
		}
		while(isContinue);
	}
}