import java.util.Scanner;

public class LabProgram_Jiffy {
	
	//Converts seconds to jiffies	
	public static double secondsToJiffies(double userSeconds) {
		return (userSeconds * 100.0);
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.printf("%.2f", secondsToJiffies(scnr.nextInt())); scnr.close();
	}

}
