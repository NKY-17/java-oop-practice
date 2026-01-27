/*
Task 7

Complete the “Cat” class so the main method produces the following output:

Test Class:
public class Test7{
    public static void main(String [] args){ 
        Cat c1 = new Cat(); 
        System.out.println("===================");
        c1.printCat();
        c1.color = "Black"; 
        System.out.println("===================");
        c1.printCat(); 
        c1.color = "Brown"; 
        c1.action = "jumping"; 
        System.out.println("===================");
        c1.printCat(); 
    } 
} 
Output:
===================
White cat is sitting 
===================
Black cat is sitting
=================== 
Brown cat is jumping 

*/

//Code:
public class Cat{
  public String color="White";
  public String action="sitting";
  public void printCat(){
    System.out.println(color+" cat is "+action);
  }
}

public class Test7{
    public static void main(String [] args){ 
        Cat c1 = new Cat(); 
        System.out.println("===================");
        c1.printCat();
        c1.color = "Black"; 
        System.out.println("===================");
        c1.printCat(); 
        c1.color = "Brown"; 
        c1.action = "jumping"; 
        System.out.println("===================");
        c1.printCat(); 
    } 
} 
