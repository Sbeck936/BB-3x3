import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Team home;
		Team visitor;
		
		System.out.println("Enter the home team");
		home = fillRoster();
		System.out.println("Enter the visiting team");
		visitor = fillRoster();
		System.out.println("Teams Filled");
		
		System.out.println(home.toString());
		System.out.println(visitor.toString());
	}
	
	
	private static Scanner input = new Scanner(System.in);
	
	private static Team fillRoster() {
		Scanner userInput = input;
		String name;
		int height;
		Team team = new Team();
		for(int i = 1; i < 4; i++) 
		{
			System.out.println("Team member " + i + ":");
			System.out.print("Name: ");
			name = userInput.next();
			System.out.print("Height: ");
			height = userInput.nextInt();
			Player player = new Player(height, name);
			team.add(player);
			
		}
		
		team.setNextOpenPosition(0);
		return team;
	}

}
