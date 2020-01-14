package src;
import java.util.Scanner;

public class LabProgram_RemoveGrayRGB {

	public static void main(String[] args) {
		//Declares scnr and vars
		Scanner scnr = new Scanner(System.in);
		int r, g, b;

		//Gets rgb values
		r = scnr.nextInt();
		g = scnr.nextInt();
		b = scnr.nextInt();
		scnr.close();

		if ((r <= g) && (r <= b)) {
			g -= r;
			b -= r;
			r -= r;
		}
		else if ((g <= r) && (g <= b)) {
			r -= g;
			b -= g;
			g -= g;
		}
		else if ((b <= r) && (g <= b)) {
			r -= g;
			b -= g;
			g -= g;
		}
		else {
			System.out.println("Error!");
		}

		System.out.println("" + r + " " + g + " " + b);
	}

}
