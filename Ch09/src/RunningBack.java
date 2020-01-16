public class RunningBack extends FantasyFootballPlayer {
	//Constructor
	public RunningBack(double numYards, int numTouchdowns) {
		super(numYards, numTouchdowns);
	}

	//Gets score for a runningback
	public double getScore() {
		double score = 0;
		score += 6 * this.getNumTouchdowns();
		score += (this.getNumYards() / 10.0);
		return score;
	}
}