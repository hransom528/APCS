public class StringInstrument extends Instrument {
	private int numStrings;
	private int numFrets;
	
	//Gets number of strings
	public int getNumOfStrings() {
		return numStrings;
	}
	
	//Sets number of strings
	public void setNumOfStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	
	//Gets number of frets
	public int getNumOfFrets() {
		return numFrets;
	}
	
	//Sets number of frets
	public void setNumOfFrets(int numFrets) {
		this.numFrets = numFrets;
	}
}