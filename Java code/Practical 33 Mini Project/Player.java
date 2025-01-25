class Player
{
	int ID;
	String Name;
	int Age;
	int Run;
	
	// Set Player Data to store
	void setID(int ID) { this.ID = ID; }
	void setName(String Name) { this.Name = Name; }
	void setAge(int Age) { this.Age = Age; }
	void setRun(int Run) { this.Run = Run; }

	// Get Data of Player like ID, Name, Age and Runs
	int getID() { return ID; }
	String getName() { return Name; }
	int getAge() { return Age; }
	int getRun() { return Run; }
}