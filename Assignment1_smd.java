/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_ass1;
//import java.io.*; 

import java.io.IOException;


/**
 *
 * @author ZAIN ALI
 */

interface vehicle{

 void number_plate();
 void top_speed();
 void capacity();
 void ac();
}

interface Airplane{
 void tag_number();
 void average_speed();
    
}


abstract class two_tyre_vehicle{
    
static String type="none";
two_tyre_vehicle(){
    System.out.println("two_tyre_vehicle contructor called");
    }

two_tyre_vehicle(String a) {
    type=a;
    }

   abstract public void vehicl_name();
   abstract public void vehicl_category();
   
   
   
   // non abstract method body
    void vehicle_type(){
        
        System.out.println("The vehicle typpe is  " + type);
    };
    
    
}



class bike extends two_tyre_vehicle  {
static String model_no="none";
    int gears=4;
// default constructor claled
    bike(){
        super("bullet");
    System.out.println("Bike's constructor called");
    
    }
    
    static class static_nested{
      // try{
    
        int x=0;
        void print(){
        System.out.println("The model of bike is " + model_no);
        }
        
        //}
        //catch(){}
    }
        
        class non_static_nested{
        void print() 
        {
            try{
            int z=gears;
        System.out.println("The bike has  number of gears "+ z);
        }
            //handling exceptions
            catch(ArithmeticException aa){
                System.out.println("Arithmatic exception found ");        
            }
            catch(NullPointerException n){
                System.out.println("Null pointer exception found");        
            
            }
            
        }
        
    }
    
    
    
    
    
    
    ////overloadedd constructor called
    bike(String a){
        super("bullet");
    System.out.println("Bike's constructor called");
    model_no=a;
    }
    
//if(bike.type="bullet"){
@Override
public void vehicl_name(){
System.out.println("The vehicle name is   "+ two_tyre_vehicle.type);
}


@Override
public void vehicl_category(){
    
    if(two_tyre_vehicle.type .equalsIgnoreCase("bike") ) 
    {
        System.out.println("The Bullet's name is   "+ "Harley Davidson");
    }
}
}        
        



class truck implements vehicle
{
    
    int capacty=0;
    String category;
    truck(){
        category = "none";
        capacty=0;
        System.out.println("Constructor of Truck called");
    
}
truck(int a ,String b){
    try{
        String abc=null;
        category = b;
        capacty=a;
        System.out.println("The vehicle category is  "+ category);
    }
    catch(NullPointerException n){
     System.out.println("Null Exception thrown");
    }
    catch(IllegalArgumentException e)
    {
        System.out.println("Exception thrown");
    }
   

}
    @Override
    public void number_plate(){

    System.out.println("The number plate is ABC123" );
}
    @Override
  public void top_speed(){
    System.out.println("The top speed is 100kmph");
}
    @Override
    public void capacity(){
    System.out.println("The capacity is "+ capacty);
}

    @Override
    public void ac(){
    System.out.println("The vehicle is not AC supported");
}
    
    
}



class rikshaw implements vehicle
{
    int capacty=0;
    String category;
    rikshaw() throws IOException{
        try{
        category = "none";
        capacty=0;
        System.out.println("Default Constructor of rikshaw called");
        throw new IOException("ioexception");
        }
        catch(IOException ex){}
        System.out.println("IO Exception found");
        }
rikshaw(int a ,String b) {
           category = b;
        capacty=a;
        System.out.println("The vehicle type is   " + category);
        
}
        
    @Override
    public void number_plate(){

    System.out.println("The number plate is ASD452" );
}
    @Override
  public void top_speed(){
    System.out.println("The top speed is 80kmph");
}
    @Override
    public void capacity(){
    System.out.println("The capacity is "+ capacty);
}

    @Override
    public void ac(){
    System.out.println("The vehicle is NOT AC supported");
}
}














class car implements vehicle
{
    int capacty=0;
    String category;
    car(){
        category = "none";
        capacty=0;
        System.out.println("Constructor of Car called");
    }
car(int a ,String b){
    try{
        category = b;
        capacty=a;
        System.out.println("The vehicle type is   " + category);
    }
      catch(NullPointerException n){
     System.out.println("Null Exception thrown in car cons");
    }
    catch(IllegalArgumentException e)
    {
        System.out.println("Exception thrown in car constructor");
    }
}

    @Override
    public void number_plate(){

    System.out.println("The number plate is XYZ125" );
}
    @Override
  public void top_speed(){
    System.out.println("The top speed is 200kmph");
}
    @Override
    public void capacity(){
    System.out.println("The capacity is "+ capacty);
}

    @Override
    public void ac(){
    System.out.println("The vehicle is AC supported");
}
}



 class HTV implements vehicle,Airplane 
 {

HTV(){System.out.println("Htv constructor called");}


HTV(int a,String b){
    
try{
    int cap=a;   
    String cate=b;
    
    System.out.println("Htv multiple interface constructor called");
}

  catch(NullPointerException n){
     System.out.println("Null Exception thrown");
    }
    catch(IllegalArgumentException e)
    {
        System.out.println("Exception thrown");
    }

}

@Override
public void number_plate(){
System.out.println("The number plate is LKJ789");
}

@Override
public void ac(){
System.out.println("The Transportation type is AC supported");
}


@Override
public void capacity(){
System.out.println("The Transportation type is AC supported");
}

@Override
public void top_speed(){
System.out.println("The TOp speed is 1000");
}

@Override
public void average_speed(){
System.out.println("The Airplane's average speed is 500kmph");
}


@Override
public void tag_number(){
System.out.println("The Aeroplane tag number is PK-777");
}

}













/*

class ac implements home

    @Override
    public ac() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void heater() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reefrigrator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
(){

}

*/



public class Smd_ass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    vehicle obj=new truck(250,"HTV_vehicle");
    obj.number_plate();
    obj.top_speed();
    obj.capacity();
    obj.ac();
   
    System.out.println("       ");
    vehicle obj2=new car(150,"LTV_vehicle");
    obj2.number_plate();
    obj2.top_speed();
    obj2.capacity();
    obj2.ac();

    System.out.println("       "); 
    vehicle obj3=new rikshaw(100,"LTV_vehicle");
    obj3.number_plate();
    obj3.top_speed();
    obj3.capacity();
   System.out.println("       "); 
    
   HTV obj4=new HTV();
   obj4.average_speed();
   obj4.tag_number();
  
    System.out.println("       "); 
    System.out.println("From abstract class"); 
   
    bike b=new bike("Bullet"); 
   b.vehicl_category();
   b.vehicl_name();
   
   System.out.println("       "); 
    System.out.println("From static nested class:"); 
   
   // From static nested class
   bike.static_nested obbj= new bike.static_nested();
   obbj.print();
   
   System.out.println("       "); 
   System.out.println("From inner class:"); 


// From nested inner class
   
   bike abc= new bike();
   bike.non_static_nested x= abc.new non_static_nested();
   x.print();
   
    }
    
}
