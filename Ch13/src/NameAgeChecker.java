import java.util.InputMismatchException;
import java.util.Scanner;

public class NameAgeChecker {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String inputName = "";
		int age;

		inputName = scnr.next();
		while (!(inputName.equals("-1"))) {
			try {
				age = scnr.nextInt();
			} 
			catch (InputMismatchException e) {
				age = -1;
				scnr.next();
				scnr.nextInt();
			}
			System.out.println(inputName + " " + (age + 1));
			inputName = scnr.next();
		}
		scnr.close();
	}
}