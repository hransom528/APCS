package src;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		//Sets up scanner and seed var
		Scanner scnr = new Scanner(System.in);
		int seed;
		
		//Gets seed for rnd
		seed = scnr.nextInt();
		scnr.close();
		
		//Sets up rnd and gets random number 0-10
		Random rnd = new Random(seed);
		int randomNum = rnd.nextInt(11);
		System.out.println("Random integer from 0 to 10: " + randomNum);
		System.out.println();
		
		//Rolls dice and gets sum
		int dice1 = rnd.nextInt(6) + 1;
		int dice2 = rnd.nextInt(6) + 1;
		int sum = dice1 + dice2;
		System.out.println("Dice rolls: " + dice1 + ", " + dice2);
		System.out.println("Dice sum: " + sum);
		System.out.println();
		
		//Simulates random integer game
		int gameNum = rnd.nextInt(3) - 1;
		System.out.println("Win (1), Lose (-1) or Draw (0): " + gameNum);
		System.out.println();
		
		//Simulates lottery drawing 1-75 
		int[] nums = new int[5]; //Array of 5 lottery numbers
		int i; 
		for (i=0; i <= 4; i++) {
			nums[i] = rnd.nextInt(75) + 1; //Generates random number for each number place
		}
		System.out.println("Winning number: " + nums[0] + "-" + nums[1] + "-" + nums[2] + "-" +nums[3] + "-" +nums[4]);
		System.out.println();
		
		//Generates random double from .3 to .7
		double randDouble = (0.4) * rnd.nextDouble() + (0.3);
		System.out.println("Random double from .3 to .7: " + randDouble);
	}

}
