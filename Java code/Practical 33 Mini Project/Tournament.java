import java.util.*;
class Tournament
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);

		ManageTournament manageT = new ManageTournament();
		boolean isContinue = true;

		do
		{	
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("1. Add Player\n2. Show Available Players\n3. Create Team\n4. Show Team\n5. Create Match\n6. Show Matches\n7. Team wise player list\n8. Update players run in matches\n9. Show player wise runs\n10. Check Winner teams in matches\n11. Exit");
			System.out.print("Select option? ");
			int Option = sc.nextInt();
			switch(Option)
			{
				case 1:
					manageT.AddPlayer();
					break;
				case 2:
					manageT.ShowPlayers();
					break;
				case 3:
					manageT.CreateTeams();
					break;
				case 4:
					manageT.ShowTeams();
					break;
				case 5:
					manageT.CreateMatch();
					break;
				case 6:
					manageT.ShowMatches();
					break;
				case 7:
					manageT.TeamWisePlayerList();
					break;
				case 8:
					manageT.SetRunsToPlayer();
					break;
				case 9:
					manageT.ShowPlayerWiseRun();
					break;
				case 10:
					manageT.DecideTheWinners();
					break;
				case 11:
					isContinue = false;
					break;
			};
		}while(isContinue);

	}
}