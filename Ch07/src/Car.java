public class Car {
	private int modelYear;
	private int purchasePrice;
	private int currentValue; 

	//Default constructor
	public Car() {
		modelYear = -1;
		purchasePrice = -1;
		purchasePrice = -1;
	}

	//Parameterized constructor
	public Car(int modelYear, int purchasePrice, int currentYear) {
		this.modelYear = modelYear;
		this.purchasePrice = purchasePrice;
	}

	//Gets model year
	public int getModelYear() {
		return modelYear;
	}

	//Sets model year
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	//Gets purchase price
	public int getPurchasePrice() {
		return purchasePrice;
	}

	//Set purchase price
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	//Gets current value
	public int getCurrentValue() {
		return currentValue;
	}

	//Calculates current car value
	public void calcCurrentValue(int currentYear) {
		double depreciationRate = 0.15;
		int carAge = currentYear - modelYear;

		// Car depreciation formula
		currentValue = (int) 
				Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
	}

	//Outputs current information about the car
	public void printInfo() {
		System.out.println("Car's information:");
		System.out.println("   Model year: " + getModelYear());
		System.out.println("   Purchase price: " + getPurchasePrice());
		System.out.println("   Current value: " + getCurrentValue());
	}

}