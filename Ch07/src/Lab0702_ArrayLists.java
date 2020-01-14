import java.util.ArrayList;
import java.util.Scanner;

public class Lab0702_ArrayLists {

	public static void main(String[] args) {
		//Initializes variables
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		ArrayList<Integer> negativeList = new ArrayList<Integer>();
		String inputString = "";
		char loopChar;
		boolean quitInput = false;
		boolean quitProgram = false;
		int counter = 1;

		while (!quitProgram) {
			//Gets input
			System.out.println("Please enter integers (Positive or Negative) or type \'q\' to quit");
			while (!quitInput) {
				System.out.print("" + counter + ": ");
				inputString = scnr.next();
				if (inputString.equalsIgnoreCase("q")) {
					quitInput = true;
				}
				else {
					numberList.add(Integer.parseInt(inputString));
				}
				counter++;
			}

			//Sorts items into appropriate list
			for (int i = 0; i < numberList.size(); i++) {
				if (numberList.get(i) % 2 == 0) {
					evenList.add(numberList.get(i));
				}
				if (numberList.get(i) % 2 != 0) {
					oddList.add(numberList.get(i));
				}
				if (numberList.get(i) < 0) {
					negativeList.add(numberList.get(i));
				}
			}

			//Displays lists
			System.out.println("\nThe Even Numbers are: ");
			System.out.print("[");
			for (int i = 0; i < evenList.size(); i++) {
				if (i == (evenList.size() - 1)) {
					System.out.print("" + evenList.get(i));
				}
				else {
					System.out.print("" + evenList.get(i) + ", ");
				}
			}
			System.out.println("]");
			
			System.out.println("\nThe Odd Numbers are: ");
			System.out.print("[");
			for (int i = 0; i < oddList.size(); i++) {
				if (i == (oddList.size() - 1)) {
					System.out.print("" + oddList.get(i));
				}
				else {
					System.out.print("" + oddList.get(i) + ", ");
				}
			}
			System.out.println("]");
			
			System.out.println("\nThe Negative Numbers are: ");
			System.out.print("[");
			for (int i = 0; i < negativeList.size(); i++) {
				if (i == (negativeList.size() - 1)) {
					System.out.print("" + negativeList.get(i));
				}
				else {
					System.out.print("" + negativeList.get(i) + ", ");
				}
			}
			System.out.println("]");
			
			//Gets input for loop
			System.out.println("\nDo you want to enter a new list? (y or n)");
			loopChar = scnr.next().charAt(0);
			if (loopChar == 'n') {
				quitProgram = true;
				scnr.close();
				System.exit(0);
			}
			else {
				quitInput = false;
				quitProgram = false;
				inputString = "";
				evenList.clear();
				oddList.clear();
				negativeList.clear(); 
				numberList.clear();
				counter = 1;
			}
		}
	}
}
