// Q1. WAP to create class name as Student with field id,name,email,contact and attendancePer and acadamicPer student as POJO class 
// And you have to create class name as Batch with following constructor 
//
// Class Batch{
// Student s[];
//   Batch(){
//     this(5);
//   }
// Batch(int size)
//  {  this(size,0);
//   }
//  Batch(int size,int extendCap)
//   {  // create array of student class using size
//
//  }
// }
// You have to create one utility class name as BatchRouting like as 
// Class BatchRoutine
// {
//  Private BatchRoutine(){
//  }
//  Student getTopper(Batch batch){
//  //you have to find the topper student from batch and return detail
//  }
//  Student [] getBebar(Batch b){
//  //return student list as debar if their attendance percentage is below 65%
//  }
// Student [] getConsistentStudent(Batch b){
//  //return student list whose attendance percentage is more than 65
// }
// Student [] getSameMarksStudent(Batch b){
//    Return student list who having same marks 
//  }
//}

import java.util.*;

class School
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Batch batch = new Batch();
		while(true)
		{
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1. Add Student\n2. Show Available students\n3. Topper\n4. Bebar Students\n5. Consistent Students\n6. Same Mark Students\n7. Exit");
			System.out.print("Make choice : ");
			int option = sc.nextInt();
			sc.nextLine();
			switch(option)
			{

				case 1:
					batch.addStudent();
					break;
				case 2:
					System.out.println("----------------------------------------------------------------------------------");
					for(Student s: batch.getStudents())
					{
						if(s==null){break;}
						System.out.println(s.getID()+"\t"+s.getName()+"\t"+s.getEmail());
					}
					break;
				case 3:
				System.out.println("----------------------------------------------------------------------------------");	
				System.out.println(BatchRoutine.getTopper(batch).getID()+"\t"+BatchRoutine.getTopper(batch).getName()+"\t"+BatchRoutine.getTopper(batch).getEmail());
					break;
				case 4:
				System.out.println("----------------------------------------------------------------------------------");
					for(int i = 0; i<BatchRoutine.getBebar(batch).length; i++)
					{
					System.out.println(BatchRoutine.getBebar(batch)[i].getID()+"\t"+BatchRoutine.getBebar(batch)[i].getName()+"\t"+BatchRoutine.getBebar(batch)[i].getEmail());
					}
					break;
				case 5:
				System.out.println("----------------------------------------------------------------------------------");
					for(int i = 0; i<BatchRoutine.getConsistentStudent(batch).length; i++)
					{
					System.out.println(BatchRoutine.getConsistentStudent(batch)[i].getID()+"\t"+BatchRoutine.getConsistentStudent(batch)[i].getName()+"\t"+BatchRoutine.getConsistentStudent(batch)[i].getEmail());
					}
					break;
				case 6:
				System.out.println("----------------------------------------------------------------------------------");
					for(int i = 0; i<BatchRoutine.getSameMarksStudent(batch).length; i++)
					{
					System.out.println(BatchRoutine.getSameMarksStudent(batch)[i].getID()+"\t"+BatchRoutine.getSameMarksStudent(batch)[i].getName()+"\t"+BatchRoutine.getSameMarksStudent(batch)[i].getEmail());
					}
					break;
				case 7:
					System.exit(0);
					break;
			}
		}
	}
}

class Student
{
	// id,name,email,contact and attendancePer and acadamicPer
	private int ID;
	private String Name;
	private String Email;
	private int Contact;
	private float AttendancePer;
	private float AcadamicPer;

	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setEmail(String Email)
	{
		this.Email = Email;
	}
	void setContact(int Contact)
	{
		this.Contact = Contact;
	}
	void setAttendancePer(float AttendancePer)
	{
		this.AttendancePer = AttendancePer;
	}
	void setAcadamicPer(float AcadamicPer)
	{
		this.AcadamicPer = AcadamicPer;
	}

	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	String getEmail()
	{
		return Email;
	}
	int getContact()
	{
		return Contact;
	}
	float getAttendancePer()
	{
		return AttendancePer;
	}
	float getAcadamicPer()
	{
		return AcadamicPer;
	}
}

class Batch
{
	Student s[];
	int CurrentStudentCount = 0;
	Scanner sc = new Scanner(System.in);

