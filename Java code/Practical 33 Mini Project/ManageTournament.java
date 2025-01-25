import java.util.*;

class ManageTournament
{
	Player player[] = new Player[100];
	Team team[]= new Team[50];
	Match match[] = new Match[50];

	Scanner sc = new Scanner(System.in);
	
	int PlayerCountMax = 100;
	static int PlayerCountCurrent = 0;

	int TeamCountMax = 50;
	static int TeamCountCurrent = 0;

	int MatchCountMax = 50;
	static int MatchCountCurrent = 0;

	void AddPlayer()
	{
		if(PlayerCountCurrent<=PlayerCountMax)
		{
			System.out.println("------------------------------------------------------------------------------------------------");
			player[PlayerCountCurrent]= new Player();

			player[PlayerCountCurrent].setID(PlayerCountCurrent+1);

			System.out.print("Player name : ");
			String PlayerName = sc.nextLine();
			player[PlayerCountCurrent].setName(PlayerName);
	
			System.out.print("Player age : ");
			int PlayerAge = sc.nextInt();
			player[PlayerCountCurrent].setAge(PlayerAge);
			
			sc.nextLine();

			PlayerCountCurrent++;
			System.out.println("Player added successfully");
		}	
	}
	void ShowPlayers()
	{
		if(PlayerCountCurrent==0)
		{ 
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Empty Data");
			System.out.println("------------------------------------------------------------------------------------------------");
			return; 
		}
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i = 0; i<PlayerCountCurrent; i++)
		{
			System.out.println(player[i].getID()+" \t "+player[i].getName()+" \t "+player[i].getAge());
		}
	}
	void CreateTeams()
	{
		team[TeamCountCurrent] = new Team();
		if(PlayerCountCurrent==0)
		{ 
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Empty Data");
			System.out.println("------------------------------------------------------------------------------------------------");
			return; 
		}
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Available Player Data");
		for(int i = 0; i<PlayerCountCurrent; i++)
		{
			System.out.println(player[i].getID()+" \t "+player[i].getName()+" \t "+player[i].getAge());
		}
		System.out.println("------------------------------------------------------------------------------------------------\n");
		

		team[TeamCountCurrent].setID(TeamCountCurrent+1);
		
		System.out.print("Name of the team : ");
		String TeamName = sc.nextLine();
		team[TeamCountCurrent].setName(TeamName);

		Player tempPlayers[] = new Player[11];

		System.out.println("Enter 11 players ID below to add in the team "+ TeamName);
		for(int i = 0; i<11;i++)
		{
			tempPlayers[i] = new Player();
			System.out.print("ID : ");
			int ID = sc.nextInt();
			for(int j = 0; j<PlayerCountCurrent; j++)
			{
				if(player[j].getID()==ID)
				{
					tempPlayers[i] = player[j];
				}
			}
		}
		sc.nextLine();
		team[TeamCountCurrent].setPlayer(tempPlayers);
		TeamCountCurrent++;
		System.out.println("Team Created successfully");
	}

	void ShowTeams()
	{
		if(TeamCountCurrent==0)
		{ 	
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Empty Data");
			System.out.println("------------------------------------------------------------------------------------------------");
			return;
		}
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i = 0; i<TeamCountCurrent; i++)
		{
			System.out.println(team[i].getID()+" \t "+team[i].getName());
		}
	}
	void CreateMatch()
	{
		if(TeamCountCurrent==0)
		{ 	
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Empty Data");
			System.out.println("------------------------------------------------------------------------------------------------");
			return;
		}
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Here are the avalable teams for creating match");
		match[MatchCountCurrent] = new Match();
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i = 0; i<TeamCountCurrent; i++)
		{
			System.out.println(team[i].getID()+" \t "+team[i].getName());
		}
		System.out.println("------------------------------------------------------------------------------------------------");
		match[MatchCountCurrent].setID(MatchCountCurrent+1);
		Team tempTeam[] = new Team[2];
		System.out.println("Select any two teams from above by there ID for creating and match");
		for(int i = 0; i<2; i++)
		{
			System.out.print(i+1+" Team ID : ");
			int TeamId = sc.nextInt();
			for(int j = 0; j<TeamCountCurrent; j++)
			{
				if(team[j].getID()==TeamId)
				{
					tempTeam[i] = team[j];
				}
			}
		}
		sc.nextLine();
		match[MatchCountCurrent].setTeam(tempTeam);
		String MatchName = tempTeam[0].getName()+"VS"+tempTeam[1].getName();
		match[MatchCountCurrent].setName(MatchName);
		
		System.out.print("The location of match : ");
		String Location = sc.nextLine();
		match[MatchCountCurrent].setLocation(Location);

		System.out.print("How many Overs will be there in match : ");
		int Overs = sc.nextInt();
		match[MatchCountCurrent].setOvers(Overs);

		MatchCountCurrent++;
		System.out.println("Match between "+tempTeam[0].getName()+" and "+tempTeam[1].getName()+" created successfully");
	}

	void ShowMatches()
	{
		if(MatchCountCurrent==0)
		{ 	
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Empty Data");
			System.out.println("------------------------------------------------------------------------------------------------");
			return;
		}
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i = 0; i<MatchCountCurrent; i++)
		{
			System.out.println(match[i].getID()+" \t "+match[i].getName()+" \t "+match[i].getLocation()+" \t "+match[i].getOvers());
		}
	}

	void TeamWisePlayerList()
	{
		if(TeamCountCurrent==0)
		{ 	
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Empty Data");
			System.out.println("------------------------------------------------------------------------------------------------");
			return;
		}
		for(int i = 0; i<TeamCountCurrent; i++)
		{
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("The team "+team[i].getName());
			for(Player p: team[i].getPlayer())
			{
				System.out.println(p.getID()+" \t "+p.getName()+" \t "+p.getAge());
			}
		}
	}
	void SetRunsToPlayer()
	{
		if(MatchCountCurrent==0)
		{ 	
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Empty Data");
			System.out.println("------------------------------------------------------------------------------------------------");
			return;
		}
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i = 0; i<MatchCountCurrent; i++)
		{
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("The match "+match[i].getName());
			System.out.println("Update runs obtained by below players");
			for(Team t : match[i].getTeam())
			{
				for(Player p: t.getPlayer())
				{
					System.out.print("Runs of "+p.getName()+" : ");
					int runs = sc.nextInt();
					p.setRun(runs);
				}
			}
		}
	}

	void ShowPlayerWiseRun()
	{
		if(PlayerCountCurrent==0)
		{ 	
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Empty Data");
			System.out.println("------------------------------------------------------------------------------------------------");
			return;
		}
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i = 0; i<PlayerCountCurrent; i++)
		{
			System.out.println(player[i].getName()+" \t "+player[i].getRun());
		}
	}

	void TeamWisePlayerRunAggregate()
	{
		if(MatchCountCurrent==0)
		{ 	
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Empty Data");
			System.out.println("------------------------------------------------------------------------------------------------");
			return;
		}
		for(int i = 0; i<MatchCountCurrent; i++)
		{
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("The match between "+match[i].getTeam()[0].getName()+" and "+ match[i].getTeam()[1].getName());
			for(Team t: match[i].getTeam())
			{
				int totalRuns = 0;
				for(Player p : t.getPlayer())
				{
					totalRuns = totalRuns + p.getRun();
				}
				System.out.println("The team"+t.getName()+" Aggregate is : "+totalRuns);
			}
		}
	}
	
	void DecideTheWinners()
	{
		if(MatchCountCurrent==0)
		{ 	
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Empty Data");
			System.out.println("------------------------------------------------------------------------------------------------");
			return;
		}
		for(int i = 0; i<MatchCountCurrent; i++)
		{
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("The match between "+match[i].getTeam()[0].getName()+" and "+ match[i].getTeam()[1].getName());
			int totalRuns[] = new int[2];
			for(int t = 0; t<2; t++)
			{
				for(Player p : match[i].getTeam()[t].getPlayer())
				{
					totalRuns[t] = totalRuns[t] + p.getRun();
				}
			}
			if(totalRuns[0]>totalRuns[1])
			{
				int wonby = totalRuns[0] - totalRuns[1];
				System.out.println("Team "+match[i].getTeam()[0].getName()+" won the match");
			}
			else if(totalRuns[0]<totalRuns[1])
			{
				int wonby = totalRuns[1] - totalRuns[0];
				System.out.println("Team "+match[i].getTeam()[1].getName()+" won the match");
			}
			else
			{
				System.out.println("Match end in draw");
			}
		}
	}
}