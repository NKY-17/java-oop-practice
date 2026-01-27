/*
You are given the following “University” class: 

public class University{
    public String name;
    public String country;
}

Now write a Java tester class named “UniversityTester”.

a) Write the main method and create 2 objects of University class and print the location of the objects and print the instance variables of the objects. Are the location of the objects the same? 

b) Now change the instance variables of the first object.
 name =  “Imperial College London”
 country = “England”

Now change the instance variables of the second object.
	name =  “Brac University”
country = “Bangladesh”

Now check if the instance variables of both objects have changed or not and whether the instance variables of both objects are of the same value or not.

*/

//code:
a)

public class University{
  public String name;
  public String country;
}

public class UniversityTester{
  public static void main(String[]args){
    University n1=new University();
     University c1=new University();
     System.out.println(n1);
     System.out.println(c1);
     System.out.println(n1.name);
     System.out.println(c1.country);
  }
}
b)
public class UniversityTester{
  public static void main(String[]args){
    University n1=new University();
     University c1=new University();
      University n2=new University();
     University c2=new University();
     n1.name="Imperial College London";
     c1.country="England";
     System.out.println(n1.name);
     System.out.println(c1.country);
      n2.name="Brac University";
      c2.country="Bangladesh";
      System.out.println(n2.name);
     System.out.println(c2.country);
      }
}
