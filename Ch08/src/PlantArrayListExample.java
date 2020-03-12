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
		String input;
		ArrayList<Plant> myGarden = new ArrayList<Plant>();
		String plantName = "";
		int plantCost = 0;
		String colorOfFlowers = "";
		boolean isAnnual; 
		Plant tempPlant = new Plant();
		Flower tempFlower = new Flower();

		//Gets input
		input = scnr.next();
		while(!input.equals("-1")){
			if (input.equalsIgnoreCase("plant")) {
				plantName = scnr.next();
				plantCost = scnr.nextInt();
				
				tempPlant.setPlantName(plantName);
				tempPlant.setPlantCost(Integer.toString(plantCost));
				myGarden.add(tempPlant);
			}
			else if (input.equalsIgnoreCase("flower")) {
				plantName = scnr.next();
				plantCost = scnr.nextInt();
				isAnnual = scnr.nextBoolean();
				colorOfFlowers = scnr.next();
				
				tempFlower.setPlantName(plantName);
				tempFlower.setPlantCost(Integer.toString(plantCost));
				tempFlower.setPlantType(isAnnual);
				tempFlower.setColorOfFlowers(colorOfFlowers);
				myGarden.add(tempFlower);
			}
			else {
				System.out.println("Error on input!");
			}
			plantName = "";
			plantCost = 0;
			colorOfFlowers = "";
			isAnnual = false;
			tempPlant = new Plant();
			tempFlower = new Flower();
			input = scnr.next();
		}
		scnr.close();
		printArrayList(myGarden);
	}
}