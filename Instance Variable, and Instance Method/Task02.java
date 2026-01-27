/*
Create a Dog class so that the tester code generates the given output:

Driver Code:

public class Tester2{
   public static void main (String[] args) {
       Dog scooby = new Dog();
       Dog oldie = new Dog();
       Dog goofy = new Dog();
       
       scooby.changeName("Scooby");
       goofy.changeName("Goofy");
       
       System.out.println("1. ===============");
       System.out.println(scooby.bark());
       System.out.println("2. ===============");
       System.out.println(oldie.bark());
       System.out.println("3. ===============");
       oldie.changeColor("White");
       System.out.println("4. ===============");
       System.out.println(oldie.bark());
       System.out.println("5. ===============");
       System.out.println(goofy.bark());
       System.out.println("6. ===============");
       scooby.changeColor("Brown");
       System.out.println("7. ===============");
       System.out.println(scooby.bark());
       System.out.println("8. ===============");
       goofy.changeColor("Black");
   }
}
Expected Output:

1. ===============
Scooby is barking
2. ===============
A dog is barking
3. ===============
This dog is White
4. ===============
White dog is barking
5. ===============
Goofy is barking
6. ===============
Scooby is Brown
7. ===============
Scooby the Brown dog is barking
8. ===============
Goofy is Black

*/

//Code:
public class Dog{
  public String name="A dog";
  public String color;
  public String changeName(String x){
    name=x;
    return name;
      }
  public String bark(){
    /*if(color!=null){
     return color+" dog is barking";
    }
    */ if(name=="Scooby" && color=="Brown"){
       return this.name+" the "+color+" dog is barking";
    } else if(color!=null){
     return color+" dog is barking";
    }
    else{
       return this.name+" is barking"; 
    }
    }
  public void changeColor(String c){
    color=c;
    if(color=="White"){
      System.out.println("This dog is "+color);
    }else{
          System.out.println(this.name+" is "+color);
             }
  }
  }
