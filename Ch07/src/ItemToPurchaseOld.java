public class ItemToPurchaseOld {
	//Creates private member variables
	private String itemName;
	private int itemPrice;
	private int itemQuantity;

	public ItemToPurchaseOld() {
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
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
}
