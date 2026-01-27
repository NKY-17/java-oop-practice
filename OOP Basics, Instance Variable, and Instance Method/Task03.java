/*
Design the “Student” class so that the main method prints the following:

Tester Class:
public class Test3{
   public static void main(String [] args){
      Student s1 = new Student();
      System.out.println("Name of the Student: "+s1.name);
      System.out.println("ID of the Student: "+s1.id);
      s1.id = 123;
      System.out.println("ID of the Student: "+s1.id);
   }
}
Output:
Name of the Student: Bob
ID of the Student: 1
ID of the Student: 123

*/

//Code;
public class Student{
  public String name="Bob";
  public int id=1;
}

public class Test3{
   public static void main(String [] args){
      Student s1 = new Student();
      System.out.println("Name of the Student: "+s1.name);
      System.out.println("ID of the Student: "+s1.id);
      s1.id = 123;
      System.out.println("ID of the Student: "+s1.id);
   }
}
