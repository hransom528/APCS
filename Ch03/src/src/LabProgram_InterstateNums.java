package src;
import java.util.Scanner;

public class LabProgram_InterstateNums {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		int auxServe = 0;
		boolean primary = false;
		boolean eastWest = false;
		boolean valid;
		scnr.close();
		
		//Determines if route is primary or secondary
		if ((num > 0) && (num < 100)) {
			primary = true;
		}
		
		//Determines if route is east-west or north-south
		if (num % 2 != 0) {
			eastWest = false;
		}
		else if (num % 2 == 0) {
			eastWest = true;
		}
		
		//Determines if number is valid
		if ((num > 0) && (num < 1000)) {
			valid = true;
		}
		else {
			valid = false;
		}
		
		//Determines which route an auxilliary serves
		if (primary == false) {
			auxServe = num % 100;
		}
		
		//Outputs route information.
		if (valid) {System.out.print("The " + num + " is ");}
		if ((primary) && (valid)) {
			System.out.print( "primary, ");
		}
		else if ((primary == false) && (valid)) {
			System.out.print("auxiliary, serving the " + auxServe + ", ");
		}
		if ((eastWest) && (valid)) {
			System.out.println("going east/west.");
		}
		else if ((eastWest == false) && (valid)) {
			System.out.println("going north/south.");
		}
		if (valid == false) {
			System.out.println("" + num + " is not a valid interstate highway number.");
		}
	}

}
