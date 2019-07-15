package co.grandcircus.midterm;

public class Drinks extends Menu {
	
	private String ItemName;
	private double price;
	private String temperature;
	
	public Drinks() {
		
	}
	
	public Drinks(String ItemName, double price) {
		super.setItemName(ItemName);
		super.setPrice(price);
	}
	
	public String toString(String name, double price) {
		return super.toString() + String.format(getItemName() + getPrice());
	}
	
	public String getTemp() {
		return temperature;
		
	}
	
	public void setTemp(String temp) {
		this.temperature = temp;
	}

}
