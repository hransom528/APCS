/**
 *   Pet.java 
 *   Represents a pet.
 */
public class Pet
{
	private String name;

	/**
	 * Creates a pet with the given name.
	 * @param petName
	 */
	public Pet(String petName)
	{
		name = petName;
	}

	/**
	 * Returns this pet's name.
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Returns a string representation of this pet.
	 */
	public String toString()
	{
		return "pet " + name;
	}
	
}