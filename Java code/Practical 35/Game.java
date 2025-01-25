// 2. Player Score Tracking
// Task: Create a Player class with fields playerName, matchesPlayed, and score. Implement a constructor for initialization. In another class Game, create an array of Player objects and write a method to find the player with the highest score.
// Explanation: The Player class holds the player’s data, and Game performs the logic to find the top scorer.

import java.util.*;

class Game
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Total number of players : ");
		int Size = sc.nextInt();
		sc.nextLine();
		Player player[] = new Player[Size];

		for(int i = 0; i< Size; i++)
		{
			player[i] = new Player();
			player[i].setID(i+1);
				
			System.out.print("Name of a Player : ");
			String Name = sc.nextLine();
			player[i].setName(Name);

			System.out.print("Total matches played : ");
			int Matches = sc.nextInt();
			sc.nextLine();
			player[i].setMatches(Matches);

			System.out.print("Total Score : ");
			int Score = sc.nextInt();
			sc.nextLine();
			player[i].setScore(Score);
		}
		
		for(int i = 0; i<Size-1; i++)
		{
			for(int j = i+1; j<Size; j++)
			{
				if(player[i].getScore()<player[j].getScore())
				{
					Player tempPlayer = player[i];
					player[i] = player[j];
					player[j] = tempPlayer;
				}
			}
		}
		System.out.println("The highest scored player detail is");
		System.out.println("UID : "+player[0].getID()+"\nName : "+player[0].getName()+"\nMatches : "+player[0].getMatches()+"\nScore : "+player[0].getScore());
	}
}