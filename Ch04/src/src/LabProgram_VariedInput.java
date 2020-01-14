package src;
import java.util.ArrayList;
import java.util.Scanner;

public class LabProgram_VariedInput {

	public static void main(String[] args) {
		//Declares scanner, variables and list
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> ints = new ArrayList<Integer>();
		boolean exit = false;
		int avg = 0;
		int max = -1;
		int l = 0;

		//Gets input
		while (!exit) {
			ints.add(scnr.nextInt());
			if (ints.get(l) < 0) {
				ints.remove(l);
				exit = true;
				break;
			}
			l += 1;
		}
		scnr.close();

		//Caclulate statistics
		for (int i = 0; i < ints.size(); i++) {
			avg += ints.get(i);
		}
		avg /= (ints.size());

		for (int j = 0; j < ints.size(); j++) {
			if (ints.get(j) >= max) {
				max = ints.get(j);
			}
		}

		//Outputs statistics
		System.out.print("" + avg + " ");
		System.out.println("" + max);
	}

}
