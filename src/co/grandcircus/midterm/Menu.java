package co.grandcircus.midterm;

public class Menu {
	
	protected String ItemName;
	protected double price;

	public Menu() {
		
	}
	
	public Menu(String ItemName, double price) {
		super();
		this.ItemName = ItemName;
		this.price = price;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString(String name, double price) {
		return super.toString() + String.format(getItemName() + getPrice());
	}
	
	
}
