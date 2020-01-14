package src;
import java.util.Scanner;

public class BasicInput {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInt;
		double userDouble;
		String userString;

		System.out.println("Enter integer:");
		userInt = scnr.nextInt();
		
		System.out.println("Enter double:");
		userDouble = scnr.nextDouble();
		
		System.out.println("Enter string:");
		userString = scnr.next();
		scnr.close();
		
		System.out.println(userInt + " " + userDouble + " " + userString);
		System.out.println(userString + " " + userDouble + " " + userInt);
		int castInt = (int) userDouble;
		System.out.println(userDouble + " cast to an integer is " + castInt);

	}

}
