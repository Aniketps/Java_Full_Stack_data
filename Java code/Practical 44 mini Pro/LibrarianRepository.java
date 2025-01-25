import java.util.*;

class LibrarianRepository
{
	Librarian user;
	Scanner sc = new Scanner(System.in);
	LibrarianRepository(){}
	ManageLibrary manageLibrary = null;
	LibrarianRepository(Librarian user, ManageLibrary m)
	{
		this.user = user;
		manageLibrary = m;
	}
	void ManageLibrary()
	{
		System.out.println("----------------------- Welcome "+user.getName()+" in Library Managment -------------------------");
		while(true)
		{
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1. Add new Book\n2. Add New Student\n3. Show All the Students\n4. Search Student Name\n5. Search Book by Name\n6. Show Issued Books\n7. Students with Issued books\n8. Present Book count\n9. Count of Issued books\n10. Available Book count\n11. Logout");
			System.out.print("Make choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					manageLibrary.addNewBook();
					break;
				case 2:
					System.out.println("1. Check Requests\n2. Add New Registration");
					System.out.print("Make choice : ");
					int choice1 = sc.nextInt();
					sc.nextLine();
					switch(choice1)
					{
						case 1:
							manageLibrary.checkRequests();
							break;
						case 2:
							manageLibrary.newRegistration();
							break;
						default:
							System.out.println("Invalid Input");
					}
					break;
				case 3:
					manageLibrary.showAllStudents();
					break;
				case 4:
					manageLibrary.studentsByName();
					break;
				case 5:
					manageLibrary.searchBookByName();
					break;
				case 6:
					manageLibrary.showIssuedBooks();
					break;
				case 7:
					manageLibrary.bookIssuedStudents();
					break;
				case 8:
					manageLibrary.presentBookCount();
					break;
				case 9:
					manageLibrary.issuedBookCount();
					break;
				case 10:
					manageLibrary.availableBookCount();
					break;
				case 11:
					return;
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}




