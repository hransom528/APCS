/**
 *   Pets.java 
 *   Demonstrates the use of Inheritance.
 */
public class Pets
{
	/**
	 * Instantiates a dog and a snake object and prints information
	 * about them.
	 * @param args
	 */
	public static void main (String[] args)
	{
		Dog fido = new Dog("Fido", 45);

		System.out.println(fido);
		System.out.println(fido.getName() + " says " + fido.speak());
		System.out.println(fido.move() + " " + fido.getName() + " "
				+ fido.move());

		Snake sam = new Snake("Sam", 30);

		System.out.println();
		System.out.println(sam.toString());
		System.out.println(sam.speak());
		System.out.println(sam.move());
	}
}