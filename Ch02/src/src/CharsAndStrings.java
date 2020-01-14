package src;
import java.util.Scanner;

public class CharsAndStrings {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		//Declare 3 char variables for first, middle and last initial.
		char a;
		char b;
		char c;

		//Declare a String variable for when the initials will be concatenated together.
		String str;

		//Prompt the user for their initials with a space between each character.\
		//System.out.println("Please enter your initials with a space between each one (ex. B I L):");

		//Use 3 assignment statements to get the user input into the char variables (Hint: use charAt(0))
		a = scnr.next().charAt(0);
		b = scnr.next().charAt(0);
		c = scnr.next().charAt(0);
		scnr.close();

		//Concatenate the char variables together and save into the String variable.
		str = "" + a + b + c;

		/*Display the user's initials without spaces.
		 * Use a new line escape sequence to add a new line before the output
		 */
		System.out.println("Your initials are " + str);


		/* Display all other permutations of the user's initials.
		 * 		Use a tab escape sequence to separate the different permutations
		 */
		System.out.println("Rearranged, your initials spell:");
		System.out.println("" + 
				a + c + b + "\t" + b + a + c + "\t" + 
				b + c + a + "\t" + c + a + b + "\t" + 
				c + b + a
				);
		/*
		 * 		CHALLENGE: output this using 1 println statement and have the code still readable.
		 * 		Meaning, if this is all on one line and it stretches off the screen, that is not
		 * 		readable.
		 */

	}

}
