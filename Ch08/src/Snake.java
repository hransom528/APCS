public class Snake extends Pet {
	private int length;
	
	//Constructor
	public Snake(String petName, int length) {
		super(petName);
		this.length = length;
	}
	
	//Gets snake length
	public int getLength() {
		return length;
	}
	
	@Override
	public String toString() {
		return "pet " + getName() + " is a snake, " + getLength() + " inches long";
	}

	/**
	 * Returns a string indicating what this snake says.
	 * @return
	 */
	public String speak() {
		return getName() + " says hiss";
	}

	/**
	 * Returns a string indicating how this snake moves.
	 * @return
	 */
	public String move() {
		return "slither " + getName() + " slither";
	}
}