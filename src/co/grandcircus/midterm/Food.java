package co.grandcircus.midterm;

public class Food extends Menu {

	public String toasted;

	public Food(String toasted) {
		super();
		this.toasted = toasted;
	}

	public String getToasted() {
		return toasted;
	}

	public void setToasted(String toasted) {
		this.toasted = toasted;
	}

}
