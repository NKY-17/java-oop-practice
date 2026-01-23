/*
Let’s consider the following piecewise function:

Write a Java code of a program that takes the value of x as user input and then displays the output based on the given piecewise function.

Sample Input: -3
Output: -6
Sample Input: 1
Output: 2
Sample Input: 4
Output: 15
Sample Input: 10
Output: 302
*/
Code:
import java.util.Scanner;
public class task11{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
             int x=sc.nextInt();
               if(x<0){
    System.out.println(2*x);
      }
       else if(x>=0 && x<2){
        System.out.println(x+1);
      }
       else if(x>=2 && x<5){
      System.out.println((x*x)-1);
       }
else{
         System.out.println(3*(x*x)+2);
         }
  }
}
