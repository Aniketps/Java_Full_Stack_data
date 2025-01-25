import java.util.*;

class ManageLibrary
{
	// Library DataBase
	Student students[] = new Student[100];
	Librarian librarian[] = new Librarian[5];
	Book books[] = new Book[100];

	// Static Size
	int maxStudentCount = 100;
	int maxLibrarianCount = 5;
	int CurrentStudentCount = 0;
	int CurrentLibrarianCount = 0;
	int maxBookCount = 100;
	int CurrentBookCount = 0;

	Scanner sc = new Scanner(System.in);
	ValidateUser validateUser = new ValidateUser();
	LibrarianRepository librarianRepository = null;
	StudentRepository studentRepository = new StudentRepository();

	void newRegistration()
	{
		User user = null;
		System.out.println("1. Student\n2. Librarian\n3. Exit()");
		System.out.print("Make choice : ");
		int choice1 = sc.nextInt();
		sc.nextLine();
		if(choice1 == 2)
		{
			System.out.print("Admin Password : ");
			String Adminpass = sc.nextLine();
			if(!(Adminpass.equals("Aniket")))
			{
				System.out.println("Wrong Password");
				return;
			}
		}
		System.out.print("ID : ");
		int ID = sc.nextInt();
		sc.nextLine();
		if(choice1 == 1)
		{
			for(int i = 0; i<CurrentStudentCount; i++)
			{
				if(students[i] == null){break;}
				if(students[i].getID() == ID)
				{
					System.out.println("ID Already Exist try another");
					return;
				}
			}
		}
		else if(choice1 == 2)
		{
			for(int i = 0; i<CurrentLibrarianCount; i++)
			{
				if(librarian[i] == null){break;}
				if(librarian[i].getID() == ID)
				{
					System.out.println("ID Already Exist try another");
					return;
				}
			}
		}
		System.out.print("Name : ");
		String Name = sc.nextLine();
		System.out.print("Email : ");
		String Email = sc.nextLine();
		System.out.print("Contact : ");
		String Contact = sc.nextLine();
		switch(choice1)
		{
			case 1:
				System.out.print("Department : ");
				String DepName = sc.nextLine();
				System.out.print("Year : ");
				String Year = sc.nextLine();
				user = new Student(ID, Name, Email, Contact,"Student", DepName, Year);
				students[CurrentStudentCount] = (Student) user;
				CurrentStudentCount++;
				System.out.println("Application request send");
				break;
			case 2:
				System.out.print("Designation : ");
				String Designation = sc.nextLine();
				user = new Librarian(ID, Name, Email, Contact,"Librarian", Designation);
				librarian[CurrentLibrarianCount] = (Librarian) user;
				CurrentLibrarianCount++;
				System.out.println("Librarian Account Created Successfully");
				break;
			default:
				System.out.println("Invalid Input");
		}
	}

	// User login
	public void Login(String UID, String Password)
	{
		for(int i = 0; i<CurrentLibrarianCount; i++)
		{
			if(UID.equals(librarian[i].getEmail()))
			{
				if(Password.equals(librarian[i].getContact()))
				{
					// LibrarianRepo Logic
					librarianRepository = new LibrarianRepository(librarian[i], this);
					librarianRepository.ManageLibrary();
					return;
				}
			}
		}
		for(int i = 0; i<CurrentStudentCount; i++)
		{
			if(UID.equals(students[i].getEmail()))
			{
				if(Password.equals(students[i].getContact()))
				{
					// StudentRepo Logic
					studentRepository = new StudentRepository(students[i], this);
					studentRepository.useLibrary();
					return;
				}
			}
		}
		System.out.println("User does not exists, Please UID and Password ad try again...");
	}
	void showAllStudents()
	{
		System.out.println("------------------------------- Students List ---------------------------------------");
		System.out.println("ID\tName\t\tEmail\t\t\tContact\t\tDepartment\tYear\t\tStatus");
		for(int s = 0; s<CurrentStudentCount; s++)
		{
			if(students[s] == null){return;}
			System.out.println(students[s].getID()+"\t"+students[s].getName()+"\t\t"+students[s].getEmail()+"\t\t"+students[s].getContact()+"\t\t"+students[s].getDepName()+"\t\t"+students[s].getYear()+"\t\t"+students[s].getStatus());
		}
	}

