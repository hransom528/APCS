public class TightEnd extends FantasyFootballPlayer {
	//Constructor
	public TightEnd(double numYards, int numTouchdowns) {
		super(numYards, numTouchdowns);
	}
	
	//Gets score for a tight end
	@Override
	public double getScore() {
		double score = 0;
		score += 6 * this.getNumTouchdowns();
		score += (this.getNumYards() / 15.0);
		return score;
	}
}