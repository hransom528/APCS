package src;
import java.util.Scanner;

public class LabProgram_MusicalNoteFrequencies {

	public static void main(String[] args) {
		//Declares scanner and vars, gets input
		Scanner scnr = new Scanner(System.in);
		final double r = Math.pow(2, (1 / 12.0));
		double f0 = scnr.nextDouble();
		double f1, f2, f3, f4;
		scnr.close();
		
		//Calculates frequencies
		f1 = f0 * (Math.pow(r, 1));
		f2 = f0 * (Math.pow(r, 2));
		f3 = f0 * (Math.pow(r, 3));
		f4 = f0 * (Math.pow(r, 4));
		
		//Outputs frequency results
		System.out.printf("%.2f", f0);
		System.out.print(" ");
		System.out.printf("%.2f", f1);
		System.out.print(" ");
		System.out.printf("%.2f", f2);
		System.out.print(" ");
		System.out.printf("%.2f", f3);
		System.out.print(" ");
		System.out.printf("%.2f", f4);
		System.out.println();
	}

}
