package co.grandcircus.midterm;

public class Food extends Menu {

	public String ifToasted;

	public Food() {
		super();
	}

	public Food(String ifToasted) {
		super();

		this.ifToasted = ifToasted;
	}

	public String getIfToasted() {
		return ifToasted;
	}

	public void setIfToasted(String ifToasted) {
		this.ifToasted = ifToasted;
	}

}
