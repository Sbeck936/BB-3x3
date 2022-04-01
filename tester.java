
public class tester {
	public static void main(String[] args) {
		Player testplayer = new Player();
		System.out.println(testplayer);
		Player testplayer2 = new Player(65, "Spencer");
		System.out.println(testplayer2);
		
		System.out.println("------------------------------------------------------------");
		
		Team testerTeam = new Team();
		System.out.println(testerTeam);
		System.out.println(testerTeam.averageHeight());
		
		System.out.println("------------------------------------------------------------");
		
		testerTeam.add(testplayer2);
		System.out.println(testerTeam);
		System.out.println(testerTeam.averageHeight());
		testerTeam.getCurrentTeamMembers();
		testerTeam.toString();
		
	}
	

}
