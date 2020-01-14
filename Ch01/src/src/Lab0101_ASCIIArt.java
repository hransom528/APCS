package src;

import java.util.Scanner;

public class Lab0101_ASCIIArt {
	
	public static void main(String[] args) {
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("*******");
		System.out.println("  ***");
		System.out.println("\n");
      	System.out.println("/\\   /\\");
		System.out.println("  o o");
		System.out.println(" =   =");
		System.out.println("  ---");
		
		Scanner scnr = new Scanner(System.in);
		String x;
		x = scnr.next();
		scnr.close();
		
		System.out.println("\n");
		System.out.println("  " + x);
		System.out.println(" " + x + x + x);
		System.out.println(x + x + x + x + x);
		System.out.println("\n");
		
		System.out.println("  +-+    +-+   ");
		System.out.println("  +--------+   ");
		System.out.println("    | O o |    ");
		System.out.println("    +-----+    ");
		System.out.println("+-------------+");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("+-------------+");
		System.out.println("+--+       +--+");
		
		/*System.out.println("        .                          .                ");
		System.out.println("       //                          \\\\             ");
		System.out.println("      //                            \\\\            ");
		System.out.println("     //                              \\\\           ");
		System.out.println("    //              _._               \\\\          ");
		System.out.println(" .---.             .//|\\\\.              .---.     ");
		System.out.println("/    \\                                  /    \\   ");
		*/
	}

}
