package co.grandcircus.midterm;


public class Menu{

   private String name;
   private String category;
   private String description;
   private double price;
   
   public Menu(){}//empty constructor
   
   public Menu(String name, String category, String description, double price){
      this.name = name;
      this.category = category;
      this.description = description;
      this.price = price;
   }//end constructor
   
   public String getName(){
      return name;
   }//end getName
   
   public void setName(String name){
      this.name = name;
   }//end getName
   
   public String getCategory(){
      return category;
   }//end getCategory
   
   public void setCategory(String category){
      this.category = category;
   }//end getCategory
   
   public String getDescription(){
      return description;
   }//end getDescription
   
   public void setDescription(String description){
      this.description = description;
   }//end getDescription
   
   public double getPrice(){
      return price;
   }//end getPrice
   
   public void setPrice(double price){
      this.price = price;
   }//end getPrice
   
   public String toString(){
      return String.format("Name: %s, Category: %s, Desc: %s, Price: %.2f", name, category, description, price);
   }//end toString
}//end Menu