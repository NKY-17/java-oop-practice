/*
Implement the “Course” class with necessary properties, so that the given output is produced for the provided driver code.
[Note: Each course can have at max 4 contents in its syllabus]

Driver Class:

public class CourseTester{
  public static void main(String [] args){
    Course c1 = new Course();
    c1.createCourse("PL II", "CS11");
    System.out.println("--------1--------");
    c1.printDetails();
    System.out.println("--------2--------");
    c1.addOneContent("Overloading");
    c1.printDetails();
    System.out.println("--------3--------");
    c1.addOneContent("Encapsulation");
    c1.addTwoContent("Static", "Polymorphism");
    c1.printDetails();
    System.out.println("--------4--------");
    c1.addOneContent("Inheritance");
    System.out.println("--------5--------");
    Course c2 = new Course();
    c2.createCourse("DS", "CS22");
    c2.addOneContent("Stack");
    c2.addTwoContent("Recursion","Tree");
    c2.addTwoContent("Heap","Hashing");
    System.out.println("--------6--------");
    c2.printDetails();
  }
}

Output:
--------1--------
Course details:
Course Name: PL II
Course Code: CS11
Course Syllabus: 
No content yet.
--------2--------
Overloading was added.
Course details:
Course Name: PL II
Course Code: CS11
Course Syllabus: 
Overloading
--------3--------
Encapsulation was added.
Static was added.
Polymorphism was added.
Course details:
Course Name: PL II
Course Code: CS11
Course Syllabus: 
Overloading, Encapsulation, Static, Polymorphism
--------4--------
Cannot add more content
--------5--------
Stack was added.
Recursion was added.
Tree was added.
Heap was added.
Cannot add more content
--------6--------
Course details:
Course Name: DS
Course Code: CS22
Course Syllabus: 
Stack, Recursion, Tree, Heap
*/
//Code:
public class Course{
public String name;
public String code;
public String []syllabus=new String[4];
public int content=0;
public void createCourse(String x,String y){
 name=x;
 code=y;
}
public void printDetails(){
 System.out.println("Course details: ");
 System.out.println("Course Name: "+name);
 System.out.println("Course Code: "+code);
 System.out.println("Course Syllabus:");
 if(content==0){
 System.out.println("No content yet");
 }else{
   for(int i=0;i<content;i++){
     System.out.print(syllabus[i]);
     if(i<content-1){
       System.out.print(", ");
     }
 }
 System.out.println();
 }
}
public void addOneContent(String x){
  if(content<=3){
    syllabus[content]=x;
    content++;
    System.out.println(x+" was added.");
  }else{
    System.out.println("Cannot add more content");
  }
}
public void addTwoContent(String x,String y){
  if(content<=3){
     syllabus[content]=x;
    content++;
    System.out.println(x+" was added.");
  }if(content<=3){
     syllabus[content]=y;
    content++;
    System.out.println(y+" was added.");
  }else{
    System.out.println("Cannot add more content");
  }
 }
}
