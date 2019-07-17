package co.grandcircus.midterm;

import java.util.*;

public class StarbucksApp{
	
   private static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      
      
      int userChoice = 0;
      int quantityChoice = 0;
      int quantityOfItems = 0;
      int checkNumber;
      int cardNumber;
      int CVV;
      double costOfItem = 0;
      double Extras = 0;
      double cash = 0;
      String expiration;
      String userContinue = "y";
      String choice;
      String userPay = "";
      String milkChoice = null;
      String flavorChoice = null;
      String tempChoice = null;
      String newOrder = "";
      String toastedChoice = null;
      
      ArrayList<Menu> order = new ArrayList<>();
  
   
   do {	  
         System.out.println("Welcome to the Grand Circus Starbucks!\n");
         
         do{
            System.out.println("- - - Menu - - -\n ");
            List<Menu> menu = StarbucksFileUtil.readFile();
            for (int i=0; i<menu.size()-1;i++) {
            	String item = menu.get(i).toString() + "$" + menu.get(i).getPrice();
                System.out.println((i + 1) +") " + item);
            }
            
            	System.out.println("\nChoose an item (1- 16).");
            	userChoice = scan.nextInt();
            	choice = menu.get(userChoice).getName();
            
            	double price = menu.get(userChoice).getPrice();
            	
            	
                System.out.println("How many of those would you like? ");
                quantityChoice = scan.nextInt();
                
                for (int i = 0; i < quantityChoice; i++) {
                costOfItem = price;
                quantityOfItems += quantityChoice;
                System.out.println("\nItem " + (i+1) + ": " );
                scan.nextLine();
                
                
       if (userChoice >= 1 && userChoice <= 8) {
         		   
         		   System.out.println("Hot or iced? ");
         		   tempChoice = scan.nextLine();
         		  
         		   System.out.println("Would you like milk in that? y/n");
         		   String milkOption = scan.nextLine();
         		   if (milkOption.equalsIgnoreCase("y")) {
         			 getMilkChoice(milkChoice);
         				 Extras += 0.60;
         				 
         			 }  else if (milkOption.equalsIgnoreCase("n")) {
         				 milkChoice = "No milk";
         				 Extras += 0;
         				 
         			 }
      
    	  System.out.println("Would you like to add any flavors to your drink? y/n");
		  String flavorOption = scan.nextLine();
		  if (flavorOption.equalsIgnoreCase("y")) {
			  getFlavorChoice(flavorChoice); 
			  Extras += 0.60;
			  
		  } else if (flavorOption.equalsIgnoreCase("n")) {
		  		flavorChoice = "No flavors";
		  		Extras += 0;
		  		
		  }
		  
       } else if (userChoice >= 9 && userChoice <= 12) {
    	  System.out.println("Would you like that toasted? y/n ");
    	  String toastedOption = scan.nextLine();
    	  if (toastedOption.equalsIgnoreCase("y")) {
    		  toastedChoice = "toasted";
    		  
    		  
    	  } else if (toastedOption.equalsIgnoreCase("n")) {
    		  toastedChoice = "not toasted";
  
    	  }
    	
       } else if (userChoice >= 13 && userChoice <= 16) {
    	   System.out.println("Delicious choice! ");
    	   
       }
       
 } // end for loop
       System.out.println("\nDoes this complete your order? Select (y/n): ");
 	   userContinue = scan.next();
 	   
 	   
 	   
 	  double costOfItems = costOfItem + Extras;
	  double subTotal = costOfItems * quantityOfItems;
 	   
List<String> drinks = new ArrayList<>();
      
      drinks.add("Espresso");
      drinks.add("White Chocolate Mocha Frappucino Blended Coffee");
      drinks.add("Caffe Latte");
      drinks.add("Pike Place Roast");
      drinks.add("Mint Majesty Herbal Tea");
      drinks.add("Matcha Green Tea Latte");
      drinks.add("Earl Grey Black Tea");
      drinks.add("Chai Latte");
      
List<String> sandwiches = new ArrayList<>();
      
      sandwiches.add("Double Smoked-Bacon Cheddar & Egg Breakfast Sandwich");
      sandwiches.add("Crispy Grilled Cheese Sandwich");
      sandwiches.add("Baja Black Bean Veggie Wrap");
      sandwiches.add("Chicken Caprese Sandwich");
      

List<String> bakery = new ArrayList<>();
      
      bakery.add("Blueberry Muffin");
      bakery.add("Birthday Cake Pop");
      bakery.add("Iced Lemon Loaf Cake");
      bakery.add("Banana Nut Bread");
      
 	   if (drinks.contains(choice)) {
 		  String orderDrinks = (choice + tempChoice + milkChoice + flavorChoice  + price);
 		  System.out.println(orderDrinks);
 	   } else if (sandwiches.contains(choice)) {
 		   String orderFood = (choice + toastedChoice  + price);
 		   System.out.println(orderFood);
 	   } else if (bakery.contains(choice)) {
 		   String orderBakedGoods = (choice + price);
 		   System.out.println(orderBakedGoods);
 	   }
 	   
 	   if (userContinue.equalsIgnoreCase("y")) {
 		   
 		   
 		   
 		   System.out.printf("$%.2f" + "Subtotal: " + subTotal);
 		   System.out.printf("Sales Tax: $%.2f", subTotal * .6);
 		   double total = subTotal + (subTotal * .6);
 		   System.out.printf("\nTotal: $%.2f\n", (total));
 		   
 		   System.out.println("\nAre you paying with cash, check, or card?");
              userPay = scan.nextLine();
           
              if (userPay.equalsIgnoreCase("cash")) {
                 System.out.println("How much cash are you paying with? ");
                 cash = scan.nextDouble();
                 System.out.printf("Great, and here is your change: $%.2f\n", (cash-total));
                 System.out.println("\nThank you for visiting Starbucks, have a nice day!");
                 order.clear();
                 break;
                 
              } else if(userPay.equalsIgnoreCase("check")){
                 System.out.println("Enter your four-digit check number: ");
                 checkNumber = scan.nextInt();
                 System.out.println("\nThank you for visiting Starbucks, have a nice day!");
                 order.clear();
                 break;
                 
              } else if(userPay.equalsIgnoreCase("card")){
                 System.out.println("Enter your twelve-digit card number: ");
                 cardNumber = scan.nextInt();
                 System.out.println("Enter the card expiration date: ");
                 expiration = scan.next();
                 System.out.println("Enter the CVV: ");
                 CVV = scan.nextInt();
                 System.out.println("\nThank you for visiting Starbucks, have a nice day!");
                 order.clear();
                 break;
              }
              
              
 	   } // end if
    
 } while (userContinue.equalsIgnoreCase("n")); // end do 1/2
    
        
         System.out.println("\nStart a new order? (y/n)");
         newOrder = scan.next();
         
} while(newOrder.equalsIgnoreCase("y")); // end do 2/2
}// end main method
       
         		   
         		   
         		   
         		   /*
                
                order.add(getItem(userChoice * quantityChoice));
                for(int i=0; i<quantityChoice - 1;i++){
            	  
            	  System.out.println("Item " + (i+1) + ": \n");
                  
   
               } //end for
           
           
	          
	          
	      	  
	      	  /* 
	           
	           System.out.println("\nThanks for your order! You have selected: ");
	           for(Menu o: order){
	              System.out.println(o.toString());
	           }//end for
	        
	           
	           
	           //if end, stop program*/
	           
   
 private static Menu getPrice(int userChoice) {
	   List<Menu> money = StarbucksFileUtil.readFile();
	   Menu subtotal = money.get(money.size()-1);
	   subtotal = money.get(userChoice);
	   return subtotal;
}
 
