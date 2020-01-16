import java.util.ArrayList;

public class Lab0901_FantasyFootballTeam {
	public static void main(String[] args) {
		ArrayList<FantasyFootballPlayer> players = new ArrayList<FantasyFootballPlayer>();
		double totalTeamScore = 0;
		
		//Adds players to team
		players.add(new QuarterBack(312, 2)); //QB
		players.add(new RunningBack(98, 1));  //RB
		players.add(new WideReceiver(87, 1)); //WR
		players.add(new TightEnd(66, 0));	  //TE
		
		//Displays each player's info with toString()
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i).toString());
		}

		//Calculates the total team score using getScore() for each player
		for (int i = 0; i < players.size(); i++) {
			totalTeamScore += players.get(i).getScore();
		}
		
		//Displays total score
		System.out.println("\nTotal Team Score: " + totalTeamScore);
	}
}