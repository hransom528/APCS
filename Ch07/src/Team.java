public class Team {
	private String teamName;
	private int teamWins;
	private int teamLosses;
	
	//Sets the team name
	public void setTeamName(String newTeamName) {
		teamName = newTeamName;
	}
	//Sets the number of team wins
	public void setTeamWins(int newTeamWins) {
		teamWins = newTeamWins;
	}
	//Sets the number of team losses
	public void setTeamLosses(int newTeamLosses) {
		teamLosses = newTeamLosses;
	}
	
	//Gets team name
	public String getTeamName() {
		return teamName;
	}
	//Gets team wins
	public int getTeamWins() {
		return teamWins;
	}
	//Gets team losses
	public int getTeamLosses() {
		return teamLosses;
	}
	//Gets team winning percentage
	public double getWinPercentage() {
		return ((double) teamWins / (teamWins + teamLosses)); 
	}
}