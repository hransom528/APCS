import java.util.ArrayList;
import java.util.Scanner;

public class PlantArrayListExample {
	//Prints out each object's info from a Plant ArrayList
	public static void printArrayList(ArrayList<Plant> objects) {
		for (int i = 0; i < objects.size(); i++) {
			objects.get(i).printInfo();
			System.out.println();
		}
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Plant> myGarden = new ArrayList<Plant>();
		Plant tempPlant = new Plant();
		Flower tempFlower = new Flower();
		
		//Used for assigning input to objects
		String input;
		String plantName = "";
		int plantCost = 0;
		String colorOfFlowers = "";
		boolean isAnnual; 
		

		//Gets input
		input = scnr.next();
		while(!input.equals("-1")){
			if (input.equalsIgnoreCase("plant")) {
				//Gets all plant fields
				plantName = scnr.next();
				plantCost = scnr.nextInt();
				
				//Assigns plant fields to temporary plant object
				tempPlant.setPlantName(plantName);
				tempPlant.setPlantCost(Integer.toString(plantCost));
				
				//Adds plant object to arraylist
				myGarden.add(tempPlant);
			}
			else if (input.equalsIgnoreCase("flower")) {
				//Gets all flower fields
				plantName = scnr.next();
				plantCost = scnr.nextInt();
				isAnnual = scnr.nextBoolean();
				colorOfFlowers = scnr.next();
				
				
				//Asigns flower fields to temporary flower object 
				tempFlower.setPlantName(plantName);
				tempFlower.setPlantCost(Integer.toString(plantCost));
				tempFlower.setPlantType(isAnnual);
				tempFlower.setColorOfFlowers(colorOfFlowers);
				
				//Adds flower object to arraylist
				myGarden.add(tempFlower);
			}
			else {
				System.out.println("Error on input!");
			}
			
			//Resets fields for next input
			plantName = "";
			plantCost = 0;
			colorOfFlowers = "";
			isAnnual = false;
			tempPlant = new Plant();
			tempFlower = new Flower();
			
			//Gets next input
			input = scnr.next();
		}
		//Closes scanner and outputs all plants from arraylist
		scnr.close();
		printArrayList(myGarden);
	}
}