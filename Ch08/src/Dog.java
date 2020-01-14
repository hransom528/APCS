/**
 * Dog.java
 * Represents a dog, which is a pet.
 */
public class Dog extends Pet {
	private int weight;

	/**
	 * Creates a dog with the given name and weight.
	 * @param dogName
	 * @param dogWeight
	 */
	public Dog(String dogName, int dogWeight) {
		super(dogName);
		weight = dogWeight;
	}

	/**
	 * Returns this dog's weight.
	 * @return
	 */
	public int getWeight() {
		return this.weight;  
	}

	/**
	 * Returns a string representation of this dog.
	 */
	@Override
	public String toString() {
		return "pet " + getName() + " is a dog, weighing " + getWeight() + " pounds";
	}

	/**
	 * Returns a string indicating what this dog says.
	 * @return
	 */
	public String speak() {
		return "woof";
	}

	/**
	 * Returns a string indicating how this dog moves.
	 * @return
	 */
	public String move() {
		return "run";
	}
}