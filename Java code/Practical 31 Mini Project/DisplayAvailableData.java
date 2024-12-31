class DisplayAvailableData
{
	Courses courses[];
	Batches batches[];
	Enquiries enquiries[];

	void setCourses(Courses ...courses)
	{
		this.courses = courses;
	}
	void setBatches(Batches ...batches)
	{
		this.batches = batches;
	}
	void setEnquiries(Enquiries ...enquiries)
	{
		this.enquiries = enquiries;
	}
	void AvailableCourses()
	{
		System.out.println("\n==========================================================\nHere are the available Courses we have\nID \t Name \t Duration \t Fees");
		for(Courses c: courses)
		{
			System.out.println(c.getID()+"\t"+c.getName()+"\t"+c.getDuration()+"\t"+c.getFees());
		}
	} 
	void AvailableBatches()
	{
		System.out.println("\n==========================================================\nHere are the available Batches we have\nID \t Name \t Start Date \t Expected End data");
		for(Batches b: batches)
		{
			System.out.println(b.getID()+"\t"+b.getName()+"\t"+b.getStartDate()+"\t"+b.getEndDate());
		}
	}
	void AvailableEnquiries()
	{
		System.out.println("\n==========================================================\nHere are the available Enquiries we have\nID \t Name \t Email \t\t     Contact \t Education");
		for(Enquiries e: enquiries)
		{
			System.out.println(e.getID()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact()+"\t"+e.getEducation());
		}
	} 
	void TrueAvailableEnquiries()
	{
		System.out.println("\n==========================================================\nHere are the available Students who are Admitted\nID \t Name \t Email \t\t      Contact \t Education");
		for(Enquiries e: enquiries)
		{
			if(e.getStatus())
			{
				System.out.println(e.getID()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact()+"\t"+e.getEducation());
			}
		}
	}
	void FalseAvailableEnquiries()
	{
		System.out.println("\n==========================================================\nHere are the available Students who are not Admitted\nID \t Name \t Email \t\t     Contact \t Education");
		for(Enquiries e: enquiries)
		{
			if(!e.getStatus())
			{
				System.out.println(e.getID()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact()+"\t"+e.getEducation());
			}
		}
	}
	void CourseWiseStudents()
	{	
		System.out.println("\n==========================================================\nHere are the available Course wise Students who are Admitted\nID \t Name \t Email \t\t    Contact \t Education \t Batch ");
		for(Courses c : courses)
		{
			System.out.println(c.getName());
			for(Enquiries e: enquiries)
			{
				if(e.getStatus() && (c.getName() == e.getCourse()))
				{
					System.out.println(e.getID()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact()+"\t"+e.getEducation()+"\t"+e.getCourse()+"\t"+e.getBatch());
				}
			}
		}
	}
	void BatchWiseStudents()
	{	
		System.out.println("\n==========================================================\nHere are the available Batch wise Students who are Admitted\nID \t Name \t Email \t Contact \t Education \t Course \t Batch");
		for(Batches b : batches)
		{
			System.out.println(b.getName());
			for(Enquiries e: enquiries)
			{
				if(e.getStatus() && (b.getName() == e.getBatch()))
				{
					System.out.println(e.getID()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact()+"\t"+e.getEducation()+"\t"+e.getCourse()+"\t"+e.getBatch());
				}
			}
		}
	}
}