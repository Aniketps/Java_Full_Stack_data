import java.util.*;
class Match
{
	int Overs;
	int ID;
	String Name;
	String Location;
	Team team[];

	// Set Match Data
	void setOvers(int Overs) { this.Overs = Overs; }
	void setID(int ID) { this.ID = ID; }
	void setName(String Name) { this.Name = Name; }
	void setLocation(String Location) { this.Location = Location; }
	void setTeam(Team ...team) { this.team = team; }
	
	// Get Match Data
	int getOvers() { return Overs; }
	int getID() { return ID; }
	String getName() { return Name; }
	String getLocation() { return Location; }
	Team[] getTeam() { return team; }
}