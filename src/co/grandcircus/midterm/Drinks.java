package co.grandcircus.midterm;

public class Drinks extends Menu {
	
	public String milkChoice;
	public String flavorChoice;
	public String tempChoice;

	public Drinks() {
		
	}
	
	public Drinks(String milkChoice, String flavorChoice, String tempChoice) {
		this.milkChoice = milkChoice;
		this.flavorChoice = flavorChoice;
		this.tempChoice = tempChoice;
	} // end constructor

	public String getMilkChoice() {
		return milkChoice;
	}

	public void setMilkChoice(String milkChoice) {
		this.milkChoice = milkChoice;
	}

	public String getFlavorChoice() {
		return flavorChoice;
	}

	public void setFlavorChoice(String flavorChoice) {
		this.flavorChoice = flavorChoice;
	}

	public String getTempChoice() {
		return tempChoice;
	}

	public void setTempChoice(String tempChoice) {
		this.tempChoice = tempChoice;
	}
	
	public String toString(){
	      return ("with " + milkChoice + ", " + flavorChoice + ", " + tempChoice + ". ");
	   }//end toString
	
} // end menu 




