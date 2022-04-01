import java.util.Scanner;

public class Team {
	private Player[] myTeam;
	private int nextOpenPosition;
	
	public Team() 
	{
		myTeam = new Player[3];
		
	}
	
	
	
	public Player[] getMyTeam() {
		return myTeam;
	}
	public void setMyTeam(Player[] myTeam) {
		this.myTeam = myTeam;
	}
	public int getNextOpenPosition() {
		return nextOpenPosition;
	}
	public void setNextOpenPosition(int nextOpenPosition) {
		this.nextOpenPosition = nextOpenPosition;
	}
	
	
	public void add(Player player) {
		this.myTeam[this.nextOpenPosition] = player;
		this.nextOpenPosition++;
	}
	
	public Player[] getCurrentTeamMembers() {
		int members = 0;
		for (int i=0;i<3;i++) {
			if (myTeam[i] != null) {
				members++;
			}
				
		}
		Player[] currentTeam = new Player[members];
		
		for(int i=0;i<members;i++) {
			currentTeam[i] = myTeam[i];
		}
		
		return currentTeam;
		
	}
		/*Player[] team = this.getMyTeam();
		Scanner Input = new Scanner(System.in);
		String name;
		int height;
		for(int i = 0;i < 3; i++) {
			if (team[i].getName() == ""){
				System.err.println("Team member " + i + " slot cannot be empty please enter player for that slot.");
					while (team[i].getName() == "")
						//this.setNextOpenPosition(i);
						System.out.println("Name:");
						name = Input.next();
						System.out.println("Height:");
						height = Input.nextInt();
						Player player = new Player(height, name);
						this.add(player);
				
			}
		}
		this.setNextOpenPosition(0);
			
		return team;
	}*/
	
	public int averageHeight() {
		int totalheight = 0;
		int numOfTeamMembs = 0;
		for (int i=0;i<3;i++) {
			if (myTeam[i] == null) {
				totalheight= totalheight + 0;
			}
			else {
				totalheight+=myTeam[i].getHeight();
				numOfTeamMembs++;
			}
			
		}
		if (numOfTeamMembs == 0) {
			return 0;
		}
		int avgheight = totalheight/numOfTeamMembs;

		return avgheight;
	}
	



	@Override
	public String toString() {
		return "Team{numPlayers=3, members=[" + this.myTeam[0] + ", " + this.myTeam[1] + ", " + this.myTeam[2] + "]}";
	}
	
	
	
	
	

}
