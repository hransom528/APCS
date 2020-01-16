public class WideReceiver extends FantasyFootballPlayer {
	//Constructor
	public WideReceiver(double numYards, int numTouchdowns) {
		super(numYards, numTouchdowns);
	}

	//Gets score for a wide receiver
	public double getScore() {
		double score = 0;
		score += 6 * this.getNumTouchdowns();
		score += (this.getNumYards() / 15.0);
		return score;
	}
}
