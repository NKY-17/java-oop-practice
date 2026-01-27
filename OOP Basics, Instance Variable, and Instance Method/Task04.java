/*
Write the code in java for the “Vehicle” class. The tester class and the output is given below:
Tester class:
public class Tester4{
   public static void main(String [] args){ 
      Vehicle car = new Vehicle();
      System.out.println("Attributes of car object:");
      System.out.println(car.type);
      System.out.println(car.wheels);
      System.out.println(car.color);
      System.out.println("=========");
      Vehicle bike = new Vehicle();
      bike.type="Motor bike";
      bike.wheels=2;
      bike.color="Red";
      System.out.println("Attributes of bike object:");
      System.out.println(bike.type);
      System.out.println(bike.wheels);
      System.out.println(bike.color);
    }
}
Output:
Attributes of car object:
Car
4
White
=========
Attributes of bike object:
Motor bike
2
Red

*/

//code:
public class Vehicle{
  public String type="Car";
  public int wheels=4;
  public String color="White";
}

public class Tester4{
   public static void main(String [] args){ 
      Vehicle car = new Vehicle();
      System.out.println("Attributes of car object:");
      System.out.println(car.type);
      System.out.println(car.wheels);
      System.out.println(car.color);
      System.out.println("=========");
      Vehicle bike = new Vehicle();
      bike.type="Motor bike";
      bike.wheels=2;
      bike.color="Red";
      System.out.println("Attributes of bike object:");
      System.out.println(bike.type);
      System.out.println(bike.wheels);
      System.out.println(bike.color);
    }
}
