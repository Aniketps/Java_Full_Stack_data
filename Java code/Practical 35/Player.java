import java.util.*;

class Player
{
	private int ID;
	private String Name;
	private int Matches;
	private int Score;
		
	// Set Player data of matches
	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setMatches(int Matches)
	{
		this.Matches = Matches;
	}
	void setScore(int Score)
	{
		this.Score = Score;
	}

	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	int getMatches()
	{
		return Matches;
	}
	int getScore()
	{
		return Score;
	}

}