public class FoodItem {
	private String name;
	private double fat;
	private double carbs;
	private double protein;

	//Default constructor
	public FoodItem() {
		name = "None";
		fat = 0.0;
		carbs = 0.0;
		protein = 0.0;
	}

	//Parameterized constructor
	public FoodItem(String name, double fat, double carbs, double protein) {
		this.name = name;
		this.fat = fat;
		this.carbs = carbs;
		this.protein = protein;
	}

	//Gets name
	public String getName() {
		return name;
	}

	//Gets fat
	public double getFat() {
		return fat;
	}

	//Gets carbs
	public double getCarbs() {
		return carbs;
	}

	//Gets protein
	public double getProtein() {
		return protein;
	}

	//Calculates calories of item
	public double getCalories(double numServings) {
		// Calorie formula
		double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
		return calories;
	}

	//Outputs item info
	public void printInfo() {
		System.out.println("Nutritional information per serving of " + name + ":");
		System.out.printf("   Fat: %.2f g\n", fat);
		System.out.printf("   Carbohydrates: %.2f g\n", carbs);
		System.out.printf("   Protein: %.2f g\n", protein);
	}
}