	Batch()
	{
		this(5);
	}
	Batch(int Size)
	{
		this(Size, 0);
		s = new Student[Size];
	}
	Batch(int Size, int extendCap)
	{
		s = new Student[Size+extendCap];
	}
	void addStudent()
	{
		s[CurrentStudentCount] = new Student();
		if(CurrentStudentCount>=s.length)
		{
			System.out.println("Batch is full");
			return;	
		}
		System.out.println("-------------------------------------------------------------------------------------");
		int ID;
		boolean isFound = true;
		do
		{
			isFound = true;
			System.out.print("UID of student : ");
			ID = sc.nextInt();
			sc.nextLine();
			for(int i = 0; i<CurrentStudentCount; i++)
			{
				if(ID == s[i].getID())
				{
					System.out.println("Student Already present with UID "+ID+" try another one");
					isFound = false;
				}
			}
		}
		while(!isFound);
		s[CurrentStudentCount].setID(ID);
		
		System.out.print("Student name : ");
		s[CurrentStudentCount].setName(sc.nextLine());
		
		System.out.print("Student email : ");
		s[CurrentStudentCount].setEmail(sc.nextLine());

		System.out.print("Student contact : ");
		s[CurrentStudentCount].setContact(sc.nextInt());
		

		System.out.print("Student Attendance Percentage : ");
		s[CurrentStudentCount].setAttendancePer(sc.nextFloat());
		sc.nextLine();
		
		System.out.print("Student Acadamic Percentage : ");
		s[CurrentStudentCount].setAcadamicPer(sc.nextFloat());
		sc.nextLine();

		CurrentStudentCount++;
		System.out.println("Student Added successfully");
	}
	Student[] getStudents()
	{
		return s;
	}
}

class BatchRoutine
{
	private BatchRoutine(){}
	
	public static Student getTopper(Batch batch){
		Student Topper = batch.getStudents()[0];
		for(Student b : batch.getStudents())
		{
			if(b==null)
			{
				break;
			}
			if(b.getAcadamicPer()>Topper.getAcadamicPer())
			{
				Topper = b;
			}
		}
		return Topper;
	}
	
	public static Student [] getBebar(Batch batch){
		int total = 0;
		for(Student b : batch.getStudents())
		{
			if(b==null)
			{
				break;
			}
			if(b.getAttendancePer()<65)
			{
				total++;
			}
		}
		Student Bebar[] = new Student[total];
		int CurrentBebarCount = 0;
		for(Student b : batch.getStudents())
		{
			if(b==null)
			{
				break;
			}
			if(b.getAttendancePer()<65)
			{
				Bebar[CurrentBebarCount]  = b;
				CurrentBebarCount++;
			}
		}
		return Bebar;
	}
	
	public static Student [] getConsistentStudent(Batch batch)
	{
		int total = 0;
		for(Student b : batch.getStudents())
		{
			if(b==null)
			{
				break;
			}
			if(b.getAttendancePer()>64)
			{
				total++;
			}
		}
		Student Consistent[] = new Student[total];
		int CurrentConsistentCount = 0;
		for(Student b : batch.getStudents())
		{
			if(b==null)
			{
				break;
			}
			if(b.getAttendancePer()>64)
			{
				Consistent[CurrentConsistentCount]  = b;
				CurrentConsistentCount++;
			}
		}
		return Consistent;
	}
	
	public static Student [] getSameMarksStudent(Batch b)
	{
 		int total = 0;
		for(int i = 0; i<b.getStudents().length-1; i++)
		{
			if(b.getStudents()[i]==null)
			{
				break;
			}
			for(int j = i+1; j<b.getStudents().length; j++)
			{
				if(b.getStudents()[j]==null)
				{
					break;
				}
				if(b.getStudents()[i].getAttendancePer() == b.getStudents()[j].getAttendancePer())
				{
					total++;
				}
			}
		}
		Student Same[] = new Student[total];
		int CurrentSameCount = 0;
		for(int i = 0; i<b.getStudents().length; i++)
		{
			if(b.getStudents()[i]==null)
			{
				break;
			}
			for(int j = i+1; j<b.getStudents().length; j++)
			{
				if(b.getStudents()[j]==null)
				{
					break;
				}
				if(b.getStudents()[i].getAttendancePer() == b.getStudents()[j].getAttendancePer())
				{
					Same[CurrentSameCount] = b.getStudents()[i];
					CurrentSameCount++;
				}
			}
		}
		return Same;
	}
}