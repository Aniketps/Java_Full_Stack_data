import java.util.*;
class Team
{
	// Team Data
	int ID;
	String Name;
	Player player[];

	// Set Team information
	void setID(int ID) { this.ID = ID; }
	void setName(String Name) { this.Name = Name; }
	void setPlayer(Player ...player) { this.player = player; }
	
	// Get Team Data
	int getID() { return ID; }
	String getName() { return Name; }
	Player[] getPlayer() { return player; }
}