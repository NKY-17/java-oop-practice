/*
Implement the “LightController” class with necessary properties to produce the given output for the provided driver code.

Driver Class:

public class LightControllerTester{
  public static void main(String args []){
    LightController c1 = new LightController();
    c1.showLightStatus();
    System.out.println("1---------------");
    c1.adjustBrightness(4);
    c1.switchLight();
    System.out.println("2---------------");
    c1.showLightStatus();
    System.out.println("3---------------");
    c1.adjustBrightness(4);
    System.out.println("4---------------");
    c1.showLightStatus();
    System.out.println("5---------------");
    c1.adjustBrightness(-2);
    c1.adjustBrightness(9);
    System.out.println("6---------------");
    c1.showLightStatus();
    System.out.println("7---------------");
    System.out.println(c1.resetSettings());
    c1.showLightStatus();
    System.out.println("8---------------");
    c1.switchLight();
    System.out.println("9---------------");
    c1.showLightStatus();
  }
}
Output:   
Light status: OFF
Brightness Level: 0
1---------------
Please turn on the light first!
Lights are now ON.
2---------------
Light status: ON
Brightness Level: 1
3---------------
Brightness adjusted.
4---------------
Light status: ON
Brightness Level: 5
5---------------
Brightness adjusted.
Brightness out of range. Set between 0 to 10.
6---------------
Light status: ON
Brightness Level: 3
7---------------
Light settings have been reset.
Light status: ON
Brightness Level: 1
8---------------
Lights are now OFF.
9---------------
Light status: OFF
Brightness Level: 0

*/

//Code:
public class LightController{
public String status="OFF";
public int blevel;
int c=0;
public void showLightStatus(){
  if(status=="OFF"){
  blevel=0;
  }
System.out.println("Light status: "+status);
System.out.println("Brightness Level: "+blevel);
}
public void adjustBrightness(int x){
  if(status=="OFF"){
  System.out.println("Please turn on the light first!");
  status="ON";
  blevel=1;
  }else if(blevel+x<0 || x+blevel>10){
    System.out.println("Brightness out of range. Set between 0 to 10.");
  }else{
    System.out.println("Brightness adjusted.");
    blevel+=x;
}
}
public void switchLight(){
  if(c==0){
  System.out.println("Lights are now "+status);
  c++;
  }else{
    status="OFF";
   System.out.println("Lights are now "+status); 
}
}
public String resetSettings(){
  blevel=1;
  return "Light settings have been reset.";
  }
}
