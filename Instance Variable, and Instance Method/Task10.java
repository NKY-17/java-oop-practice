/*
Implement the “Assignment” class with necessary properties, so that the given output is produced for the provided driver code.

Driver Class:

public class AssignmentTester{
  public static void main(String [] args){
    Assignment as1 = new Assignment();
    as1.printDetails();
    System.out.println("1---------------");
    as1.tasks = 11;
    as1.difficulty = "Moderate";
    as1.submission = true;
    as1.printDetails();
    System.out.println("2---------------");
    as1.makeOptional();
    System.out.println("3---------------");
    as1.printDetails();
    System.out.println("4---------------");
    Assignment as2 = new Assignment();
    as2.tasks = 12;
    as2.difficulty = "Hard";
    as2.submission = false;
    as2.printDetails();
    System.out.println("5---------------");
    as2.makeOptional();
  }
}
Output:
Number of tasks: 0
Difficulty level: null
Submission required: false
1---------------
Number of tasks: 11
Difficulty level: Moderate
Submission required: true
2---------------
Assignment will not require submission
3---------------
Number of tasks: 11
Difficulty level: Moderate
Submission required: false
4---------------
Number of tasks: 12
Difficulty level: Hard
Submission required: false
5---------------
Submission is already not required
 */

//code:
public class Assignment{
public int tasks=0;
public String difficulty;
public boolean submission=false;
int count=0;
public void printDetails(){
System.out.println("Number of tasks: "+tasks);
System.out.println("Difficulty level: "+difficulty);
System.out.println("Submission required: "+submission);  
}
public void makeOptional(){
   if(submission==false){
    System.out.println("Submission is already not required");
   }else{
    System.out.println("Assignment will not require submission");
    submission=false;
      }
}
}



