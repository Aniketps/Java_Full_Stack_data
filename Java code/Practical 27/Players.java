// Q1. WAP to create POJO class name as Player with id, name and run and input the data from keyboard and display it.

import java.util.*;
public class Players
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		Team team = new Team();
		
		System.out.print("What is Player id: ");
		int id = sc.nextInt();
		player.setID(id);
		
		System.out.print("What is Player name: ");
		String Name = sc.next();
		player.setName(Name);
		
		System.out.print("What are player runs: ");
		int Run = sc.nextInt();
		player.setRun(Run);

		team.setPlayer(player);
		team.getPlayer(player);
		
	}
}

class Team{
	private Player player;
	
	void setPlayer(Player player)
	{
		player = player;
	}
	void getPlayer(Player player)
	{
		System.out.println("Player ID is : "+player.getID());
		System.out.println("Player Name is : "+player.getName());
		System.out.println("Player Run are : "+player.getRun());
	}
}

class Player
{
	private int ID;
	private String Name;
	private int Run;

	void setID(int id)
	{
		ID = id;
	}
	public int getID()
	{
		return ID;
	}
	
	void setName(String name)
	{
		Name = name;
	}
	public String getName()
	{
		return Name;
	}

	void setRun(int run)
	{
		Run = run;
	}
	public int getRun()
	{
		return Run;
	}
}