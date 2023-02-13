package restaurantmanagementsystem;

import java.util.ArrayList;

public class Bill {
	
	String itemName;
	int quantity;
	int price;
	
	ArrayList<Bill> bills = new ArrayList<>();
	
	public Bill(String itemName, int quantity, int price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}

	public ArrayList<Bill> getBills() {
		return bills;
	}

	public void setBills(ArrayList<Bill> bills) {
		this.bills = bills;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
