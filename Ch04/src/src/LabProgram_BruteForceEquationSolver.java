package src;
import java.util.Scanner;

public class LabProgram_BruteForceEquationSolver {

	public static void main(String[] args) {
		//Declares vars and scanner
		Scanner scnr = new Scanner(System.in);
		int x1, x2;
		int y1, y2;
		int c1, c2;
		int tempSolution1, tempSolution2;
		boolean solutionFound = false;
		
		//Gets input
		x1 = scnr.nextInt();//First equation
		y1 = scnr.nextInt();
		c1 = scnr.nextInt();
		
		x2 = scnr.nextInt(); //Second equation
		y2 = scnr.nextInt();
		c2 = scnr.nextInt();
		scnr.close();
		
		//Brute forces equations
		for (int i = -10; i <= 10; i++) {
			for (int j = -10; j <= 10; j++) {
				tempSolution1 = (x1 * i) + (y1 * j);
				tempSolution2 = (x2 * i) + (y2 * j);
				if ((tempSolution1 == c1) && (tempSolution2 == c2)) {
					solutionFound = true;
					System.out.println("" + i + " " + j);
				}
			}
		}
		
		//Checks if no solution was found
		if (!solutionFound) {
			System.out.println("No solution");
		}

	}

}
