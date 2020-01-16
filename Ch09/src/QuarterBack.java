public class QuarterBack extends FantasyFootballPlayer {
	//Constructor
	public QuarterBack(double numYards, int numTouchdowns) {
		super(numYards, numTouchdowns);
	}
	
	//Gets score for a quarterback
	public double getScore() {
		double score = 0;
		score += 4 * this.getNumTouchdowns();
		score += (this.getNumYards() / 25.0);
		return score;
	}
}