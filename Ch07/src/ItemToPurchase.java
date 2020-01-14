public class ItemToPurchase {
	//Creates private member variables
	private String itemName;
	private String itemDescription;
	private int itemPrice;
	private int itemQuantity;
	
	//Default constructor
	public ItemToPurchase() {
		itemName = "none";
		itemDescription = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
	
	//Parameterized constructor
	public ItemToPurchase(String newItemName, String newItemDescription, int newItemPrice, int newItemQuantity) {
		itemName = newItemName;
		itemDescription = newItemDescription;
		itemPrice = newItemPrice;
		itemQuantity = newItemQuantity;
	}

	//Sets itemName
	public void setName(String nameIn) {
		itemName = nameIn;
	}

	//Gets itemName
	public String getName() {
		return itemName;
	}

	//Sets itemPrice
	public void setPrice(int priceIn) {
		itemPrice = priceIn;
	}

	//Gets itemPrice
	public int getPrice() {
		return itemPrice;
	}

	//Sets itemQuantity
	public void setQuantity(int quantityIn) {
		itemQuantity = quantityIn;
	}

	//Gets itemQuantity
	public int getQuantity() {
		return itemQuantity;
	}

	//Sets itemDescription
	public void setDescription(String descriptionIn) {
		itemDescription = descriptionIn;
	}

	//Gets itemDescription
	public String getDescription() {
		return itemDescription;
	}

	//Outputs the item cost w/details
	public void printItemCost() {
		int tempTotal = itemPrice * itemQuantity;
		System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + tempTotal);
	}

	//Outputs the item's description
	public void printItemDescription() {
		System.out.println(itemName + ": " + itemDescription);
	}
}
