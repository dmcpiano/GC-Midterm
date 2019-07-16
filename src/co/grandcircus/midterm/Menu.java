package co.grandcircus.midterm;


public class Menu{

   private String name;
   private double price;
   
   public Menu(){
	   
   }//empty constructor
   
   public Menu(String name, double price){
      this.name = name;
      this.price = price;
   }//end constructor
   

public String getName(){
      return name;
   }//end getName
   
   public void setName(String name){
      this.name = name;
   }//end getName
  
   
   public double getPrice(){
      return price;
   }//end getPrice
   
   public void setPrice(double price){
      this.price = price;
   }//end getPrice
   
   public String toString(){
      return String.format("%s, $", name, price);
   }//end toString
}//end Menu