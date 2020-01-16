public abstract class FantasyFootballPlayer {
	private double numYards;
	private int numTouchdowns;
	
	//Default constructor
	public FantasyFootballPlayer() {
		numYards = 0;
		numTouchdowns = 0;
	}
	
	//Parameterized constructor
	public FantasyFootballPlayer(double newNumYards, int newNumTouchdowns) {
		this.numYards = newNumYards;
		this.numTouchdowns = newNumTouchdowns;
	}

	//Gets number of yards
	public double getNumYards() {
		return numYards;
	}

	//Sets number of yards
	public void setNumYards(double numYards) {
		this.numYards = numYards;
	}

	//Gets number of touchdowns
	public int getNumTouchdowns() {
		return numTouchdowns;
	}

	//Sets number of touchdowns
	public void setNumTouchdowns(int numTouchdowns) {
		this.numTouchdowns = numTouchdowns;
	}
	
	//Gets score
	public abstract double getScore();
	
	//Outputs information
	public String toString() {
		return ("" + getNumYards() + " - " + getNumTouchdowns() + " - " + getScore());
	}
}