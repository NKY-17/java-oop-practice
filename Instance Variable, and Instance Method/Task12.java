/*
Implement the “ChickenBurger” class with necessary properties, so that the given output is produced for the provided driver code.
[Note: 
1. There are four available spice levels: Mild, Spicy, Naga and Extreme. You can store these values in a String array.
2. You might need to use the .equals() method to compare two string values.]

Driver Class:

public class BurgerMaker{
  public static void main(String [] args){
     ChickenBurger b1 = new ChickenBurger();
     System.out.println(b1.bun);
     System.out.println(b1.price);
     System.out.println(b1.sauceOption);
     System.out.println(b1.spiceLevel);
     System.out.println("----------1----------");
     System.out.println(b1.serveBurger());
     System.out.println("----------2----------");
     b1.customizeSpiceLevel("Extreme Jhaal");
     b1.customizeSpiceLevel("Spicy");
     System.out.println("----------3----------");
     System.out.println(b1.serveBurger());
     System.out.println("----------4----------");
     ChickenBurger b2 = new ChickenBurger();
     b2.bun = "Brioche";
     b2.price += 50;
     b2.sauceOption = "Regular";
     b2.customizeSpiceLevel("Naga");
     System.out.println("----------5----------");
     System.out.println(b2.serveBurger());
  }
}
Output:
Sesame
200
Less
Not Set
----------1----------
Cannot serve now. Customize Spice Level first.
----------2----------
This spice level is unavailable.
Spice level set to Spicy.
----------3----------
The burger is being served:-
Bun Type: Sesame
Price: 200
Sauce Option: Less
Spice Level: Spicy
----------4----------
Spice level set to Naga.
----------5----------
The burger is being served:-
Bun Type: Brioche
Price: 250
Sauce Option: Regular
Spice Level: Naga

*/

//Code:
public class ChickenBurger{
public String bun;
public int price;
public String sauceOption;
public String spiceLevel;
public String [] availablelevel={"Mild","Spicy","Naga","Extreme"};
public ChickenBurger(){
  bun="Sesame";
  price=200;
  sauceOption="Less";
  spiceLevel="Not set";
}
public String serveBurger(){
  if(spiceLevel.equals("Not set")){
  return "Cannot serve now. Customize Spice Level first.";
  }else{
    System.out.println("The burger is being served:-");
    System.out.println("Bun Type: "+bun);
    System.out.println("Price: "+price);
    System.out.println("Sauce Option: "+sauceOption); 
  return "Spice Level: "+spiceLevel; 
  }
}
public void customizeSpiceLevel(String x){
  int c=0;
    for(int i=0;i<availablelevel.length;i++){
    if(availablelevel[i].equals(x)){
           spiceLevel=x;
           c++;
    }
    }
    if(c>0){
      System.out.println("Spice level set to "+x);
      c=0;
    }
    else{
      System.out.println("This spice level is unavailable.");
      }
}
}
