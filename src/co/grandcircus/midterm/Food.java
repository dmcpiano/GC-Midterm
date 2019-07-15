package co.grandcircus.midterm;

public class Food extends Menu {

	private String ItemName;
	private double price;
	
	public Food() {
		
	}
	
	public Food(String ItemName, double price) {
		super.setItemName(ItemName);
		super.setPrice(price);
	}
	
	public String toString(String name, double price) {
		return super.toString() + String.format(getItemName() + getPrice());
	}
}
