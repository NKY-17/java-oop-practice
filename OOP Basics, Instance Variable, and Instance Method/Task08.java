/*
Complete the Bird class so that main method produces the following output:

Test class:
public class Test8{
    public static void main(String args[]) { 
        Bird b1 = new Bird();
        b1.name = "Parrot";
        b1.flyUp(3);
        b1.makeNoise();
        b1.flyDown(5);
        b1.flyDown(2);
        b1.flyDown(1);
        Bird b2 = new Bird();
        b2.name = "Eagle"; 
        b2.flyUp(5);
        b2.flyDown(5);
        b2.makeNoise(); 
    }  
}
Output:
Parrot has flown up 3 feet.
Squawk
Parrot cannot fly down 5 feet.
Parrot has flown down 2 feet.
Parrot has flown down 1 feet and landed.
Eagle has flown up 5 feet.
Eagle has flown down 5 feet and landed.
Squee
*/

//code;
public class Bird{
  public String name;
    public void flyUp(int n){
    if(name.equals("Parrot")){
   System.out.println(name+" has flown up "+n+" feet.");
    }
    else{
      System.out.println(name+" has flown up "+n+" feet.");
    }
  }
  public void makeNoise(){
    if(name.equals("Parrot")){
    System.out.println("Squawk");
  }
    else{
      System.out.println("Squee");
    }
  }
  public void flyDown(int x){
    if(name.equals("Parrot")){ 
      if(x==1){
   System.out.println(name+" has flown down "+x+" feet and landed.");
    }else if(x<5 && x!=1){
   System.out.println(name+" has flown down "+x+" feet.");
    }
    else{
      System.out.println(name+" cannot fly down "+x+" feet.");
    }
    }else{
       System.out.println(name+" has flown down "+x+" feet and landed.");
    }
  }
}

public class Test8{
    public static void main(String args[]) { 
        Bird b1 = new Bird();
        b1.name = "Parrot";
        b1.flyUp(3);
        b1.makeNoise();
        b1.flyDown(5);
        b1.flyDown(2);
        b1.flyDown(1);
        Bird b2 = new Bird();
        b2.name = "Eagle"; 
        b2.flyUp(5);
        b2.flyDown(5);
        b2.makeNoise(); 
    }  
}
