/*
You are building a ride booking app called UberApp. Using this app, a customer can book 3 rides. 
BookRide(Location, Distance) method books rides for a user and prints the fare for that ride based on the distance. After booking the ride, fare will be calculated as below: 
Fare = 30 * distance
A person can change the location of their last booked ride using changeLocation(Location, Distance) method. The new fare is calculated as;
Fare = 30 * distance + 20% of new Fare. i.g. If, new Fare = 210, then the total fare after changing location will be 210 + 210 * 0.2 = 252
The UberApp keeps track of all the locations visited by the user in an array of String.
The resetMonth() method resets the location visited in a month as well as the number of remaining rides of that month.

Design the UberApp class that will produce the following output.
Driver Code:
public class AppTester {
   public static void main(String args[]){
       
       UberApp account1 = new UberApp();
       UberApp account2 = new UberApp();
       
       account1.createProfile("Jonas Kahnwald", 24, "017111111111");
       account2.createProfile("Martha Nielsen", 28, "018111111111");
       
       account1.showProfile();
       System.out.println("===== 1 ====");
       System.out.println("You have "+ account1.remainingRides() +" ride(s) remaining.");
       
       System.out.println("==== 2 ====");
       account2.showProfile();
       System.out.println("You have "+ account2.remainingRides() +" ride(s) remaining.");
       
       System.out.println("==== 3 ====");
       account1.bookRide("Merul Badda", 12.0);
       
       System.out.println("==== 4 ====");
       account1.bookRide("Dhanmondi 27", 4.3);
       account1.changeLocation("Wari", 5.6);
       
       System.out.println("==== 5 ====");
       account1.ridingHistory();
       
       System.out.println("==== 6 ====");
       account2.ridingHistory();
       
       System.out.println("==== 7 ====");
       account1.bookRide("Banani 11", 6.8);
       account1.bookRide("Gulshan 1", 2.1);
       
       System.out.println("==== 8 ====");
       account1.resetMonth();
       account1.bookRide("Gulshan 1", 2.1);
       account1.ridingHistory();
       System.out.println("You have "+ account1.remainingRides() +" ride(s) remaining.");
   }
}
Output:
Hello! This is your Profile:
Full Name: Jonas Kahnwald
Age: 24
Phone Number: 017111111111
===== 1 ====
You have 3 ride(s) remaining.
==== 2 ====
Hello! This is your Profile:
Full Name: Martha Nielsen
Age: 28
Phone Number: 018111111111
You have 3 ride(s) remaining.
==== 3 ====
Jonas Kahnwald has booked a ride!
Destination: Merul Badda
Fare: 360.0 Taka
==== 4 ====
Jonas Kahnwald has booked a ride!
Destination: Dhanmondi 27
Fare: 129.0 Taka
Jonas Kahnwald has changed the destination of his current ride to Wari
New fare after adding 20% change fees: 201.6 Taka.
==== 5 ====
Jonas Kahnwald, you have visited Merul Badda, Wari this month.
==== 6 ====
Martha Nielsen, you haven't visited anywhere this month.
==== 7 ====
Jonas Kahnwald has booked a ride!
Destination: Banani 11
Fare: 204.0 Taka
Jonas Kahnwald, please update your plan to premium or wait till next month!
==== 8 ====
Jonas Kahnwald has booked a ride!
Destination: Gulshan 1
Fare: 63.0 Taka
Jonas Kahnwald, you have visited Gulshan 1 this month.
You have 2 ride(s) remaining.
*/

//Code:
 public class UberApp{
    public String name;
    public int age;
    public String phonenum;
    public int remainingrides=3;
    String [] location=new String[3];
    int c=0;
    public void createProfile(String n,int a,String num){
      name=n;
      age=a;
     phonenum=num;
    }
    public void showProfile(){
      System.out.println("Hello! This is your Profile:");
      System.out.println("Full Name: "+name);
      System.out.println("Age: "+age);
      System.out.println("Phone Number: "+phonenum);
    }
    public int remainingRides(){
      return remainingrides;
    }
    public void bookRide(String x,double y){
      if(remainingrides>0){
      double fare=30*y;
      location[c]=x;
      System.out.println(name+" has booked a ride!");
      System.out.println("Destination: "+x);
      System.out.println("Fare: "+fare+" Taka");
      remainingrides--;
      c++;
      }else{
        System.out.println(name+", please update your plan to premium or wait till next month!");
      }
    }
    public void changeLocation(String x,double y){
      double newfare=30*y;
      double changefee=newfare+(newfare*0.2);
      location[c-1]=x;
      System.out.println(name+" has changed the destination of his current ride to "+x);
      System.out.println("New fare after adding 20% change fees: "+changefee+" Taka");
    }
    public void ridingHistory(){
      if(c==0){
        System.out.println(name+", you haven't visited anywhere this month.");
      }else{
      System.out.print(name+", you have visited ");
      for(int i=0;i<c;i++){
        System.out.print(location[i]);
        if(i<c-1){
          System.out.print(", ");
        }
      }
      System.out.println(" this month");
      }
    }
    public void resetMonth(){
      remainingrides=3;
      location=new String[3];
      c=0;
    }
 }
       