public static void getMilkChoice(String milkChoice) {
	
			   System.out.println("Choose which kind from the list below: \n ");
			   List <String> milk = new ArrayList<>();
			   milk.add("Reduced fat");
			   milk.add("Fat free");
			   milk.add("Whole milk");
			   milk.add("Almond");
			   milk.add("Coconut");
			   milk.add("Soy");
			   
			   for (int i = 0; i < milk.size(); i++) {
				   System.out.println(milk.get(i).toString());
			   }  
			   milkChoice = scan.nextLine();
			   
}  

public static void getFlavorChoice(String flavorChoice) {
	
	System.out.println("Choose which kind from the list below: \n ");
	   List <String> milk = new ArrayList<>();
	   milk.add("Vanilla");
	   milk.add("Peppermint");
	   milk.add("Raspberry");
	   milk.add("Caramel");
	   milk.add("Toffee Nut");
	   milk.add("Hazelnut");
	   
	   for (int i = 0; i < milk.size(); i++) {
		   System.out.println(milk.get(i).toString());
	   }  
	   flavorChoice = scan.nextLine();
	   
}

public static Menu getItem(int userChoice){
      List<Menu> menu = StarbucksFileUtil.readFile();
      Menu item = menu.get(menu.size()-1);
      try{
         item = menu.get(userChoice);
        
      }//end try
      catch(IndexOutOfBoundsException e){}
      return item;
   }//end getItem
	   
	
   
   
}//end StarbucksApp