	void addNewBook()
	{
		System.out.println("----------------------------- New Book Details --------------------------------------");
		books[CurrentBookCount] = new Book();
		System.out.print("ID : ");
		int bookID = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<CurrentBookCount; i++)
		{
			if(books[i] == null){break;}
			if(books[i].getID() == bookID)
			{
				System.out.println("ID Already Exist try another");
				return;
			}
		}
		books[CurrentBookCount].setID(bookID);
		System.out.print("Name : ");
		books[CurrentBookCount].setName(sc.nextLine());
		System.out.print("Author : ");
		books[CurrentBookCount].setAuthor(sc.nextLine());
		System.out.print("Subject : ");
		books[CurrentBookCount].setSubject(sc.nextLine());
		System.out.print("IsBn : ");
		books[CurrentBookCount].setIsBn(sc.nextLine());
		books[CurrentBookCount].setStatus(true);
		CurrentBookCount++;
		System.out.println("Book Added Successfully");
	}

	void searchBookByName()
	{
		System.out.println("-------------------------------------- Search Book ----------------------------------");
		System.out.print("Book name : ");
		String bookName = sc.nextLine();
		System.out.println("ID\tName\t\t\tAuthor\t\t\tSubject\t\t\tIsBn\t\tStatus");
		for(Book b: books)
		{
			if(b==null){return;}
			if(b.getName().equals(bookName))
			{
				System.out.println(b.getID()+"\t"+b.getName()+"\t\t\t"+b.getAuthor()+"\t\t\t"+b.getSubject()+"\t\t\t"+b.getIsBn()+"\t\t"+b.getStatus());
			}
		}
	}

	void checkRequests()
	{
		System.out.println("-------------------------- Pending Students Requests --------------------------------");
		System.out.println("ID\t\tName\t\tEmail\t\t\tContact\t\tDepartment\tYear");
		for(int s = 0; s<CurrentStudentCount; s++)
		{
			if(students[s] == null){return;}
			if(students[s].getStatus().equals("Pending"))
			{
				System.out.println(students[s].getID()+"\t\t"+students[s].getName()+"\t\t"+students[s].getEmail()+"\t\t"+students[s].getContact()+"\t\t"+students[s].getDepName()+"\t\t"+students[s].getYear());
			}
		}
		System.out.print("Enter Student ID to Change Status : ");
		int changeStatus = sc.nextInt();
		sc.nextLine();
		for(int s = 0; s<CurrentStudentCount; s++)
		{
			if(students[s] == null){return;}
			if(students[s].getID()==changeStatus)
			{
				System.out.println("1. Accept\n2. Reject");
				System.out.print("Make Choice : ");
				int requestChoice = sc.nextInt();
				sc.nextLine();
				if(requestChoice == 1)
				{
					students[s].setStatus("Accepted");
				}
				else if(requestChoice == 2)
				{
					students[s].setStatus("Rejected");
				}
				else
				{
					System.out.println("Invalid Input");
				}
				System.out.print("Want to change another status? (n/y) : ");
				char isNext = sc.next().charAt(0);
				if(isNext == 'n')
				{
					return;
				}
				else
				{
					checkRequests();
				}
			}
		}
	}
	
	void showIssuedBooks()
	{
		System.out.println("------------------------------- Issued Books ----------------------------------------");
		System.out.println("ID\t\tName\t\tAuthor\t\tSubject\t\tIsBn\t\tStatus");
		for(Book b: books)
		{
			if(b==null){return;}
			if(b.getStatus() == false)
			{
				System.out.println(b.getID()+"\t\t"+b.getName()+"\t\t"+b.getAuthor()+"\t\t"+b.getSubject()+"\t\t"+b.getIsBn()+"\t\t"+b.getStatus());
			}
		}
	}
	
	void bookIssuedStudents()
	{
		System.out.println("------------------------- Book Issued Student List ----------------------------------");
		System.out.println("ID\t\tName\t\tEmail\t\t\tContact\t\tDepartment\t\tYear");
		for(int s = 0; s<CurrentStudentCount; s++)
		{
			if(students[s] == null){return;}
			if(students[s].CurrentBookCount > 0)
			{
				System.out.println(students[s].getID()+"\t\t"+students[s].getName()+"\t\t"+students[s].getEmail()+"\t\t"+students[s].getContact()+"\t\t"+students[s].getDepName()+"\t\t"+students[s].getYear());
			}
		}
	}

	void presentBookCount()
	{
		System.out.println("------------------------------ Present Book Count -----------------------------------");
		int count = 0;
		for(Book b: books)
		{
			if(b==null){break;}
			if(b.getStatus() == true)
			{
				count++;
			}
		}
		System.out.println(count);
	}

	void issuedBookCount()
	{
		System.out.println("------------------------------- Issued Book Count -----------------------------------");
		int count = 0;
		for(Book b: books)
		{
			if(b==null){break;}
			if(b.getStatus() == false)
			{
				count++;
			}
		}
		System.out.println(count);
	}

	void availableBookCount()
	{
		System.out.println("------------------------------- Available Book Count -----------------------------------");
		System.out.println(CurrentBookCount);
	}
	void availableBooks()
	{
		System.out.println("------------------------------- Available Books -------------------------------------");
		System.out.println("ID\t\tName\t\tAuthor\t\tSubject\t\tIsBn\t\tStatus");
		for(Book b: books)
		{
			if(b==null){return;}
			System.out.println(b.getID()+"\t\t"+b.getName()+"\t\t"+b.getAuthor()+"\t\t"+b.getSubject()+"\t\t"+b.getIsBn()+"\t\t"+b.getStatus());
		}
	}

	void studentsByName()
	{
		System.out.print("Student Name : ");
		String StuName = sc.nextLine();
		System.out.println("------------------------- Searched Student List ----------------------------------");
		System.out.println("ID\t\tName\t\tEmail\t\t\tContact\t\tDepartment\tYear\t\tStatus");
		for(int s = 0; s<CurrentStudentCount; s++)
		{
			if(students[s] == null){return;}
			if(students[s].getName().equals(StuName))
			{
				System.out.println(students[s].getID()+"\t\t"+students[s].getName()+"\t\t"+students[s].getEmail()+"\t\t"+students[s].getContact()+"\t\t"+students[s].getDepName()+"\t\t"+students[s].getYear()+"\t\t"+students[s].getStatus());
			}
		}
	}
	
	void issueNewBook(Student s)
	{
		System.out.println("------------------------------- Available Books -------------------------------------");
		System.out.println("ID\t\tName\t\tAuthor\t\tSubject\t\tIsBn\t\tStatus");
		for(Book b: books)
		{
			if(b==null){break;}
			System.out.println(b.getID()+"\t\t"+b.getName()+"\t\t"+b.getAuthor()+"\t\t"+b.getSubject()+"\t\t"+b.getIsBn()+"\t\t"+b.getStatus());
		}
		System.out.print("Select book by ID : ");
		int bookID = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<CurrentBookCount; i++)
		{
			if(books[i]==null){return;}
			if(books[i].getID() == bookID)
			{
				if(books[i].getStatus() == true)
				{
					books[i].setStatus(false);
					s.setBooks(books[i]);
					System.out.println("Book Issued successfully");
					return;
				}
				else
				{
					System.out.println("Book has already been issued");
					return;
				}
			}
		}
		System.out.println(bookID+" book is not available");
	}

	void returnBook(Student s)
	{
		System.out.println("------------------------------- My Issued Books -------------------------------------");
		for(Book b: s.getBooks())
		{
			if(b==null){break;}
			System.out.println(b.getID()+"\t\t"+b.getName()+"\t\t"+b.getAuthor()+"\t\t"+b.getSubject()+"\t\t"+b.getIsBn()+"\t\t"+b.getStatus());
		}
		System.out.print("Select books ID to return that book : ");
		Book temp[] = s.getBooks();
		int returnBook = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<temp.length; i++)
		{
			if(temp[i]==null){return;}
			if(temp[i].getID() == returnBook)
			{
				temp[i].setStatus(true);
				System.out.println("Book Returned successfully");
				for(int j = 0; j<temp.length; j++)
				{
					if(temp[j]==null){break;}
					temp[j] = temp[j+1];
				}
				s.CurrentBookCount--;
				System.out.println("My book count is "+s.CurrentBookCount);
			}
		}
	}

	void availableNotIssuedBooks()
	{
		System.out.println("------------------------------- Not Issued Books -------------------------------------");
		System.out.println("ID\t\tName\t\tAuthor\t\tSubject\t\tIsBn\t\tStatus");
		for(Book b: books)
		{
			if(b==null){return;}
			if(b.getStatus())
			{
				System.out.println(b.getID()+"\t\t"+b.getName()+"\t\t"+b.getAuthor()+"\t\t"+b.getSubject()+"\t\t"+b.getIsBn()+"\t\t"+b.getStatus());
			}
		}
	}	
}



