package src;
import java.util.Scanner;

public class LabProgram_mathMethods {

	public static void main(String[] args) {
		//Declares scanner and nums
		Scanner scnr = new Scanner(System.in);
		double x = 0, y = 0,z = 0;
		double xy, xyz, xabs, rootxyz;
		
		//Gets floating-point nums
		x = scnr.nextDouble();
		y = scnr.nextDouble();
		z = scnr.nextDouble();
		scnr.close();
		
		//Does math and outputs
		xy = Math.pow(x, y);
		xyz = Math.pow(x, Math.pow(y, z));
		xabs = Math.abs(x);
		rootxyz = Math.sqrt(Math.pow(x*y, z));
		System.out.println("" + xy + " " + xyz + " " + xabs + " " + rootxyz);
	}

}
