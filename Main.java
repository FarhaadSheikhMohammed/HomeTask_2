import java.io.*;
class Car
{
int id;
int manufactureyear;
int price;
String make;
String model;
String color;
String regnumber;
public Car(int id, String make,int manufactureyear, String model , int price,String color, 
		String regnumber) {
        this.id = id;
        this.make = make;
        this.manufactureyear = manufactureyear;
        this.model = model;
        this.price = price;
        this.color = color;
        this.regnumber = regnumber;
}
}

class Main
{
    public static void main(String[] args){
        Car[] obj={
            new Car(1,"Mercedes",1999,"Sedan",10000,"black","AF69A002"),
            new Car(2,"Mercedes",2015,"SUV",3000,"black","AF69A004"),
            new Car(3,"Opel",2020,"CrossOver",4000,"brown","AF69A006"),
            new Car(4,"Citroen",1990,"Sedan",10000,"purple","AF69A008"),
            new Car(5,"Opel",2005,"Sedan",10000,"beige","AF69A010"),
            new Car(6,"Audi",1999,"Sedan",6000,"black","AF69A012"),
            new Car(7,"Ford",2005,"SUV",8000,"black","AF69A014"),
            new Car(8,"Kia",2000,"CrossOver",3000,"brown","AF69A016"),
            new Car(9,"Audi",2005,"Sedan",6000,"purple","AF69A018"),
            new Car(10,"Opel",2013,"Sedan",8000,"beige","AF69A020"),
            new Car(11,"Ford",2013,"SUV",8000,"white","AF69A022"),
        };
        int currentyear=2023;
        File abs_file=new File("");
        String abs_path=abs_file.getAbsolutePath();
        String Car_List_of_a_Particular_Brand=abs_path+"\\Car_List_of_a_Particular_Brand";
       try {
            System.out.println("Creating a list of cars of Brand Opel:");
            FileWriter pen=new FileWriter(Car_List_of_a_Particular_Brand);
            pen.write("List of Opel cars:");
        for(Car i:obj)
        {
            String brand=i.make;
            if(brand.equals("Opel"))
            {
                pen.write("id: "+i.id+"\n make: "+i.make+"\n manufactueyear: "+i.manufactureyear+"\n model: "+i.model+ "\n price:"+i.price+"\n color:"+"\n RegNumber: "+i.regnumber+"\n");                                  
            }
        }  
         System.out.println("Created  List of cars of a given brand Opel!");
         System.out.println("....................................................");
         pen.close();
       } catch (Exception e) {
        System.out.println("Some Error has occured while creating the list of Cars for the brand Opel!");        
       }

       String Cars_of_Specific_Model_used_for_15years = abs_path+"\\Cars_of_Specific_Model_used_for_15years";
       try {
         System.out.println("Creating List of cars of SUV model that have been in use for more than 15 Years:");
         FileWriter pen=new FileWriter(Cars_of_Specific_Model_used_for_15years);
         pen.write("List of cars of SUV model that have been in use for more than 15 Years:\n");
        for(Car i:obj)
        {
            int year=currentyear-i.manufactureyear;
            String model=i.model;
            if((year>15) && model.equals("SUV"))
            {
            	pen.write("id: "+i.id+"\n make: "+i.make+"\n manufactueyear: "+i.manufactureyear+"\n model: "+i.model+ "\n price:"+i.price+"\n color:"+"\n RegNumber: "+i.regnumber+"\n");                               
            }
        }  
        pen.close();
        System.out.println("Created List for cars of SUV model that have been in use for more than 15 Years!");  
        System.out.println("....................................................");
       } catch (Exception e) {
        System.out.println("Some Error has occured while creating the list of SUV cars in use for more than 15 years");
       }
       

       String ManufactureYear_of_Cars_above_Certain_Amount = abs_path+"\\ManufactureYear_of_Cars_above_Certain_Amount";
       int price=7000;
       try {
           System.out.println("Creating List of cars of manufacture year 2005, whose price is greater than 7000:");
           FileWriter pen=new FileWriter(ManufactureYear_of_Cars_above_Certain_Amount);
           pen.write("List of Cars of Manufacture whose price is greater than a Certain Ammout: \n");
           for(Car i:obj)
           {
               int n=i.manufactureyear;
               int p=i.price;
               if( (n == 2005) && (p>price))
               {
            	   pen.write("id: "+i.id+"\n make: "+i.make+"\n manufactueyear: "+i.manufactureyear+"\n model: "+i.model+ "\n price:"+i.price+"\n color:"+"\n RegNumber: "+i.regnumber+"\n");                                  
               }
           }  
           pen.close();
           System.out.println("Created List for cars of manufacture year 2005, whose price is greater than 7000!");  
           System.out.println("....................................................");
       } catch (Exception e) {
           System.out.println("Some Error has occured while creating list of cars of manufacture year 2005, whose price is greater than 7000");
       }
       
   }
}