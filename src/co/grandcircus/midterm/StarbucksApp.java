package co.grandcircus.midterm;
import java.util.*;

<<<<<<< HEAD
public class StarbucksApp{
   private static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args){
      
      String userContinue = "y";
      int userChoice;
      Menu choice;
      ArrayList<Menu> order = new ArrayList<>();
      int quantity;
      double subtotal = 0;
      double total;
      String userPay = "";
      double userCash = 0;
      int checkNumber;
      int cardNumber;
      String expiration;
      int CVV;
      String newOrder = "";
      
      do{
         System.out.println("Welcome to the Grand Circus Starbucks\n");
         do{
            //print Menu
            System.out.println("Menu: ");
            List<Menu> menu = StarbucksFileUtil.readFile();
            for (int i=1; i<menu.size()-1;i++) {
               System.out.println(i + ") " + menu.get(i).toString());
            }
            //get choice && quantity
            System.out.println("\nChoose one of the options through the numbers.");
            userChoice = scan.nextInt();
            if(userChoice<menu.size()){
               choice = getItem(userChoice);
               System.out.println("How many would you like?");
               quantity = scan.nextInt();
               for(int i=0; i<quantity;i++){
                  order.add(choice);
                  subtotal+= choice.getPrice();
               }//end for
               System.out.println("Subtotal for choice above:" + (choice.getPrice() * quantity));
            
               System.out.println("\nWould you like to order anything else? (y/n)");
               userContinue = scan.next();
            }
            else{
               System.out.println("Error, choose a valid option.\n");
            }
         }//end do
         while(userContinue.equals("y") || userContinue.equals("Y"));
         
         System.out.println("Subtotal: " + subtotal);
         System.out.printf("Sales Tax: %.2f", (subtotal*0.06));
         total = (subtotal*0.06)+subtotal;
         System.out.printf("\nTotal: %.2f\n", (total));
         do{
            System.out.println("\nAre you paying with cash, check, or card?");
            userPay = scan.next();
         
            if(userPay.equalsIgnoreCase("cash")){
               System.out.println("Enter amount you are paying with: ");
               userCash = scan.nextDouble();
               System.out.printf("Here is your change: $%.2f\n", (userCash-total));
               break;
            }
            else if(userPay.equalsIgnoreCase("check")){
               System.out.println("Enter the check number: ");
               checkNumber = scan.nextInt();
               break;
            }
            else if(userPay.equalsIgnoreCase("card")){
               System.out.println("Enter the card number: ");
               cardNumber = scan.nextInt();
               System.out.println("Enter the card expiration date: ");
               expiration = scan.next();
               System.out.println("Enter the CVV: ");
               CVV = scan.nextInt();
               break;
            }
         }//end do
         while(!userPay.equalsIgnoreCase("cash") || !userPay.equalsIgnoreCase("check") || !userPay.equalsIgnoreCase("card"));
         
         System.out.println("\nYour order:");
         for(Menu o: order){
            System.out.println(o.toString());
         }//end for
         System.out.println("Subtotal: " + subtotal);
         System.out.printf("Sales Tax: %.2f", (subtotal*0.06));
         total = (subtotal*0.06)+subtotal;
         System.out.printf("\nTotal: %.2f\n", (total));
         System.out.println("\nThank you for your order have a nice day!");
         
         order.clear();
         
         //if end, stop program
         System.out.println("\nNew order? (y/n)");
         newOrder = scan.next();
         
      }//end do
      while(newOrder.equalsIgnoreCase("y"));
   }//end main
   
   public static Menu getItem(int choice){
      List<Menu> menu = StarbucksFileUtil.readFile();
      Menu item = menu.get(menu.size()-1);
      try{
         item = menu.get(choice);
      }//end try
      catch(IndexOutOfBoundsException e){}
      return item;
   }//end getItem
}//end StarbucksApp
=======
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
>>>>>>> 77f4e7dd8884fad6ef3421ac1b84e45891e0de06
