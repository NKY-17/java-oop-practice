/*

Design the Course class to generate the correct output from the driver code provided below:

Course Class:

public class Course{
   public String cName;
   public String code;
   public int credit;
   // Write your code here
}

Driver Code:
public class Tester1{
   public static void main(String[] args) {
       Course c1 = new Course();
       Course c2 = new Course();
       
       System.out.println("========== 1 ==========");
       c1.createCourse("Programming Language I", "CSE110", 3);
       c1.displayCourse();
       
       System.out.println("========== 2 ==========");
       c2.createCourse("Data Structures", "CSE220", 3);
       c2.displayCourse();
       
       System.out.println("========== 3 ==========");
       c1.updateCourse("Programming Language II", "CSE111", 3);
       c1.displayCourse();
   }
}
Output:
========== 1 ==========
Course Name: Programming Language I
Course Code: CSE110
Course Credit: 3
========== 2 ==========
Course Name: Data Structures
Course Code: CSE220
Course Credit: 3
========== 3 ==========
Course Name: Programming Language II
Course Code: CSE111
Course Credit: 3

*/

//Code:
public class Course{
   public String name;
   public String code;
   public int credit;
   public void createCourse(String a,String b,int c){
     name=a;
     code=b;
     credit=c;
   }
   public void displayCourse(){
   System.out.println("Course Name: "+name);
        System.out.println("Course code: "+code);
         System.out.println("Course Credit: " +credit);
}
   public void updateCourse(String a,String b,int c){
     name=a;
     code=b;
     credit=c;
   }
}
