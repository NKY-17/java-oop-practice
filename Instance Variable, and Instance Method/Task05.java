/*
Create a MagicItem class to provide the expected output. A character will have a name, energy level, and three individual magic items (item1, item2, and item3). 
The name will be assigned inside the newCharacter() method. Whenever a new character is created, they will start with 0 energy and no magic items.
Characters can find and use magic items, each with a specific energy boost. Magic items include "Potion" (+50), "Elixir" (+100), and "Amulet" (+200). 
Characters can use a magic item if they have it, which increases their energy level.

Driver Code:

public class StrangerMagic {
   public static void main(String[] args){
       MagicItem char1 = new MagicItem();
       MagicItem char2 = new MagicItem();


       char1.newCharacter("Eleven");
       char2.newCharacter("Mike Wheeler");

       System.out.println("1 ==========");
       char1.displayInfo();
       System.out.println("2 ==========");
       char2.displayInfo();
       System.out.println("3 ==========");
       char1.findItem("Potion");
       char1.findItem("Elixir");
       char1.findItem("Elixir");
       char2.findItem("Potion");
       System.out.println("4 ==========");
       char1.findItem("Amulet");
       System.out.println("5 ==========");
       char1.displayInfo();
       System.out.println("6 ==========");
       char1.useItem("Potion");
       char1.useItem("Elixir");
       System.out.println("7 ==========");
       char1.displayInfo();
       System.out.println("8 ==========");
       char1.findItem("Amulet");
       System.out.println("9 ==========");
       char1.displayInfo();
       System.out.println("10 ==========");
       char2.useItem("Amulet");
       System.out.println("11 ==========");
       char2.displayInfo();
   }
}
Output:
1 ==========
Character Name: Eleven
Energy Level: 0
Item 1: null
Item 2: null
Item 3: null
2 ==========
Character Name: Mike Wheeler
Energy Level: 0
Item 1: null
Item 2: null
Item 3: null
3 ==========
Eleven found a Potion
Eleven found a Elixir
Eleven found a Elixir
Mike Wheeler found a Potion
4 ==========
All item slots occupied.
5 ==========
Character Name: Eleven
Energy Level: 0
Item 1: Potion
Item 2: Elixir
Item 3: Elixir
6 ==========
Eleven used a Potion
Energy Level after using item: 50
Eleven used a Elixir
Energy Level after using item: 150
7 ==========
Character Name: Eleven
Energy Level: 150
Item 1: null
Item 2: null
Item 3: Elixir
8 ==========
Eleven found a Amulet
9 ==========
Character Name: Eleven
Energy Level: 150
Item 1: Amulet
Item 2: null
Item 3: Elixir
10 ==========
Item not in inventory.
11 ==========
Character Name: Mike Wheeler
Energy Level: 0
Item 1: Potion
Item 2: null
Item 3: null

*/

//Code:

public class MagicItem{
  public String name;
  public int energylevel;
  public String item1;
  public String item2;
  public String item3;
  int c=0;
  public void newCharacter(String n){
    name=n;
  }
  public void displayInfo(){
    System.out.println("Character name: "+name);
    System.out.println("Energy level: "+energylevel);
    System.out.println("Item 1: "+item1);
    System.out.println("Item 2: "+item2);
    System.out.println("Item 3: "+item3);
  }
  public void findItem(String x){
    if(c==0){
      item1=x;
      c++;
     System.out.println(name+" found a "+item1);
    }else if(c==1){
      item2=x;
      c++;
      System.out.println(name+" found a "+item2);
    }else if(c==2){
      item3=x;
      c++;
      System.out.println(name+" found a "+item3);
    }else if(c>=3){
      System.out.println("All item slots occupied.");
      c=0;
  }
  }
  public void useItem(String y){
    if(item1!=y && item2!=y && item3!=y){
      System.out.println("Item not in inventory.");
    }  else{ 
     if(y=="Potion"){
  System.out.println(name+" used a "+y);
  energylevel+=50;
   System.out.println("Energy level after using the item: "+energylevel);
      }else if(y.equals("Elixir")){
  System.out.println(name+" used a "+y);
  energylevel+=100;
   System.out.println("Energy level after using the item: "+energylevel);
       }else if(y.equals("Amulet")){
  System.out.println(name+" used a "+y);
  energylevel+=200;
   System.out.println("Energy level after using the item: "+energylevel);
       }
       if(y=="Portion" || y=="Elixir"||y=="Amulet"){
     item1="null";
   } else if(item2=="Portion" || item2=="Elixir"|| item2=="Amulet"){
     item2="null";
   } else if(item3=="Portion" || item3=="Elixir"|| item3=="Amulet"){
     item3="null";
   }
  }
}
}
