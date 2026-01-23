/*Write a Java program that takes the CGPA and no of credits completed by a student and prints whether the student is eligible for a waiver and of what percentage.
To be eligible for a waiver, a student must have completed at least 30 credits and earned a CGPA greater or equal to 3.8. If not, please print "The student is not eligible for a waiver".

CGPA:
3.80 - 3.89
Waiver percentage:
25 percent
CGPA:
3.90 - 3.94
Waiver percentage:
50 percent
CGPA:
3.95 - 3.99
Waiver percentage:
75 percent
CGPA:
4.00
Waiver percentage:
100 percent
Now let’s look at the samples.
Sample Input: 
3.93
78
Output: The student is eligible for a waiver of 50 percent
Sample Input: 
3.79
24
Output:
The student is not eligible for a waiver
*/
Code:
import java.util.Scanner;
public class task9{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        double CGPA=sc.nextDouble();
        int credits=sc.nextInt();
              if(credits>=30 && CGPA>=3.80){
                if(CGPA>=3.80 && CGPA<=3.89){
    System.out.println("The student is eligible for a waiver of 25 percent");
      }
       else if(CGPA>=3.90 && CGPA<=3.94){
        System.out.println("The student is eligible for a waiver of 50 percent");
      }
 else if(CGPA>=3.95 && CGPA<=3.99){
      System.out.println("The student is eligible for a waiver of 75 percent");
       }
       else if(CGPA==4.00){
      System.out.println("The student is eligible for a waiver of 100 percent");
       }
              }
         else{
         System.out.println("The student is not eligible for a waiver");
}
  }
}


