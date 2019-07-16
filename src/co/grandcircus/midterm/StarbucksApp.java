package co.grandcircus.midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class StarbucksApp extends Menu {
	
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("- - - -  Welcome to the Grand Circus StarSucks! - - - - ️\n");
		printMenu();
	}
	private static void printMenu() {
		
		ArrayList<Menu> menu = new ArrayList<>();
		menu.add(new Drinks("Espresso ", 1.95));
		menu.add(new Drinks("White Chocolate Mocha Frappucino Blended Coffee", 3.95));
		menu.add(new Drinks("Caffe Latte ", 3.25));
		menu.add(new Drinks("Pike Place ", 1.95));
		menu.add(new Drinks("Mint Majesty Herbal Tea ", 2.25));
		menu.add(new Drinks("Matcha Green Tea Latte ", 2.60));
		menu.add(new Drinks("Earl Grey Black Tea ", 2.75));
		menu.add(new Drinks("Chai Latte ", 3.75));
		menu.add(new Food("Double Smoked-Bacon, Cheddar & Egg Breakfast Sandwich ", 4.95));
		menu.add(new Food("Crispy Grill Cheese Sandwich ", 5.95));
		menu.add(new Food("Baja Black Bean Veggie Wrap ", 5.45));
		menu.add(new Food("Chicken Caprese Sandwich ", 5.45));
		menu.add(new Food("Blueberry Muffin ", 2.45));
		menu.add(new Food("Birthday Cake Pop ", 1.95));
		menu.add(new Food("Iced Lemon Loaf Cake ", 2.95));
		menu.add(new Food("Banana Nut Bread ", 2.95));
		
		for (int i = 0; i < menu.size(); i++) {
		
		if (menu.get(i) instanceof Drinks) {
			
			System.out.println(menu.get(i).getItemName() + menu.get(i).getPrice());
			
		} else if (menu.get(i) instanceof Food) {
			System.out.println(menu.get(i).getItemName() + menu.get(i).getPrice());
		}
		}
		
		System.out.println("\nWhat would you like to order? ");
		String ItemChoice = scnr.nextLine();
		
		//System.out.println("What size? ");
		//System.out.println("Hot or iced? ");
		//String tempChoice = scnr.nextLine();
		//System.out.println("With milk or without? ");
		//String milkChoice = scnr.nextLine();
		//System.out.println("Would you like any flavors added to your drink? ");
		//int pumpChoice = scnr.nextInt();
		
	}

}
