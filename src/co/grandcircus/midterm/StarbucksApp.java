package co.grandcircus.midterm;

import java.util.*;

public class StarbucksApp{
	
   private static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      
      String userContinue = "y";
      int userChoice = 0;
      String choice;
      int quantityChoice = 0;
      int quantityOfItems = 0;
      double costOfItem = 0;
      String userPay = "";
      
      double cash = 0;
      int checkNumber;
      int cardNumber;
      String expiration;
      int CVV;
      
      String newOrder = "";
      
      ArrayList<Menu> order = new ArrayList<>();
      
      do{
    	  
         System.out.println("Welcome to the Grand Circus Starbucks!\n");
         
         do{
            //print Menu
            System.out.println("- - - Menu - - -\n ");
            List<Menu> menu = StarbucksFileUtil.readFile();
            for (int i=0; i<menu.size()-1;i++) {
            	String item = menu.get(i).toString();
                System.out.println((i + 1) +") " + item);
            }
            
            //get choice
            	System.out.println("\nChoose an item (1- 16).");
            	userChoice = scan.nextInt();
            	choice = menu.get(userChoice).getName();
            	double price = menu.get(userChoice).getPrice();
            	System.out.println(choice);
                System.out.println("How many of those would you like? ");
                quantityChoice = scan.nextInt();
                quantityOfItems += quantityChoice;
                
                System.out.println(quantityOfItems);
                
                costOfItem = price;
                
                System.out.println(costOfItem);
                scan.nextLine();
                
                order.add(getItem(userChoice * quantityChoice));
                for(int i=0; i<quantityChoice - 1;i++){
            	  
            	  System.out.println("Item " + (i+1) + ": \n");
                  getInfo(userChoice);
   
               } //end for
           
           
	          
	          
	      	  
	      	  /*System.out.println("Subtotal: " + (getInfo(userChoice) + cost) * quantity);
	      	  System.out.printf("Sales Tax: %.2f", ((getInfo(userChoice) + cost) * (quantity)) * 0.06);
	      	  double total = (((getInfo(userChoice) + cost) * quantity) * 0.06) + cost;
	      	  System.out.printf("\nTotal: %.2f\n", (total));*/
	      	  
	          do{
	              System.out.println("\nAre you paying with cash, check, or card?");
	              userPay = scan.nextLine();
	           
	              if (userPay.equalsIgnoreCase("cash")) {
	                 System.out.println("How much cash are you paying with? ");
	                 cash = scan.nextDouble();
	                 //System.out.printf("Great, and here is your change: $%.2f\n", (cash-total));
	                 break;
	                 
	              } else if(userPay.equalsIgnoreCase("check")){
	                 System.out.println("Enter your four-digit check number: ");
	                 checkNumber = scan.nextInt();
	                 break;
	                 
	              } else if(userPay.equalsIgnoreCase("card")){
	                 System.out.println("Enter your twelve-digit card number: ");
	                 cardNumber = scan.nextInt();
	                 System.out.println("Enter the card expiration date: ");
	                 expiration = scan.next();
	                 System.out.println("Enter the CVV: ");
	                 CVV = scan.nextInt();
	                 break;
	              }
	              
	           } while(!userPay.equalsIgnoreCase("cash") || !userPay.equalsIgnoreCase("check") || !userPay.equalsIgnoreCase("card")); //end do 
	           
	           System.out.println("\nThanks for your order! You have selected: ");
	           for(Menu o: order){
	              System.out.println(o.toString());
	           }//end for
	        
	           System.out.println("\nThank you for visiting Starbucks, have a nice day!");
	           
	           order.clear();
	           
	           //if end, stop program
	           System.out.println("\nStart a new order? (y/n)");
	           newOrder = scan.next();
	           
	        }//end do
	        while(newOrder.equalsIgnoreCase("y"));
	    
            
            System.out.println("\nDoes this complete your order? Select (y/n): ");
         	   userContinue = scan.next();
         	   userContinue = userContinue.toLowerCase();
         	   
      } while(userContinue.equals("y")); // end do
      
   }
         
   
   private static Menu getPrice(int userChoice) {
	   List<Menu> money = StarbucksFileUtil.readFile();
	   Menu subtotal = money.get(money.size()-1);
	   subtotal = money.get(userChoice);
	   return subtotal;
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
   
public static double getInfo(int userChoice) {
	   Scanner scan = new Scanner(System.in);
	   double AddOns = 0;
	   String choices;
	   
	   if (userChoice >= 1 && userChoice <= 8) {
		   
		   System.out.println("Hot or iced? ");
		   String tempChoice = scan.nextLine();
		   System.out.println("Would you like milk in that? y/n");
		   String milkOption = scan.nextLine();
		   milkOption = milkOption.toLowerCase();
		   if (milkOption.equals("y")) {
			   
			   System.out.println("Choose which kind from the list below (1-6)\n ");
			   List <String> milk = new ArrayList<>();
			   milk.add("Reduced fat 2%");
			   milk.add("Fat-free");
			   milk.add("Whole milk");
			   milk.add("Almond + .60c");
			   milk.add("Coconut + .60c");
			   milk.add("Soy + .60c");
			   
			   for (int i = 0; i < milk.size(); i++) {
				   System.out.println((i + 1) + ") " + milk.get(i).toString());
			   }  
			   int milkChoice = scan.nextInt(); 
			   if (milkChoice >= 4 && milkChoice <= 6) {
					   AddOns += (.60);
					   
					   
			   } else if (milkChoice >= 1 && milkChoice <=3) {
					   AddOns += 0;
					   
			   } 
			   } else if (milkOption.equals("n")) {
			      AddOns += 0;
			 
		   }
		   
		   System.out.println("Would you like to add any flavors to your drink? y/n");
		   scan.nextLine();
		   String flavorChoice = scan.nextLine();
		   flavorChoice = flavorChoice.toLowerCase();
		   
		   if (flavorChoice.equals("y")) {
			   System.out.println("Choose a flavor from the list below for an additional $0.75. (1-6) ");
			   ArrayList <String> flavor = new ArrayList<>();
			   flavor.add("Vanilla");
			   flavor.add("Hazelnut");
			   flavor.add("Toffee nut");
			   flavor.add("Caramel");
			   flavor.add("Cinnamon dolce");
			   flavor.add("Peppermint");
			   flavor.add("Raspberry");
			   flavor.add("Simple syrup");
			   
			   for (int i = 0; i < flavor.size(); i++) {
				   System.out.println((i + 1) + ") " + flavor.get(i).toString());
				   
			   } 
			   int flavorOption = scan.nextInt(); 
			   AddOns += 0.75;
			   
			   
		   
		   } else if (flavorChoice.equals("n")) {
			   AddOns += 0;
			  
		   }
		   
	   } else if (userChoice >= 9 && userChoice <= 12) {
		   System.out.println("Would you like that toasted? y/n");
		   String toastedChoice = scan.nextLine();
		   toastedChoice = toastedChoice.toLowerCase();
		   
		   if (toastedChoice.equals("y")) {
			  
		   } else if (toastedChoice.equals("n")) {
			   
		   }
	   } else if (userChoice >= 13 && userChoice <= 16) {
		   System.out.println("Delicious choice! ");
	
	   }
	   
	   
	   System.out.println("Total Add-ons: $" + AddOns + "\n");
	   
	   
	   
	   
	return AddOns;
	   
	
   }
   
}//end StarbucksApp
